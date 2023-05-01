package com.acro.lms;

public class Book{
    //BID, Book name, Price, Genre
    int bookId;
    String title;
    String author;
    String genre;
    int noOfCopies;
public Book(int bookId,String title,String author,String genre,int noOfCopies){
    this.bookId=bookId;
    this.title=title;
    this.author=author;
    this.genre=genre;
    this.noOfCopies=noOfCopies;

}

}
