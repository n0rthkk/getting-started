package org.acme.getting.started;

import io.netty.util.internal.StringUtil;
import org.acme.getting.started.data.Book;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Path("/book")
public class BookResource {

    // это класс inject
    private static List<Book> books = new ArrayList<>();

    static {
        books.add(new Book( "First book", "New author"));
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Book> getBooks() {
        return books;
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Book addBook(Book book) {
        books.add(book);
        return book;
    }

    @PUT
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Book updateBook(Book book, @PathParam("id") Integer index) {
        books.remove((int)index);
        books.add(index, book);
        return book;
    }

    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Book deleteBook(@PathParam("id") Integer index) {
        return books.remove((int)index);
    }
}
