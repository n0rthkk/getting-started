package org.acme.getting.started.data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class Book {

//    private Long id;
    @NotBlank(message = "Name shouldn't be blank")
    private String name;
    @NotBlank(message = "Name shouldn't be blank")
    private String author;
    @Min(value = 1, message = "Number of pages should be at least 1")
    private Integer pages;

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

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }
}
