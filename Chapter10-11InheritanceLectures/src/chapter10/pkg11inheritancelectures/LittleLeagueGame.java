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
public class LittleLeagueGame extends BaseballGame{

    public LittleLeagueGame() {
    }

    public LittleLeagueGame(String team1, String team2, int innings, int currentInning, int[][] score) {
        super(team1, team2, innings, currentInning, score);
    }

    public LittleLeagueGame(String team1, String team2, int innings) {
        super(team1, team2, innings);
        currentInning = 0;
        score = new int[6][2];//simply change the innings
    }
    
    
    
}
