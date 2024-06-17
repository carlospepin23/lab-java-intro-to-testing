//Author: Carlos J. Pepin Delgado <carlos.pepin1@upr.edu>

package com.ironhack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    //NUMBER TO ODD ARRAY
    @Test
    void numberToOddArray() {
        int[] arr = Main.numberToOddArray(10);
        assertEquals(5, arr.length);
        assertEquals(1, arr[0]);
        assertEquals(3, arr[1]);
        assertEquals(5, arr[2]);
        assertEquals(7, arr[3]);
        assertEquals(9, arr[4]);


    }

    @Test
    void numberToOddArray2() {
        int[] arr = Main.numberToOddArray(5);
        assertEquals(3, arr.length);
        assertEquals(1, arr[0]);
        assertEquals(3, arr[1]);
        assertEquals(5, arr[2]);
    }

    @Test
    void numberToOddArray3() {
        int[] arr = Main.numberToOddArray(1);
        assertEquals(1, arr.length);
        assertEquals(1, arr[0]);
    }

    @Test
    void numberToOddArray4() {
        int[] arr = Main.numberToOddArray(0);
        assertEquals(0, arr.length);
    }

    //JAVA KEYWORDS
    @Test
    void containsJavaKeyword() {
        assertTrue(Main.containsJavaKeyword("Don't break my heart"));
        assertFalse(Main.containsJavaKeyword("I love to breakdance"));
        assertTrue(Main.containsJavaKeyword("the truth is, that i dont know if i can do this"));
        assertFalse(Main.containsJavaKeyword("I am a Java Developer"));

    }
}