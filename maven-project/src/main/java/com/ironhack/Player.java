//Author: Carlos J. Pepin Delgado <carlos.pepin1@upr.edu>

package com.ironhack;

public abstract class Player {
    private int health;
    private int stealth;
    private int lives;

    //CONSTANT
    public static final int MAX_HEALTH = 100;

    //CONSTRUCTOR
    public Player(int health, int stealth, int lives) {
        setHealth(health);
        setStealth(stealth);
        setLives(lives);
    }

    //GETTERS & SETTERS
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStealth() {
        return stealth;
    }

    public void setStealth(int stealth) {
        this.stealth = stealth;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    //METHODS
    public void decrementLive(){
        setLives(this.getLives()-1);
        setHealth(MAX_HEALTH);
        if(this.getLives()<=0){
            System.out.println("This character is dead");
        }
    }

    public void checkHealth(){
        if(this.getHealth()<=0){
            decrementLive();
        }
    }

    public void attack(Player playerToAttack){
        playerToAttack.setHealth(playerToAttack.getHealth()-this.getStealth());

    }

}
