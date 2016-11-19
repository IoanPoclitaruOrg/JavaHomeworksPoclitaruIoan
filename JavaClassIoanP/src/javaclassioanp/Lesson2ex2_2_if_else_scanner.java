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
public class Lesson2ex2_2_if_else_scanner {
    public static void main (String[] args) {
        Scanner InC = new Scanner(System.in);
        System.out.println ("Introduce my first name");
        String NameC = InC.nextLine();
        if (NameC.equals("Ioan")){
            System.out.println ("Correct, " + NameC + " is my first name.");
        } else {
            System.out.println ("Wrong, " + NameC + " is not my first name.");
        }
        System.out.println ("Bye!");
    } 
}
