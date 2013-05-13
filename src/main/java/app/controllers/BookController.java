package app.controllers;

import app.models.Book;
import com.thoughtworks.mvc.annotations.Path;
import com.thoughtworks.mvc.annotations.Post;
import com.thoughtworks.mvc.annotations.RequestParameter;
import com.thoughtworks.mvc.model.ModelMap;
import com.thoughtworks.orm.finder.ModelFinder;

import java.util.List;

public class BookController {

    @Path("/book/new")
    public void newBook() {
    }

    @Path("/book/create")
    @Post
    public ModelMap create(@RequestParameter("book") Book book) {
        book.save();
        ModelMap modelMap = new ModelMap();
        modelMap.put("book", book);
        return modelMap;
    }

    @Path("/book")
    public ModelMap index() {
        ModelMap modelMap = new ModelMap();
        modelMap.put("books", ModelFinder.findAll(Book.class));
        return modelMap;
    }
}
