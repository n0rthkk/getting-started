package org.acme.getting.started.data;

public class Book {

//    private Long id;
    private String name;
    private String author;

    public Book() {

    }

    public Book(String name, String author) {
//        this.id = id;
        this.name = name;
        this.author = author;
    }

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}