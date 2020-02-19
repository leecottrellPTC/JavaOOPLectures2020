/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter10.pkg11inheritancelectures;

/**
 *
 * @author lee_c
 */
public class Chapter1011InheritanceLectures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person kate = new Person("Kate", "Upton", "female");
        Person dwayne = new Person("Dwayne", "Johnson", "male");
        Person dummy = new Person();
        Student mike = new Student("Programming", 3.5, "Mike", "Smith", "male");
        
        Employee jennifer = new Employee("nurse", 2, 0,"Jennifer", "Hicks", "female");
        jennifer.setLevel(2);
        
        Employee meg = new Employee();
        System.out.println(meg.toString());
        
        System.out.println(jennifer);
        
        System.out.println(kate);
        System.out.println(dwayne);
        System.out.println(dummy);
        System.out.println(mike.toString());//demonstrate first without a toString
    }
    
}
