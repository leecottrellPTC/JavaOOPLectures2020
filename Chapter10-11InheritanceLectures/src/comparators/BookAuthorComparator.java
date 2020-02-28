/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparators;

import java.util.Comparator;

/**
 *compareTo returns the following 
 * negative value if o1 less than o2
 * positive value if o2 greater than 01
 * 0 if o1 equal o2
 * @author lee_c
 */ 
//comparator allows different ways to compare than the default
public class BookAuthorComparator extends Book implements Comparator<Book>{

    @Override
    public int compare(Book o1, Book o2) {
         return o1.getAuthor().compareTo(o2.getAuthor());
    }

    
    
}
