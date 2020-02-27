/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter10.pkg11inheritancelectures;

/**
 *num2 ch 11
 * @author lee_c
 */
abstract public class PhoneCall {
    protected String phoneNumber;
    protected double price;

    public PhoneCall(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.price = 0;
    }

    public PhoneCall() {
        this.phoneNumber = "";
        this.price = 0;
    }

    @Override
    public String toString() {
        return "PhoneCall{" + "phoneNumber=" + phoneNumber + ", price=" + price + '}';
    }
    
    //will have to override these in child classes
    public String getPhoneNumber(){
        return phoneNumber;
    }
    abstract public double getPrice();
    abstract public String getCallInfo();
    
    
}
