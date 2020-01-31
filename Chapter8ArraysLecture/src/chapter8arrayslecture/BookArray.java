/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter8arrayslecture;

import java.util.Scanner;

/**
 *
 * @author lee_c
 */
public class BookArray {

    static Scanner keyboard = new Scanner(System.in);
    static Book books[] = new Book[4];
    public static void fillArray(){
        books[0] = new Book("Moby Dick", "Herman Melville", 585, 19.95 );
        books[1] = new Book("Dracula", "Bram Stoker", 408, 9.95 );
        books[2] = new Book("Jaws", "Peter Benchley", 278, 24.95 );
        books[3] = new Book("1984", "George Orwell", 328, 19.95 );
        
    }
    public static void main(String[] args) {
        int bookNum = 0;
        fillArray();
        do{
            System.out.println("Enter a book number, -1 to quit");
            bookNum = keyboard.nextInt();
            if(bookNum >=0 && bookNum < books.length){
                System.out.println(books[bookNum]);
            }     
        }while(bookNum >= 0);
    }
    
}
