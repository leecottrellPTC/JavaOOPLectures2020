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
public class IncomingCall extends PhoneCall{

    public IncomingCall(String phoneNumber) {
        super(phoneNumber);
        price = .02;
    }

    public IncomingCall() {
        super();
        price = .02;
    }
       

    
    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getCallInfo() {
        return "Incoming call from " + phoneNumber + " cost $ " + price;
    }
    
}
