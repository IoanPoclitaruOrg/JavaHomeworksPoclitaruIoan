/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclassioanp;

/**
 *
 * @author poclitar
 */
public class Lesson2ex1_1 {
    public static void main (String[] args){ //
        int[] NumbersA = {10, 20, 30, 40, 50, 60, 70, 80, 90}; //
        //
        int Sum = 0; //
        for (int x : NumbersA){ //
            if (x == 50){ //
                continue; //
            }
            Sum += x; //
            if (Sum > 150) {
                break; //
            }
            System.out.println ("x value is: " + x); //
        }
        System.out.println("Sum value is: " + Sum); //
    }

}
