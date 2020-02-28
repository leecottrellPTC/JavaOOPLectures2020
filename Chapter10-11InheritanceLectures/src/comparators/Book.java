/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparators;

/**
 *
 * @author lee_c
 */
public class Book //implements Comparable
{
    
    private String title;
    private String author;
    private int pages;
    private double cost;

    public Book() {//default
    }

    public Book(String title, String author, int pages, double cost) {//parameterizes
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.cost = cost;
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

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", author=" + author + ", pages=" + pages + ", cost=" + cost + '}';
    }

    
    //create the default method to sort in the class
 /*    @Override
    public int compareTo(Book o) {
        return this.title.compareTo(o.title);
    }
    */
    
    
}
