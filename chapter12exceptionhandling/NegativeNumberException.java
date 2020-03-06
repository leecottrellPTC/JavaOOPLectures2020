/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter12exceptionhandling;

/**
 *
 * @author lee_c
 */
public class NegativeNumberException extends Exception {
    
    public NegativeNumberException(){
        super("Negative number was entered");
    }
    
    public NegativeNumberException(String customMessage){
        super(customMessage);
    }
    
}
