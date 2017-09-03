const Product = require('../models/Product');

module.exports = {
    index: (req, res) => {
        Product.find().then(products => {
            res.render('product/index', {'products': products});
        });
    },


    createGet: (req, res) => {
        res.render('product/create');
    },


    createPost: (req, res) => {
        let prodArgs = req.body;

        if (prodArgs.priority === undefined
            || prodArgs.name === undefined
            || prodArgs.quantity === undefined
            || prodArgs.status === undefined) {
            res.redirect('/');
            return;
        }

        Product.create(prodArgs).then(Product => {
            res.redirect('/')
        });
    },


    editGet: (req, res) => {
        let id = req.params.id;

        Product.findById(id).then(product => {
            if (!product) {
                res.redirect('/');
                return;
            }
            res.render('product/edit', product)
        });
    },


    editPost: (req, res) => {
        let prodId = req.params.id;

        let product = req.body;

        Product.findByIdAndUpdate(prodId, product, {runValidators: true})
            .then(products => {
                res.redirect("/");
            }).catch(err => {
                product.name = prodId;
                product.error = "Wrong name, bruv ~";
                return res.render("product/edit", product);
        });
    }
};