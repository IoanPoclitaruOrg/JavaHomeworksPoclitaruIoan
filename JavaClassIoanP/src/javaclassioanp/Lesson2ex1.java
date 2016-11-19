/*
 * Course 2. Class exercises.
 * 
 */
package javaclassioanp;

/**
 * Exercise For loop, continue and break instructions.
 * @author poclitar
 */
public class Lesson2ex1 {
    public static void main (String[] args){
        int[] NumbersA = {10, 20, 30, 40, 50}; // declare integer 'NumbersA' and 
        // its set of values
        int sum = 0; // declare integer 'sum' and initialize it to zero
        for (int x : NumbersA){ // start loop 1 using 'NumbersA'
            if (x == 30){ // condition for continue, jump over this value
                continue;
            }
            sum += x; // declare computation of 'sum'
            if (sum > 100) { // exit condition
                break; //
            }
            System.out.println ("Value of x based on NumbersA string is: " + x);
            // display x
            System.out.println ("\n"); // CR
        }
        System.out.println ("sum is: " + sum); // disply 'sum'
        
    }
    
}
