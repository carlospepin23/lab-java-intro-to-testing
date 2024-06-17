//Author: Carlos J. Pepin Delgado <carlos.pepin1@upr.edu>

package com.ironhack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    //NUMBER TO ODD ARRAY
    public static int[] numberToOddArray(int number){
        int[] arr = new int[number];
        int length = 0;
        for (int i = 0; i < number+1; i++) {
            if(i % 2 != 0){
                arr[length] = i;
                length++;
            }
        }
        int[] arr2 = new int[length];
        for (int i = 0; i < length; i++) {
//            System.out.println(arr[i]);
            arr2[i] = arr[i];
        }
        return arr2;
    }

    //JAVA KEYWORDS
    public static boolean containsJavaKeyword(String text){
        String[] javaKeywords = {
                "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const",
                "continue", "default", "do", "double", "else", "enum", "extends", "final", "finally", "float",
                "for", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native",
                "new", "null", "package", "private", "protected", "public", "return", "short", "static", "strictfp",
                "super", "switch", "synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile", "while"
        };

        for(String word:javaKeywords){
            for(String word2:text.split(" ")){
                if(word.equals(word2)){
                    return true;
                }
            }
        }
        return false;
    }

}