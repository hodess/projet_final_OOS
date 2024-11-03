package com.example.myServiceServer.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class BookJPA {

    // Constructeur par défaut requis par JPA
    public BookJPA() {
    }
    @Id
    private String ISBN;
    private String author;
    private String name;
    private boolean rented;
    private String editor;




    // Constructeur avec paramètres
    public BookJPA(String ISBN, String name, String author, boolean rented, String editor) {
        this.ISBN = ISBN;
        this.name = name;
        this.author = author;
        this.rented = rented;
        this.editor = editor;
    }





    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public boolean isRented() {
        return rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }
}
