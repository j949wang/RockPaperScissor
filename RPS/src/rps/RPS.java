/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rps;

/**
 *
 * @author jiaxiw
 */
public class RPS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Game rps = new Game("Jiaxi");

//        System.out.println(rps.getRules());
        for (int i = 0; i < 10; i++) {
            rps.playRound();
        }
        System.out.println(rps.getStats());
//        
//        System.out.println(rps.getcWins());
//        
//        System.out.println(rps.getpWins());0
//        
//        System.out.println(rps.getTies());
//        
//        System.out.println(rps.getWinner());
    }

}
