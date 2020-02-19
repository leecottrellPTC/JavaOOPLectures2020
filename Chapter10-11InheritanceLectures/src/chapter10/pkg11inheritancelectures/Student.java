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
public class Student extends Person {

    //first time building, do not include a toString...
    protected String major;
    protected double GPA;

    public Student() {
        //default parent is called
    }

    public Student(String major, double GPA) {
        //  super();
        this.major = major;
        this.GPA = GPA;
    }

    public Student(String major, double GPA, String fname, String lname, String gender) {
        super(fname, lname, gender);
        this.major = major;
        this.GPA = GPA;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        String output = major + " student " + super.toString();
        return output;
    }

}
