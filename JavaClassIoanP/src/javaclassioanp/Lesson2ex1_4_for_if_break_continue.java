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
public class Lesson2ex1_4_for_if_break_continue {
    public static void main (String[] args){
        int[] NumA = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 200, 300, 400}; //
        int Sum = 0;//
        for (int x : NumA){ //
            System.out.println ("val x is: " + x);//
            if (x == 70){ //
                continue; //
            }
            Sum += x;
            if (Sum > 400){
                break;
            }
            System.out.println ("val Sum este : " + Sum);
        }
    }
}
