/*
 * Lesson 2. Exercise 6. Apply Do-While loop. Import 2 values from kbd.
 */
package javaclassioanp;

/**
 * Find the mid point between 2 values, minim and max, by incrementing 
 * the minim and decrementing max value till they reach the mid point 
 * (next integer).
 * @author poclitar
 */
import java.util.Scanner;
public class Lesson2ex6_1_do_while_scanner {
    public static void main (String[] args) {
        System.out.println("Introduce FloatA = the minim value"); /* display the 
        * text to get minim value from kbd. */
        Scanner InputA = new Scanner(System.in); // activate kbd import. 
        float FloatA = InputA.nextFloat(); // allocate the minim to FloatA.
        System.out.println("Introduce FloatB = the max value"); /* display the 
        * text to get the max value from kbd. */
        Scanner InputB = new Scanner(System.in); // activate kbd import.
        float FloatB = InputB.nextFloat(); // allocate the max to IntB.
        float Mid = ((FloatA + FloatB) / 2); // calculate the average of (FloatA + FloatB).
        System.out.println("Mid = " + Mid); // display the average of (FloatA + FloatB).
        do {
            ++FloatA; // increment FloatA.
            System.out.println("FloatA = " + FloatA); // display FloatA after 
            // incrementation.
            --FloatB; // decrement FloatB.
            System.out.println("FloatB = " + FloatB); // display FloatB after
            // decrementation.
        } while ((FloatA - FloatB ) < -1 ); // close the loop. 
        System.out.println("\nMid = " + Mid + "; FloatA = " + FloatA + " ; FloatB = " + FloatB);
        System.out.println("End of Lesson2ex6_1");
    }
}

    
