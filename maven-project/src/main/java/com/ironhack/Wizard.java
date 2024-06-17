//Author: Carlos J. Pepin Delgado <carlos.pepin1@upr.edu>

package com.ironhack;

public class Wizard extends Player{

    private int spell;

    //CONSTANT
    public static final int SPELL = 100;

    public Wizard(int health, int stealth, int lives) {
        super(health, stealth, lives);
        setSpell(SPELL);
    }

    public Wizard(int health, int stealth, int lives, int spell) {
        super(health, stealth, lives);
        setSpell(spell);
    }

    public int getSpell() {
        return spell;
    }

    public void setSpell(int spell) {
        this.spell = spell;
    }

    public Elf convertToElf(){
        return new Elf(this.getHealth(), this.getStealth(), this.getLives(), this.getSpell());
    };
}
