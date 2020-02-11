/*
 * Enums are a cool way to build constants.
You define the terms and apply the values
Java will use the enum terms as values
Enums act as a class, thus should start with a capital letter
 */
package chapter9lecture;

/**
 *
 * @author lee_c
 */
public class SimpleEnum {
enum Planets {MERCURY, VENUS, EARTH, MARS, JUPITER, SATURN, URANUS, NEPTUNE};
static int moons[] = {0,0,1,2,67,62,27, 14};

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //show the enum values using a for each loop
        for(Planets plan: Planets.values()){
            System.out.println(plan + " = " + plan.ordinal());//display the numeric value
            //useful for array subscripting
        }
        
        System.out.println("Jupiter has " + moons[Planets.JUPITER.ordinal()] + " moons");
        //while clunky to write, it is very clear to read
        
        
    }
    
}
