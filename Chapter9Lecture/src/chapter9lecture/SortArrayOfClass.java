/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter9lecture;

/**
 *
 * @author lee_c
 */
public class SortArrayOfClass {

    static Book bookList[] = new Book[4];

    public static void fillArray() {
        bookList[0] = new Book("Jaws", "Peter Benchley", 356, 19.5);
        bookList[1] = new Book("Dracula", "Bram Stoker", 123, 9.5);
        bookList[2] = new Book("1984", "George Orwell", 546, 29.5);
        bookList[3] = new Book("Moby Dick", "Herman Melville", 256, 39.5);
    }

    static void showArray() {
        for(int b=0; b < bookList.length; b++){
            System.out.println(bookList[b].toString());
        }
    }

    static void sortByCostAsc() {
        Book temp;
        for (int r = 0; r < bookList.length - 1; r++) {
            for (int c = 0; c < bookList.length - 1; c++) {
                if (bookList[c].getCost() > bookList[c + 1].getCost()) {
                    temp = bookList[c];
                    bookList[c] = bookList[c+1];
                    bookList[c+1] = temp;
                }
            }//end inner
        }//end outer
    }
    
    static void sortByCostDesc() {
        Book temp;
        for (int r = 0; r < bookList.length - 1; r++) {
            for (int c = 0; c < bookList.length - 1; c++) {
                if (bookList[c].getCost() < bookList[c + 1].getCost()) {
                    temp = bookList[c];
                    bookList[c] = bookList[c+1];
                    bookList[c+1] = temp;
                }
            }//end inner
        }//end outer
    }
     static void sortByTitleAsc() {
              
        Book temp;
        for (int r = 0; r < bookList.length - 1; r++) {
            for (int c = 0; c < bookList.length - 1; c++) {
                if (bookList[c].getTitle().compareTo(bookList[c + 1].getTitle()) > 0) {
                     temp = bookList[c];
                    bookList[c] = bookList[c+1];
                    bookList[c+1] = temp;
                }
            }//end inner
        }//end outer
    }
     
     static void sortByTitleDesc() {
              
        Book temp;
        for (int r = 0; r < bookList.length - 1; r++) {
            for (int c = 0; c < bookList.length - 1; c++) {
                if (bookList[c].getTitle().compareTo(bookList[c + 1].getTitle()) < 0) {
                     temp = bookList[c];
                    bookList[c] = bookList[c+1];
                    bookList[c+1] = temp;
                }
            }//end inner
        }//end outer
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        fillArray();
        sortByCostAsc();
        showArray();
        System.out.println("Sorted by title");
          sortByTitleDesc();
        showArray();
    }

}
