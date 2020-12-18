package com.alanbirch.book;

import java.util.Calendar;

public class Book {
    private String Title, Author;
    private int yearOfPublication;
    private double price;
    private static String Language = "CZ";
    private int year = Calendar.getInstance().get(Calendar.YEAR);

    public Book(String title, String author, double price) {
        Title = title;
        Author = author;
        this.price = price;
        this.yearOfPublication = 2020;
    }

    public Book(String title, String author, int yearOfPublication, double price) {
        Title = title;
        Author = author;
        this.yearOfPublication = yearOfPublication;
        this.price = price;
    }

    public void bookDicount(){
        this.price = price - (price/10);
    }

    public int countAgeOfBook(){
        int ageOfBook = year - yearOfPublication;
        return ageOfBook;
    }

    public void information(){
        System.out.println("Information about book: \nTitle: " + Title +
                           "\nAuthor: " + Author +
                           "\nYear of publication: " + yearOfPublication +
                           "\nAge of book: " + this.countAgeOfBook() +
                           "\nPrice: " + price);
    }
}
