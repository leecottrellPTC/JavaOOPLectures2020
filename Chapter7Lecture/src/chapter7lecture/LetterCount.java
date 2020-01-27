/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7lecture;

/**
 *
 * @author lee_c
 */
public class LetterCount {
    private String phrase;
    private int letters;
    private int digits;
    private int spaces;
    private int other;
    
    //insert setters, getters, toString, constructors

    public LetterCount() {
        phrase = "";
        letters = 0;
        digits = 0;
        spaces = 0;
        other = 0;
    }
//partial constructor
    public LetterCount(String phrase) {
        this.phrase = phrase;
        countTheLetters();//make the class automatic
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public int getLetters() {
        return letters;
    }

    public void setLetters(int letters) {
        this.letters = letters;
    }

    public int getDigits() {
        return digits;
    }

    public void setDigits(int digits) {
        this.digits = digits;
    }

    public int getSpaces() {
        return spaces;
    }

    public void setSpaces(int spaces) {
        this.spaces = spaces;
    }

    public int getOther() {
        return other;
    }

    public void setOther(int other) {
        this.other = other;
    }

    @Override
    public String toString() {
        return "LetterCount{" + "phrase=" + phrase + ", letters=" + letters + ", digits=" + digits + ", spaces=" + spaces + ", other=" + other + '}';
    }
 
    public void countTheLetters(){
        char theLetter;
        for(int c=0; c < phrase.length(); c++){
            theLetter = phrase.charAt(c);
            if(Character.isLetter(theLetter)){
                letters ++;
            }
            else if(Character.isDigit(theLetter)){
                digits ++;
            }
            else if(Character.isSpaceChar(theLetter)){
                spaces++;
            }
            else{
                other++;
            }
        }
    }
    
    
    
 
    
}
