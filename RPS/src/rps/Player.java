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
import java.util.Scanner;

public class Player {

    private String name;

    public Player(String name) {
        this.name = name;
    }

    public int makeThrow() {
        int choice;
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Enter 0 for rock, 1 for paper, 2 for scissors: ");
            choice = in.nextInt();
        } while (choice < 0 || choice > 2);

        return choice;
    }

    public String getName() {
        return name;
    }
}
