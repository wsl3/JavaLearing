package com.ORMAnnocation;


@Table("book")
public class FilterBook {

    @Column("id")
    private Integer id;

    @Column("author")
    private String author;

    @Column("title")
    private String title;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Column("price")
    private double price;
}
