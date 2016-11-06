/*
 * Lesson 2, homework 1.
 */
package javaclassioanp;

/**
 * Create a short Java program that reads your name from keyboard and 
 * writes it to console (in NetBeans).
 * @author poclitar
 */
import java.util.Scanner;
public class Lesson2Homework1 {
        public static void main (String[] args){
            Scanner Scan = new Scanner(System.in); /* initialize 'Scan' as 
            * keyboard input variable. */
            System.out.println ("Introduce your name please: "); // display text.
            String Name = Scan.nextLine(); 
            // declare variable 'Name' as host for keyboard input string.
            System.out.println ("Your name is " + Name); // display var 'Name'.
        
    }
}
