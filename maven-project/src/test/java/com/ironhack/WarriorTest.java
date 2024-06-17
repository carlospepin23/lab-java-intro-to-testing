//Author: Carlos J. Pepin Delgado <carlos.pepin1@upr.edu>

package com.ironhack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarriorTest{

    private Warrior warrior1;
    private Warrior warrior2;

    @BeforeEach
    void setUp() {
        warrior1 = new Warrior(100, 50, 3, 50);
        warrior2 = new Warrior(99, 49, 2);


    }

    @Test
    void testGetForce() {
        assertEquals(50, warrior1.getForce());
        assertEquals(100, warrior2.getForce());

    }

    @Test
    void testConvertToElf1() {
        Elf elf1 = warrior1.convertToElf();

        assertEquals(100, elf1.getHealth());
        assertEquals(50, elf1.getStealth());
        assertEquals(3, elf1.getLives());
        assertEquals(50, elf1.getSpeed());
    }

    @Test
    void testConvertToElf2() {
        Elf elf2 = warrior2.convertToElf();

        assertEquals(99, elf2.getHealth());
        assertEquals(49, elf2.getStealth());
        assertEquals(2, elf2.getLives());
        assertEquals(100, elf2.getSpeed());
    }

    @Test
    void testDecrementLive1(){
        assertEquals(100, warrior1.getHealth());
        assertEquals(3, warrior1.getLives());
        warrior1.decrementLive();
        assertEquals(100, warrior1.getHealth());
        assertEquals(2, warrior1.getLives());
        warrior1.decrementLive();
        assertEquals(100, warrior1.getHealth());
        assertEquals(1, warrior1.getLives());
        warrior1.decrementLive();
        assertEquals(100, warrior1.getHealth());
        assertEquals(0, warrior1.getLives());

    }

    @Test
    void testDecrementLive2(){
        assertEquals(99, warrior2.getHealth());
        assertEquals(2, warrior2.getLives());
        warrior2.decrementLive();
        assertEquals(100, warrior2.getHealth());
        assertEquals(1, warrior2.getLives());
        warrior2.decrementLive();
        assertEquals(100, warrior2.getHealth());
        assertEquals(0, warrior2.getLives());

    }

    @Test
    void testCheckHealth1(){
        assertEquals(100, warrior1.getHealth());
        assertEquals(3, warrior1.getLives());
        warrior1.setHealth(0);
        warrior1.checkHealth();
        assertEquals(100, warrior1.getHealth());
        assertEquals(2, warrior1.getLives());
        warrior1.setHealth(0);
        warrior1.checkHealth();
        assertEquals(100, warrior1.getHealth());
        assertEquals(1, warrior1.getLives());
        warrior1.setHealth(0);
        warrior1.checkHealth();
        assertEquals(100, warrior1.getHealth());
        assertEquals(0, warrior1.getLives());
    }

    @Test
    void testCheckHealth2(){
        assertEquals(99, warrior2.getHealth());
        assertEquals(2, warrior2.getLives());
        warrior2.setHealth(0);
        warrior2.checkHealth();
        assertEquals(100, warrior2.getHealth());
        assertEquals(1, warrior2.getLives());
        warrior2.setHealth(55);
        warrior2.checkHealth();
        assertEquals(55, warrior2.getHealth());
        assertEquals(1, warrior2.getLives());

    }

    @Test
    void testAttack(){
        assertEquals(99, warrior2.getHealth());
        warrior1.attack(warrior2);
        assertEquals(49, warrior2.getHealth());

        warrior2.attack(warrior1);
        assertEquals(51, warrior1.getHealth());


    }


}