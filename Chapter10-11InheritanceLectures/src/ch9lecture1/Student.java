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
public class Student extends Person{
    String major;
    double GPA;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Student() {
    }

    public Student(String major, double GPA, String fname, String lname, String gender) {
        super(fname, lname, gender);
        this.major = major;
        this.GPA = GPA;
    }

    public Student(String major, double GPA) {
        this.major = major;
        this.GPA = GPA;
    }
    
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Setters and Getters">
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
//</editor-fold>
    
    
    @Override
    public String toString() {
        String output = super.toString() + " studies " + major;
        
        return output;
    }
    
    
    
}
