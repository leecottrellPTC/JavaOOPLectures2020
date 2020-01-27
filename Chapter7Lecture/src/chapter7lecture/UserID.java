/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7lecture;

/**
 *Use stringbuffer if a string will be rebuilt many times
 * @author lee_c
 */
public class UserID {
    private StringBuffer firstName;
    private StringBuffer lastName;
    private StringBuffer middleName;
    private StringBuffer address;
    private StringBuffer userID;

    public UserID(StringBuffer firstName, StringBuffer lastName, StringBuffer middleName, StringBuffer address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.address = address;
        
    }

    public UserID(String firstName, String lastName, String middleName, String address) {
        this.firstName = new StringBuffer(firstName);
        this.lastName = new StringBuffer(lastName);
        this.middleName = new StringBuffer(middleName);
        this.address = new StringBuffer(address);
    }
    public StringBuffer getFirstName() {
        return firstName;
    }

    public void setFirstName(StringBuffer firstName) {
        this.firstName = firstName;
    }

    public StringBuffer getLastName() {
        return lastName;
    }

    public void setLastName(StringBuffer lastName) {
        this.lastName = lastName;
    }

    public StringBuffer getMiddleName() {
        return middleName;
    }

    public void setMiddleName(StringBuffer middleName) {
        this.middleName = middleName;
    }

    public StringBuffer getAddress() {
        return address;
    }

    public void setAddress(StringBuffer address) {
        this.address = address;
    }

    public StringBuffer getUserID() {
        buildUserID();
        return userID;
    }
    
    private void buildUserID(){
        userID = new StringBuffer();
        userID.append(firstName.charAt(0));
        userID.append(middleName.charAt(0));
        userID.append(lastName.charAt(0));
        int spaceLoc = address.indexOf(" ");
        userID.append(address.substring(0, spaceLoc));
    }
    
}
