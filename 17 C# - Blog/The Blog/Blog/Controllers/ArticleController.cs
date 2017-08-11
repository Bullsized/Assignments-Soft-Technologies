using Blog.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using System.Data.Entity;
using System.Net;
using Microsoft.AspNet.Identity;

namespace Blog.Controllers
{
    public class ArticleController : Controller
    {
        // GET: Article
        public ActionResult Index()
        {
            using (var db = new BlogDbContext())
            {
                var articles = db.Articles.Include(a => a.Author).ToList();
                return View(articles);
            }
        }

        //
        //GET: Article/Details
        public ActionResult Details(int? id)
        {
            using (var db = new BlogDbContext())
            {
                var article = db.Articles
                    .Include(a => a.Author)
                    .Where(a => a.Id == id)
                    .FirstOrDefault();

                if (id == null)
                {
                    return HttpNotFound();
                }

                return View(article);
            }
        }

        //
        //GET: Articles/Create
        [Authorize]
        [HttpGet]
        public ActionResult Create()
        {
            return View();
        }

        //
        //POST: Article/Create
        [Authorize]
        [HttpPost]
        public ActionResult Create(Article article)
        {
            if (ModelState.IsValid)
            {
                using (var db = new BlogDbContext())
                {
                    var currentUser = this.User.Identity.GetUserId();

                    article.AuthorId = currentUser;

                    db.Articles.Add(article);
                    db.SaveChanges();
                }

                return RedirectToAction("Index");
            }

            return View(article);
        }

        //
        //DELETE the article
        [Authorize]
        [HttpGet]
        public ActionResult Delete(int id)
        {
            using (var db = new BlogDbContext())
            {
                var article = db.Articles
                    .Where(a => a.Id == id)
                    .FirstOrDefault();

                if (article == null || !IsAuthorized(article))
                {
                    return HttpNotFound();
                }

                return View(article);
            }
        }

        //
        //DELETE
        [Authorize]
        [ActionName("Delete")]
        [HttpPost]
        public ActionResult ConfirmDelete(int id)
        {
            using (var db = new BlogDbContext())
            {
                var article = db.Articles
                    .Where(a => a.Id == id)
                    .FirstOrDefault();

                if (article == null || !IsAuthorized(article))
                {
                    return HttpNotFound();
                }

                db.Articles.Remove(article);
                db.SaveChanges();

                return RedirectToAction("Index");
            }
        }

        //
        //EDIT 
        [Authorize]
        [HttpGet]
        public ActionResult Edit(int id)
        {
            using (var db = new BlogDbContext())
            {
                var article = db.Articles.Find(id);

                if (article == null || !IsAuthorized(article))
                {
                    return HttpNotFound();
                }

                var articleViewModel = new ArticleViewModel
                {
                    Id = article.Id,
                    Title = article.Title,
                    Description = article.Description,
                    AuthorId = article.AuthorId
                };

                return View(articleViewModel);
            }
        }

        [Authorize]
        [HttpPost]
        public ActionResult Edit(ArticleViewModel model)
        {
            if (ModelState.IsValid)
            {
                using (var db = new BlogDbContext())
                {
                    var article = db.Articles.Find(model.Id);

                    if (article == null || !IsAuthorized(article))
                    {
                        return HttpNotFound();
                    }

                    article.Title = model.Title;
                    article.Description = model.Description;

                    db.SaveChanges();
                }
            }
            return RedirectToAction("Details", new { id = model.Id });
        }

        //
        //Is the author admin
        private bool IsAuthorized(Article article)
        {
            var isAdmin = this.User.IsInRole("Admin");
            var isAuthor = article.IsAuthor(this.User.Identity.GetUserId());

            return isAdmin || isAuthor;
        }
    }
}