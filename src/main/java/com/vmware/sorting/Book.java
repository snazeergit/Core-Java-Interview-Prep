package com.vmware.sorting;

public class Book {
    private Integer id;
    private String name;
    private Integer pages;
    private String author;
    private Double cost;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Book(Integer id, String name, Integer pages, String author, Double cost) {
        super();
        this.id = id;
        this.name = name;
        this.pages = pages;
        this.author = author;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", name=" + name + ", pages=" + pages + ", author=" + author + ", cost=" + cost + "]";
    }
}
