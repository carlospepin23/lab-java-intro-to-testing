//Author: Carlos J. Pepin Delgado <carlos.pepin1@upr.edu>

package com.ironhack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElfTest {

    private Elf elf1;
    private Elf elf2;

    @BeforeEach
    void setUp() {
        elf1 = new Elf(100, 50, 3, 50);
        elf2 = new Elf(99, 49, 2);


    }

    @Test
    void testGetSpeed() {
        assertEquals(50, elf1.getSpeed());
        assertEquals(100, elf2.getSpeed());

    }

    @Test
    void testDecrementLive1(){
        assertEquals(100, elf1.getHealth());
        assertEquals(3, elf1.getLives());
        elf1.decrementLive();
        assertEquals(100, elf1.getHealth());
        assertEquals(2, elf1.getLives());
        elf1.decrementLive();
        assertEquals(100, elf1.getHealth());
        assertEquals(1, elf1.getLives());
        elf1.decrementLive();
        assertEquals(100, elf1.getHealth());
        assertEquals(0, elf1.getLives());

    }

    @Test
    void testDecrementLive2(){
        assertEquals(99, elf2.getHealth());
        assertEquals(2, elf2.getLives());
        elf2.decrementLive();
        assertEquals(100, elf2.getHealth());
        assertEquals(1, elf2.getLives());
        elf2.decrementLive();
        assertEquals(100, elf2.getHealth());
        assertEquals(0, elf2.getLives());

    }

    @Test
    void testCheckHealth1(){
        assertEquals(100, elf1.getHealth());
        assertEquals(3, elf1.getLives());
        elf1.setHealth(0);
        elf1.checkHealth();
        assertEquals(100, elf1.getHealth());
        assertEquals(2, elf1.getLives());
        elf1.setHealth(0);
        elf1.checkHealth();
        assertEquals(100, elf1.getHealth());
        assertEquals(1, elf1.getLives());
        elf1.setHealth(0);
        elf1.checkHealth();
        assertEquals(100, elf1.getHealth());
        assertEquals(0, elf1.getLives());
    }

    @Test
    void testCheckHealth2(){
        assertEquals(99, elf2.getHealth());
        assertEquals(2, elf2.getLives());
        elf2.setHealth(0);
        elf2.checkHealth();
        assertEquals(100, elf2.getHealth());
        assertEquals(1, elf2.getLives());
        elf2.setHealth(55);
        elf2.checkHealth();
        assertEquals(55, elf2.getHealth());
        assertEquals(1, elf2.getLives());

    }

    @Test
    void testAttack(){
        assertEquals(99, elf2.getHealth());
        elf1.attack(elf2);
        assertEquals(49, elf2.getHealth());

        elf2.attack(elf1);
        assertEquals(51, elf1.getHealth());


    }


}