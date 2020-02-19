package chapter10.pkg11inheritancelectures;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lee_c
 */
public class Employee extends Person {
    protected String title;
    protected int level;  //use to generate salary
    protected double salary;

    public Employee() {
        //default parent is called
        title = "no title";
        level = 0;
        salary = 0;
    }

    public Employee(String title, int level, double salary) {
        //super();//default
        this.title = title;
        this.level = level;
        this.salary = salary;
    }

    public Employee(String title, int level, double salary, String fname, String lname, String gender) {
        super(fname, lname, gender);
        this.title = title;
        this.level = level;
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
        if(level == 1){
            salary = 30000;
        }
        else if(level == 2){
            salary = 40000;
        }
        else if(level == 3){
            salary = 50000;
        }
        else{
            salary = 0;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        String output = super.toString();   //use parent toString
        output += "\nlevel " + level + " " + title;    //choosing to not show salary
        return output;
    }
    
    
    
   
    
    
    
}
