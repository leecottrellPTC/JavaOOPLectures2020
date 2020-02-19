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
public class Dog extends Animal {
    String breed;

    public Dog() {
    }

    public Dog(String breed) {
        this.breed = breed;
    }

    public Dog(String breed, String name, String food, String habitat, int legs) {
        super(name, food, habitat, legs);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
            
    public void bark(){
        System.out.println("bark bark");
    }
    
}
