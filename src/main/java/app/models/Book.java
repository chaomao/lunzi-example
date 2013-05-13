package app.models;

import com.thoughtworks.orm.Model;
import com.thoughtworks.orm.annotation.HasMany;

import java.util.ArrayList;
import java.util.List;

public class Book extends Model {
    private String name;
    @HasMany(foreignKey = "book_id", klass = Author.class)
    private ArrayList<Author> authors = new ArrayList<>();
    private BookCategory category;

    public Book() {
    }

    public Book(String name) {
        this.name = name;
    }

    public BookCategory getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public List<Author> getAuthors() {
        return authors;
    }
}
