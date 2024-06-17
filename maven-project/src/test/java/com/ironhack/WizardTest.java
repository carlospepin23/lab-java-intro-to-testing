//Author: Carlos J. Pepin Delgado <carlos.pepin1@upr.edu>

package com.ironhack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WizardTest {

    private Wizard wizard1;
    private Wizard wizard2;

    @BeforeEach
    void setUp() {
        wizard1 = new Wizard(100, 50, 3, 50);
        wizard2 = new Wizard(99, 49, 2);


    }

    @Test
    void testGetSpell() {
        assertEquals(50, wizard1.getSpell());
        assertEquals(100, wizard2.getSpell());

    }

    @Test
    void testConvertToElf1() {
        Elf elf1 = wizard1.convertToElf();

        assertEquals(100, elf1.getHealth());
        assertEquals(50, elf1.getStealth());
        assertEquals(3, elf1.getLives());
        assertEquals(50, elf1.getSpeed());
    }

    @Test
    void testConvertToElf2() {
        Elf elf2 = wizard2.convertToElf();

        assertEquals(99, elf2.getHealth());
        assertEquals(49, elf2.getStealth());
        assertEquals(2, elf2.getLives());
        assertEquals(100, elf2.getSpeed());
    }

    @Test
    void testDecrementLive1(){
        assertEquals(100, wizard1.getHealth());
        assertEquals(3, wizard1.getLives());
        wizard1.decrementLive();
        assertEquals(100, wizard1.getHealth());
        assertEquals(2, wizard1.getLives());
        wizard1.decrementLive();
        assertEquals(100, wizard1.getHealth());
        assertEquals(1, wizard1.getLives());
        wizard1.decrementLive();
        assertEquals(100, wizard1.getHealth());
        assertEquals(0, wizard1.getLives());

    }

    @Test
    void testDecrementLive2(){
        assertEquals(99, wizard2.getHealth());
        assertEquals(2, wizard2.getLives());
        wizard2.decrementLive();
        assertEquals(100, wizard2.getHealth());
        assertEquals(1, wizard2.getLives());
        wizard2.decrementLive();
        assertEquals(100, wizard2.getHealth());
        assertEquals(0, wizard2.getLives());

    }

    @Test
    void testCheckHealth1(){
        assertEquals(100, wizard1.getHealth());
        assertEquals(3, wizard1.getLives());
        wizard1.setHealth(0);
        wizard1.checkHealth();
        assertEquals(100, wizard1.getHealth());
        assertEquals(2, wizard1.getLives());
        wizard1.setHealth(0);
        wizard1.checkHealth();
        assertEquals(100, wizard1.getHealth());
        assertEquals(1, wizard1.getLives());
        wizard1.setHealth(0);
        wizard1.checkHealth();
        assertEquals(100, wizard1.getHealth());
        assertEquals(0, wizard1.getLives());
    }

    @Test
    void testCheckHealth2(){
        assertEquals(99, wizard2.getHealth());
        assertEquals(2, wizard2.getLives());
        wizard2.setHealth(0);
        wizard2.checkHealth();
        assertEquals(100, wizard2.getHealth());
        assertEquals(1, wizard2.getLives());
        wizard2.setHealth(55);
        wizard2.checkHealth();
        assertEquals(55, wizard2.getHealth());
        assertEquals(1, wizard2.getLives());

    }

    @Test
    void testAttack(){
        assertEquals(99, wizard2.getHealth());
        wizard1.attack(wizard2);
        assertEquals(49, wizard2.getHealth());

        wizard2.attack(wizard1);
        assertEquals(51, wizard1.getHealth());


    }


}