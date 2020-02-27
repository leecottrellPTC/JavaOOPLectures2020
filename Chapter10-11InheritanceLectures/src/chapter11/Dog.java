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
public class Dog extends Animal implements Movement, Guns {
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

    @Override
    public void move() {
        System.out.println("Walking on legs");
    }

    @Override
    public void fight() {
        System.out.println("Bites the bad guy");
    }

    @Override
    public void eat() {
        System.out.println("Anything that is not moving");
        
    }
    
}
