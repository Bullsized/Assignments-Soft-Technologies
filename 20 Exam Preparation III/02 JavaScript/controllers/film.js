const Film = require('../models/Film');

module.exports = {
    index: (req, res) => {
        Film.find().then(films => {
            res.render('film/index', {'films': films});
        });
    },


    createGet: (req, res) => {
        res.render('film/create');
    },


    createPost: (req, res) => {
        let filmArgs = req.body;

        if (filmArgs.name === undefined
            || filmArgs.genre === undefined
            || filmArgs.director === undefined
            || filmArgs.year === undefined) {
            res.redirect('/');
            return;
        }

        Film.create(filmArgs).then(film => {
            res.redirect('/')
        });
    },


    editGet: (req, res) => {
        let id = req.params.id;

        Film.findById(id).then(film => {
            if (!film) {
                res.redirect('/');
                return;
            }
            res.render('film/edit', film)
        });
    },


    editPost: (req, res) => {
        let filmId = req.params.id;
        let film = req.body;

        Film.findByIdAndUpdate(filmId, film, {runValidators: true})
            .then(tasks => {
                res.redirect("/");
            }).catch(err => {
            film.id = taskId;
            film.error = "Cannot edit task.";
            return res.render("film/edit", film);
        });
    },


    deleteGet: (req, res) => {
        let id = req.params.id;

        Film.findById(id).then(film => {
            if (!film) {
                res.redirect('/');
                return;
            }
            res.render('film/delete', film)
        });
    },


    deletePost: (req, res) => {
        let id = req.params.id;

        Film.findByIdAndRemove(id).then(film => {
            res.redirect('/');
        });
    }
};