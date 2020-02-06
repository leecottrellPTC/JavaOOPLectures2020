/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter8arrayslecture;

/**
 *
 * @author lee_c
 */
public class PTCPrograms {

    private String programName;
    private String chair;
    private Book bookList[];

    public PTCPrograms() {
        programName = "PTC Program";
        chair = "Some Person";
        bookList = new Book[3];
    }

    public PTCPrograms(String programName, String chair, Book[] bookList) {
        this.programName = programName;
        this.chair = chair;
        this.bookList = bookList;
    }

    public PTCPrograms(String programName, String chair) {
        this.programName = programName;
        this.chair = chair;
        bookList = new Book[3];
        bookList[0] = new Book("Study Skills", "PTC", 200, 0);
        bookList[1] = new Book("English Comp", "Gilkum", 475, 55);
        bookList[2] = new Book("Math skills", "Cottrell", 475, 55);
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public String getChair() {
        return chair;
    }

    public void setChair(String chair) {
        this.chair = chair;
    }

    public Book[] getBookList() {
        return bookList;
    }

    public void setBookList(Book[] bookList) {
        this.bookList = bookList;
    }

    public Book getABook(int num) {
        if (num >= 0 && num < bookList.length) {
            return bookList[num];
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder(programName + " chaired by " + chair);
        output.append("\nBook List");
        output.append("\n");
        for (int b = 0; b < bookList.length; b++) {
            output.append(bookList[b].toString());
            output.append("\n");
        }
        return output.toString();
    }

}
