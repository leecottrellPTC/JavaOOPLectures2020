/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaguiplan;

/**
 *
 * @author lee_c
 */
public class Pizza {

    String size;
    String sauce;
    boolean excheese, greenpepper, ham, mushroom, pepperoni, sausage;
    int toppingCount;
    double toppingPrice;
    double price;

    @Override
    public String toString() {
        return size + " " + toppingCount + " topping with " + sauce + " sauce";
    }

    Pizza() {

    }

    Pizza(String size, String sauce, boolean excheese, boolean greenpepper,
            boolean ham, boolean mushroom, boolean pepperoni, boolean sausage) {
        if(size.startsWith("s")){
            //small
            price = 8;
            toppingPrice = 1;
        }
        else if(size.startsWith("m")){
            price = 10;
            toppingPrice = 1.5;
        }
        else if(size.startsWith("l")){
            price = 12;
            toppingPrice = 2;
        }
        toppingCount = 0;
        if(excheese){
            toppingCount++;
        }
        if(greenpepper){
            toppingCount++;
        }
        if(mushroom){
            toppingCount++;
        }
        if(ham){
            toppingCount++;
        }
        if(pepperoni){
            toppingCount++;
        }
        if(sausage){
            toppingCount++;
        }
        price += toppingCount * toppingPrice;
        this.sauce = sauce;
        this.size = size;
        this.excheese = excheese;
        this.greenpepper = greenpepper;
        this.ham = ham;
        this.mushroom = mushroom;
        this.pepperoni = pepperoni;
        this.sausage = sausage;
        

    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public boolean isExcheese() {
        return excheese;
    }

    public void setExcheese(boolean excheese) {
        this.excheese = excheese;
    }

    public boolean isGreenpepper() {
        return greenpepper;
    }

    public void setGreenpepper(boolean greenpepper) {
        this.greenpepper = greenpepper;
    }

    public boolean isHam() {
        return ham;
    }

    public void setHam(boolean ham) {
        this.ham = ham;
    }

    public boolean isMushroom() {
        return mushroom;
    }

    public void setMushroom(boolean mushroom) {
        this.mushroom = mushroom;
    }

    public boolean isPepperoni() {
        return pepperoni;
    }

    public void setPepperoni(boolean pepperoni) {
        this.pepperoni = pepperoni;
    }

    public boolean isSausage() {
        return sausage;
    }

    public void setSausage(boolean sausage) {
        this.sausage = sausage;
    }

    public int getToppingCount() {
        return toppingCount;
    }

    public void setToppingCount(int toppingCount) {
        this.toppingCount = toppingCount;
    }

    public double getToppingPrice() {
        return toppingPrice;
    }

    public void setToppingPrice(double toppingPrice) {
        this.toppingPrice = toppingPrice;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
