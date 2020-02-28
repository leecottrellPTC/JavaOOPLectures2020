/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author lee_c
 */
public class BookSortMain {

    public static ArrayList<Book> bookList = new ArrayList<Book>();
    public static Book [] bookArray = new Book[10];

    public static void fillBook() {
        bookList.add(new Book("Jaws", "Benchley", 300, 9.95));
        bookList.add(new Book("The Expanse", "Corey", 1300, 29.95));
        bookList.add(new Book("The Stand", "King", 800, 29.95));
        bookList.add(new Book("A Game of Thrones", "Martin", 600, 9.95));
        bookList.add(new Book("A Storm of Swords", "Martin", 500, 9.95));
        bookList.add(new Book("A Clash of Kings", "Martin", 550, 9.95));
        bookList.add(new Book("A Feast for Crows", "Martin", 700, 9.95));
        bookList.add(new Book("IT", "King", 400, 19.95));
        bookList.add(new Book("Misery", "King", 500, 29.95));
        bookList.add(new Book("Pet Sematary", "King", 900, 29.95));
        
        //convert the list to an array 
        //just for proof that the different sorts work
        //https://www.geeksforgeeks.org/arraylist-array-conversion-java-toarray-methods/
         bookArray = bookList.toArray(bookArray);
    }
    
    public static void showArray(){
        for(int x=0; x < bookArray.length; x++){
            System.out.println(bookArray[x].toString());
        }
    }
    
    public static void showList(){
        for(int x=0; x < bookList.size(); x++){
            System.out.println(bookList.get(x).toString());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        fillBook();
        System.out.println("Before sorting by title");
        showArray();
       
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("After sorying by title");
        Arrays.sort(bookArray, new BookTitleComparator());
        showArray();
        
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("After sorying by Author");
        Arrays.sort(bookArray, new BookAuthorComparator());
        showArray();
        
         System.out.println("-------------------------------------------------------------------------");
        System.out.println("After sorting by Pages within Author");
        
        Arrays.sort(bookArray, new BookAuthorComparator().
                thenComparing(new BookPagesComparator()));
        showArray();
        
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Booklist After sorting by Pages ");
        //proof it works with Collections
        Collections.sort(bookList, new BookPagesComparator());
        showList();
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Booklist Showing shorting Title within Author ");
         Collections.sort(bookList, new BookAuthorComparator().thenComparing(new BookTitleComparator()));
         System.out.printf("%-10s %-20s\n","Author", "Title");
         System.out.println("------------------------------");
         for(int x=0; x < bookList.size(); x++){
             System.out.printf("%-10s %-20s\n", bookList.get(x).getAuthor(), bookList.get(x).getTitle());
             //show without the - first
         }
        
    }

}
