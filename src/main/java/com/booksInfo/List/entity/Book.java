package com.booksInfo.List.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "BooksData")
public class Book {
    @Id

    private int Isbn;
    @NotBlank(message = "Book not empty ")
    private String name;

    @NotNull(message = "Author name must be declare")
    private String author;

    public int getIsbn() {
        return Isbn;
    }
    public void setIsbn(int isbn) {
        Isbn = isbn;
    }
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
    public Book(int isbn, String name, String author) {
        Isbn = isbn;
        this.name = name;
        this.author = author;
    }

    @Override

    public String toString() {
        return "Book{" +
                "Isbn=" + Isbn +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
    public Book() {
    }

}
