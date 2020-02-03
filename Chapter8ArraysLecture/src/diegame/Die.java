/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diegame;

/**
 *
 * @author lee_c
 */
public class Die {
    private int dieSides;
    private int dieValue;

    public Die(int dieSides) {
        this.dieSides = dieSides;
        this.roll();
    }
    
    public Die(){
       this.dieSides = 6;
       this.roll();
    }

    public int getDieSides() {
        return dieSides;
    }

    public void setDieSides(int dieSides) {
        this.dieSides = dieSides;
        this.roll();
    }

    public int getDieValue() {
        return dieValue;
    }

    public void setDieValue(int dieValue) {
        this.dieValue = dieValue;
        //cheat here
    }
        public void roll(){
            this.dieValue = (int) (Math.random() * this.dieSides + 1);
            //typecast - use whenever you have multipel data types
        }
        
    
}

