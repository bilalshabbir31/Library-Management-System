/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms.project;

/**
 * * @author ubaid ur rehman
 */
 
public class Book {
    private String Bookname,Bookauthor,Bookedition;
    public Book()
    {
        Bookname=Bookauthor=Bookedition="";
    }

    public Book(String Bookname, String Bookauthor, String Bookedition) {
        this.Bookname = Bookname;
        this.Bookauthor = Bookauthor;
        this.Bookedition = Bookedition;
    }

    public String getBookname() {
        return Bookname;
    }

    public void setBookname(String Bookname) {
        this.Bookname = Bookname;
    }

    public String getBookauthor() {
        return Bookauthor;
    }

    public void setBookauthor(String Bookauthor) {
        this.Bookauthor = Bookauthor;
    }

    public String getBookedition() {
        return Bookedition;
    }

    public void setBookedition(String Bookedition) {
        this.Bookedition = Bookedition;
    }

    @Override
    public String toString() {
        return "Book Record"+"\n"+"Book Name:" + Bookname + "\n"+"Book Author:" + Bookauthor + "\n"+"Book Edition:" + Bookedition;
    }
    
}
