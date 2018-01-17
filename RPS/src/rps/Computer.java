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
public class Computer {

    private String name;

    public Computer(String name) {
        this.name = name;
    }

    public int makeThrow() {
        return (int) (Math.random() * 3);
    }

    public String getName() {
        return name;
    }
}
