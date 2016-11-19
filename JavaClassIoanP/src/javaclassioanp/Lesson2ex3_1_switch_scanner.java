/*
 * Lesson 2. Exercise 3_1.
 */
package javaclassioanp;

/**
 * Foloseste scanner and switch
 * @author poclitar
 */
import java.util.Scanner;
public class Lesson2ex3_1_switch_scanner {
    public static void main (String[] args) {
        Scanner InB = new Scanner(System.in); // alocate 'InB' for kbd input 
        System.out.println ("Guess my name please"); // display info text
        String NameB = InB.nextLine(); // declare string 'NameB' to host 'InB'
        switch (NameB){ // evaluate var 'nameB'
            case "Ioan":
                System.out.println (NameB + " is my first name :-)");
                break;
            case "Poclitaru":
                System.out.println (NameB + " is my surname :-)");
                break;
            default: System.out.println ("Didn't guess any of my names.");
        } 
        System.out.println ("See you another time.");
    } 
}
