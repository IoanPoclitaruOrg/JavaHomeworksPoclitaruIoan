/*
 * Lesson 2, exercise 4. 
 */
package javaclassioanp;

/**
 * Apply while loop and scanner. Ask the user to correctly introduce Ioan's 
 * name thru the keyboard. Make a loop till the correct name is introduced. 
 * Once done, display the name. 
 * @author poclitar
 */
import java.util.Scanner;
public class Lesson2ex4_1_while_scanner {
    public static void main (String[] args){ // activate the method
        String NameA = null; /* declare string 'NameA' and initialize it with 
        * null value */
        Scanner InA = new Scanner(System.in); /* declare variable 'InA' as host
        * for kbd input */
        System.out.println("Please introduce my name."); /* display the 
        * invitation to introduce the name */
        while (!"Ioan".equals(NameA)){ // start loop on variable 'NameA' 
            NameA = InA.nextLine(); /* allocate a new value from kbd to 
            * string 'NameA'  */
            if (NameA.equals ("Ioan")){ 
                break; // exit the loop if correct name is introduced
            }
            System.out.println(NameA + " is not my name."); /* display name 
            * if incorrect with a correspondent message */
        }
        System.out.println("Correct, " + NameA + " is my name!"); // confirm 
        // the name
        System.out.println("Bye!"); //
    } 
    
    
}
