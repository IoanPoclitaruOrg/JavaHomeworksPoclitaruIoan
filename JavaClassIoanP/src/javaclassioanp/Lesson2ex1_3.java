/*
 * Ex For, Loop, Continue, Break.
 */
package javaclassioanp;

/**
 * lesson 2 - Exercise 1.3 version
 * @author poclitar
 */
public class Lesson2ex1_3 {
    public static void main (String[] args){
        int[] NumbersA = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 200, 300}; // 
        // declare 'NumbersA'.
        int Sum = 0; // declare and init 'Sum'.
        for (int x : NumbersA){ // start  loop for x = 'NumbersA'.
            if (x == 50){ // jump over this value.
                System.out.println ("Jump over this x value: " + x); /*
                * display x value for jump condition. */ 
                continue; //
            }
            Sum += x; // compute 'Sum' formula.
            if (Sum > 400){ // condition for exit.
                break;
            }
            System.out.println ("For this x value of: " + x + ", the Sum of"
                    + " NumbersA elements is: " + Sum); /* display iterations
                    * of x and Sum */
        }
        System.out.println ("Final Sum value is: " + Sum); // display Sum
    }
    
}
