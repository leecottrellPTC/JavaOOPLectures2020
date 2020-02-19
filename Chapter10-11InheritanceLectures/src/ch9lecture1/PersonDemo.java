/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9lecture1;

/**
 *
 * @author lee_c
 */
public class PersonDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person kate = new Person("Kate", "Upton", "female");
        Employee hertz = new Employee("Instructor", 3, 1000000, "David", "Hertz", "male");
       // hertz.setLevel(3);
       /* hertz.setFname("Dave");
        hertz.setLname("Hertz");
        hertz.setGender("male");
        */
              
        System.out.println(kate.toString() + " married " + hertz.toString());
        System.out.println(hertz.getSalary());
    }
    
}
