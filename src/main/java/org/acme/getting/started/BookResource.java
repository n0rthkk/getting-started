package org.acme.getting.started;

import io.netty.util.internal.StringUtil;
import org.acme.getting.started.data.Book;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
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
    public Response getBooks() {
        return Response.status(202)
                .entity(books)
                .build();
//        return Response.ok(books).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response addBook(@Valid Book book) {
        if (books.size() > 5) {
            return Response.status(400).entity("No more than 5 books allowed").build();
        }
        books.add(book);
        return Response.ok(book).build();
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
