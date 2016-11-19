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
import java.util.Scanner;
public class Lesson2ex3_2_switch_scanner {
    public static void main (String[] args){
        Scanner InC = new Scanner(System.in);
        System.out.println ("Insert my name please.");
        String NameC = InC.nextLine();
        switch (NameC){
            case "Ioan":
                System.out.println (NameC + " is my first name.");
                break;
            case "Poclitaru":
                System.out.println (NameC + " is my surname.");
                break;
            default: System.out.println (NameC + " is not any of my names.");
        }
        System.out.println("See you.");
    }
    
}
