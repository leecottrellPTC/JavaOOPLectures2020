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
public class Animal {
    String name;
    String food;
    String habitat;
    int legs;

    

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Animal() {
    }
    
    public Animal(String name, String food, String habitat, int legs) {
        this.name = name;
        this.food = food;
        this.habitat = habitat;
        this.legs = legs;
    }
//</editor-fold>
    
        
    //<editor-fold defaultstate="collapsed" desc="setters and getters">
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getFood() {
        return food;
    }
    
    public void setFood(String food) {
        this.food = food;
    }
    
    public String getHabitat() {
        return habitat;
    }
    
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    
    public int getLegs() {
        return legs;
    }
    
    public void setLegs(int legs) {
        this.legs = legs;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="comment">
    @Override
    public String toString() {
        return "Animal{" + "name=" + name + ", food=" + food + ", habitat=" + habitat + ", legs=" + legs + '}';
    }
//</editor-fold>

    
    
    
    
}
