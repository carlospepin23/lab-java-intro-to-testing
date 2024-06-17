//Author: Carlos J. Pepin Delgado <carlos.pepin1@upr.edu>

package com.ironhack;

public class Elf extends Player{

    private int speed;

    //CONSTANT
    public static final int SPEED = 100;

    //CONSTRUCTOR
    public Elf(int health, int stealth, int lives) {
        super(health, stealth, lives);
        setSpeed(SPEED);
    }

    public Elf(int health, int stealth, int lives, int speed) {
        super(health, stealth, lives);
        setSpeed(speed);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
