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
public class Game {

    private int pWins, cWins, ties;
    private Computer comp;
    private Player human;

    public Game(String name) {
        human = new Player(name);
        comp = new Computer("Computer");
        pWins = 0;
        cWins = 0;
        ties = 0;
    }

    public void compareChoices(int pC, int cC) {
        if (pC == cC) {
            ties += 1;
        } else if (pC == 0 && cC == 2 || pC == 2 && cC == 1 || pC == 1 && cC == 0) {
            pWins += 1;
        } else {
            cWins += 1;
        }
    }

    public void playRound() {
        int pChoice = human.makeThrow();
        int cChoice = comp.makeThrow();
        compareChoices(pChoice, cChoice);

    }

    public String getStats() {
        String output = "Player won: " + pWins;
        output += "\nComputer won: " + cWins;
        output += "\nTies: " + ties;
        output += "\n" + getWinner();
        return output;
    }

    public String getWinner() {
        if (pWins > cWins) {
            return human.getName();
        } else if (cWins > pWins) {
            return comp.getName();
        } else {
            return "It's a tie";
        }
    }

    public String getRules() {
        return "These are the rules";
    }

    public int getpWins() {
        return pWins;
    }

    public int getcWins() {
        return cWins;
    }

    public int getTies() {
        return ties;
    }
}
