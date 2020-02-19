/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter10.pkg11inheritancelectures;

/**
 * p531 num 6
 *
 * @author lee_c
 */
public class BaseballGame {

    protected String team1;
    protected String team2;
    protected int innings;
    protected int currentInning;
    protected int[][] score;

    public BaseballGame() {
    }

    public BaseballGame(String team1, String team2, int innings, int currentInning, int[][] score) {
        this.team1 = team1;
        this.team2 = team2;
        this.innings = innings;
        this.currentInning = currentInning;
        this.score = score;
    }

    public BaseballGame(String team1, String team2, int innings) {
        this.team1 = team1;
        this.team2 = team2;
        this.innings = innings;
        currentInning = 0;
        this.score = new int[innings][2]; //9 innings, score 1 score 2
    }

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public int getInnings() {
        return innings;
    }

    public void setInnings(int innings) {
        this.innings = innings;
    }

    public int getCurrentInning() {
        return currentInning;
    }

    public void setCurrentInning(int currentInning) {
        this.currentInning = currentInning;
    }

    public int[][] getScore() {
        return score;
    }

    public void setScore(int[][] score) {
        this.score = score;
    }

    public void setInningScore(int team1Score, int team2Score) {
        try {
            score[currentInning][0] = team1Score;
            score[currentInning][1] = team2Score;
            currentInning++;   //count the innings
        } catch (ArrayIndexOutOfBoundsException aibe) {
            System.out.println("Too many innings");
        }
    }

    @Override
    public String toString() {
        //returns the box score
        String line1 = "", line2 = "", output;
        int total1 = 0, total2 = 0;
        line1 = team1;
        line2 = team2;
        for (int x = 0; x < score.length; x++) {
            line1 += String.format(" %2d |", score[x][0]);
            line2 += String.format(" %2d |", score[x][1]);
            total1 += score[x][0];
            total2 += score[x][1];
        }
        line1 +=String.format(" %2d",  total1);
        line2 += String.format(" %2d",total2);
        output = line1 + "\n" + line2;
        return output;
    }
    
    public String winner(){
        int total1 = 0, total2 = 0;
        if(currentInning < score.length){
            return "game not over";
        }
        for (int x = 0; x < score.length; x++) {
            total1 += score[x][0];
            total2 += score[x][1];
        }
        if(total1 > total2){
            return team1 + " WIN!";
        }
        else if(total1 < total2){
            return team2+ " WIN!";
        }
        else{
            return "tie game";
        }
        
        
    }

}
