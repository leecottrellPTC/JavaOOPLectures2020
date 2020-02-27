/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter10.pkg11inheritancelectures;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lee_c
 */
public class PhoneCallMain {

    /**
     * Build a list that holds both Incoming and Outgoing
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<PhoneCall> calls = new ArrayList<PhoneCall>();
        //PhoneCall bad = new PhoneCall();
        String number = "";
        int type = 0;
        int minutes;
        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.println("0 to quit");
            System.out.println("1 for incoming");
            System.out.println("2 for outgoing");
            type = keyboard.nextInt();
            //solve input problem
            keyboard.nextLine();
            switch (type) {
                case 1:
                    System.out.println("Enter phone number");
                    number = keyboard.nextLine();
                    IncomingCall incCall = new IncomingCall(number);
                    calls.add(incCall);
                    break;
                case 2:
                    System.out.println("Enter phone number");
                    number = keyboard.nextLine();
                    System.out.println("Enter minutes");
                    minutes = keyboard.nextInt();
                    OutgoingCall outCall = new OutgoingCall(minutes, number);
                    calls.add(outCall);
                    break;
                default:

            }

        } while (type != 0);
        
        for(int x=0; x < calls.size(); x++){
            System.out.println(calls.get(x).getCallInfo());
        }
    }

}
