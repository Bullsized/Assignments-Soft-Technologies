using BookLibrary.Models;
using System.Data.Entity;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using Microsoft.AspNet.Identity;

namespace BookLibrary.Controllers
{
    public class BookController : Controller
    {
        // GET: Book
        public ActionResult Index()
        {
            using (var db = new ApplicationDbContext())
            {
                var books = db.Books.Include(b => b.Author).ToList();

                return View(books);
            }

        }

        // GET: Book/Details/5
        public ActionResult Details(int id)
        {
            using (var db = new ApplicationDbContext())
            {
                var details = db.Books.Include(b => b.Author).SingleOrDefault(b => b.Id == id);
                if (details == null)
                {
                    return new HttpNotFoundResult("Cannot find book");
                }

                return View(details);
            }

        }

        // GET: Book/Create
        [Authorize]
        public ActionResult Create()
        {
            return View();
        }

        // POST: Book/Create
        [HttpPost]
        [ValidateAntiForgeryToken]
        [Authorize]
        public ActionResult Create(Book book)
        {
            using (var db = new ApplicationDbContext())
            {
                var userId = User.Identity.GetUserId();

                book.AuthorId = userId;

                db.Books.Add(book);
                db.SaveChanges();

                return RedirectToAction("Index");
            }

        }

        // GET: Book/Edit/5
        [Authorize]
        public ActionResult Edit(int id)
        {
            using (var db = new ApplicationDbContext())
            {
                var book = db.Books.SingleOrDefault(b => b.Id == id);
                if (book == null)
                {
                    return new HttpNotFoundResult("Cannot find book");
                }

                var autorizedUser = User.Identity.GetUserId();
                if (book.AuthorId != autorizedUser)
                {
                    return new HttpNotFoundResult("You are not authorized to edit this book, moi");
                }

                return View(book);
            }
        }

        // POST: Book/Edit/5
        [HttpPost]
        [Authorize]
        public ActionResult Edit(int id, Book bookViewModel)
        {
            if (bookViewModel.Title == null || bookViewModel.Description == null)
            {
                return View(bookViewModel);
            }

            using (var db = new ApplicationDbContext())
            {
                var book = db.Books.Include(b => b.Author).SingleOrDefault(b => b.Id == id);
                if (book == null)
                {
                    return new HttpNotFoundResult("Cannot find book");
                }

                var autorizedUser = User.Identity.GetUserId();
                if (book.AuthorId != autorizedUser)
                {
                    return new HttpNotFoundResult("You are not authorized to edit this book, moi");
                }

                book.Title = bookViewModel.Title;
                book.Description = bookViewModel.Description;
                db.SaveChanges();

                return RedirectToAction("Details", new { id = id });
            }

        }

        // GET: Book/Delete/5
        [Authorize]
        public ActionResult Delete(int id)
        {
            using (var db = new ApplicationDbContext())
            {
                var book = db.Books.Include(b => b.Author).SingleOrDefault(b => b.Id == id);
                if (book == null)
                {
                    return new HttpNotFoundResult("Cannot find book");
                }

                var autorizedUser = User.Identity.GetUserId();
                if (book.AuthorId != autorizedUser)
                {
                    return new HttpNotFoundResult("You are not authorized to delete this book, moi");
                }

                return View(book);
            }
        }

        // POST: Book/Delete/5
        [HttpPost]
        [Authorize]
        [ValidateAntiForgeryToken]
        public ActionResult Delete(int id, Book bookViewModel)
        {
            using (var db = new ApplicationDbContext())
            {
                var book = db.Books.SingleOrDefault(b => b.Id == id);

                if (book == null)
                {
                    return new HttpNotFoundResult("Cannot find book");
                }

                var autorizedUser = User.Identity.GetUserId();
                if (book.AuthorId != autorizedUser)
                {
                    return new HttpNotFoundResult("You are not authorized to delete this book, moi");
                }

                db.Books.Remove(book);
                db.SaveChanges();

                return RedirectToAction("Index");
            }
        }
    }
}
