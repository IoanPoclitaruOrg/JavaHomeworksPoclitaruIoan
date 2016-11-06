/*
 * Lesson 2. Exercise 2.1
 */
package javaclassioanp;

/**
 * Foloseste if-else and scanner
 * @author poclitar
 */
import java.util.Scanner;
public class Lesson2ex2_1_if_else_scanner {
    public static void main (String[] args) {
        Scanner InA = new Scanner(System.in);
        System.out.println ("Guess my name please");
        String NumeA = InA.nextLine();
        if (NumeA.equals("Ioan")) {
            System.out.println ("Correct, " + NumeA + " is my name :-)");
        } else {
            System.out.println (NumeA + " is not my name");
        }
    }
}
