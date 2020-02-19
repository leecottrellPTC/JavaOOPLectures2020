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
public class Person {
    protected String fname;
    protected String lname;
    protected String gender;

    public Person() {//just for clarity
        fname="no";
        lname = "name";
        gender = "unspecified";
                
    }

    public Person(String fname, String lname, String gender) {
        this.fname = fname;
        this.lname = lname;
        this.gender = gender;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        String output ="";
        if(gender.toLowerCase().equals("female")){
            output = "Ms. " + fname + " " + lname;
        }
        else if(gender.toLowerCase().equals("male")){
            output = "Mr. " + fname + " " + lname;
        }
        else{
            output = "Mx. " + fname + " " + lname;
        }
        return output;
    }
    
    
    
}
