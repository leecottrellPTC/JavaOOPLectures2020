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
public class Employee extends Person {
    //inherits all protected/public elements in person

    protected String title;
    protected int level;
    protected double salary;

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
        if (level == 1) {
            salary = 30000;
        } else if (level == 2) {
            salary = 40000;
        } else if (level == 3) {
            salary = 50000;
        } else {
            salary = 0;
        }
    }//end of set level

    public double getSalary() {
        return salary;
    }

    //delete setSalary --> makes salary read only
    public Employee(String title, int level, double salary, String fname, String lname, String gender) {
        super(fname, lname, gender);    //calls parent constructor
        this.title = title;
        this.level = level;
        this.salary = salary;
        this.setLevel(level);
    }

    public Employee(String title, int level, double salary) {
        this.title = title;
        this.level = level;
        this.salary = salary;
         this.setLevel(level);
    }

    public Employee() {
    }

    @Override
    public String toString() {
        //going to use the parent toString in this toString
        String output = title + " " + super.toString();

        return output;
    }
}
