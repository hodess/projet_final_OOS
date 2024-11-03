package com.example.myServiceClient.data;

public class BookClient {
    private String ISBN;
    private String name;
    private String author;
    private String editor;
    private boolean rented;

    public BookClient(){
    }

    public BookClient(String ISBN, String author, String name, boolean rented, String editor) {
        this.ISBN = ISBN;
        this.author = author;
        this.name = name;
        this.rented = rented;
        this.editor = editor;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public boolean isRented() {
        return rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

}
