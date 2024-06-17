//Author: Carlos J. Pepin Delgado <carlos.pepin1@upr.edu>

package com.ironhack;

public class Warrior extends Player{

    //PRIVATE PROPERTIES
    private int force;

    //CONSTANT
    public static final int FORCE = 100;

    //CONSTRUCTORS
    public Warrior(int health, int stealth, int lives) {
        super(health, stealth, lives);
        setForce(FORCE);
    }

    public Warrior(int health, int stealth, int lives, int force) {
        super(health, stealth, lives);
        setForce(force);
    }

    //GETTERS & SETTERS
    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    //METHODS
    public Elf convertToElf(){
        return new Elf(this.getHealth(), this.getStealth(), this.getLives(), this.getForce());
    };

}
