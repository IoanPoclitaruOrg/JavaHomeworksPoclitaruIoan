/*
 * Course 2. Class exercises.
 * Reworked.
 */
package javaclassioanp;

/**
 * Exercise For Loop, Continue and Break instructions.
 * @author poclitar
 */
public class Lesson2ex1_2 {
    public static void main (String[] args) {
        int[] NumbersA = {10, 20, 30, 40, 50, 60, 70, 80, 90}; //declare 
        // integer 'NumbersA' and its set of values.  
        int Sum = 0 ; // declare integer 'Sum' and initialize it to zero.
        for (int x : NumbersA){ // start loop 1 using 'NumbersA'
            if (x == 50){ // jump over this value
                continue ; //                
            }
            Sum += x ; // declare computation of 'Sum'
            if (Sum > 250){ // exit condition
                break; //
            }
            System.out.println ("Value of x is: " + x); //display 'x'
        }
        System.out.println ("Sum value is: " + Sum); // display 'Sum'
    }
    
}
