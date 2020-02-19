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
public class BaseballProjectDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BaseballGame game = new BaseballGame("Braves", "Giants", 9);
        //LittleLeagueGame game = new LittleLeagueGame("Braves", "Giants", 9);
        game.setInningScore(2, 1);
        game.setInningScore(0, 0);
        game.setInningScore(0, 1);
        game.setInningScore(2, 0);
        game.setInningScore(2, 2);
        game.setInningScore(2, 3);
        game.setInningScore(2, 3);
        game.setInningScore(2, 3);
        game.setInningScore(2, 1);
        System.out.println(game.toString());
        System.out.println(game.winner());
    }
    
}
