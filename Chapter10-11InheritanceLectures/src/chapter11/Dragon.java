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
public class Dragon implements Movement {
    String color;
   // String 

    @Override
    public void move() {
        System.out.println("Fly");
    }

    @Override
    public void fight() {
        System.out.println("Breath fire");
    }

    @Override
    public void eat() {
        System.out.println("Helpless villagers");
    }
    
}
