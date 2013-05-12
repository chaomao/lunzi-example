package app.controllers;

import app.models.Author;
import com.thoughtworks.mvc.annotations.Path;
import com.thoughtworks.mvc.annotations.Post;
import com.thoughtworks.mvc.annotations.RequestParameter;
import com.thoughtworks.mvc.model.ModelMap;

public class AuthorController {

    @Path("/author/new")
    public void newAuthor() {
    }

    @Path("/author/create")
    @Post
    public ModelMap create(@RequestParameter("author") Author author) {
        ModelMap modelMap = new ModelMap();
        modelMap.put("author", author);
        return modelMap;
    }
}
