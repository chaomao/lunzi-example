package app.controllers;

import app.models.Author;
import app.models.Book;
import com.thoughtworks.mvc.annotations.Path;
import com.thoughtworks.mvc.annotations.Post;
import com.thoughtworks.mvc.annotations.RequestParameter;
import com.thoughtworks.mvc.model.ModelMap;

public class BookController {

    @Path("/book/new")
    public void newBook() {
    }

    @Path("/book/create")
    @Post
    public ModelMap create(@RequestParameter("book") Book book) {
        ModelMap modelMap = new ModelMap();
        modelMap.put("book", book);
        return modelMap;
    }
}
