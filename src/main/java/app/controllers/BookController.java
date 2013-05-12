package app.controllers;

import app.models.Author;
import app.models.Book;
import com.google.common.collect.Lists;
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

    @Path("/book")
    public ModelMap index() {
        ModelMap modelMap = new ModelMap();
        Book book = new Book("how to new bee");
        book.addAuthor(new Author("Mao chao 1", 1));
        book.addAuthor(new Author("Mao chao 2", 2));

        modelMap.put("books", Lists.newArrayList(book));
        return modelMap;
    }
}
