
package com.mycompany.library;

public class Book {
    
    String title;
    String author;
    String genre;
    int datePub;
    String available;
    int quantity;
    int loanTime;
    String user;
    int loanDate;
    int returnDate;

    public Book(String title, String author, String genre, int datePub, String available, int quantity, int loanTime, String user, int loanDate, int returnDate) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.datePub = datePub;
        this.available = available;
        this.quantity = quantity;
        this.loanTime = loanTime;
        this.user = user;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
    }

    public void saySomething (){
        System.out.println("el titulo es : " +  this.title);
        System.out.println("el autor es : " + this.author);
        System.out.println("el genero es : " + this.genre );
        System.out.println(this.datePub);
        System.out.println( this.available );
        System.out.println(this.quantity);
        System.out.println( this.loanTime);
        System.out.println( this.user);
        System.out.println(this.loanDate);
        System.out.println(this.returnDate);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDatePub() {
        return datePub;
    }

    public void setDatePub(int datePub) {
        this.datePub = datePub;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getLoanTime() {
        return loanTime;
    }

    public void setLoanTime(int loanTime) {
        this.loanTime = loanTime;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(int loanDate) {
        this.loanDate = loanDate;
    }

    public int getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(int returnDate) {
        this.returnDate = returnDate;
    }
    
    
}
