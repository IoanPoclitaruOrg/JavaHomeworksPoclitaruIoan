package javaclassioanp;

/*
 * Class Lesson2ex5_2_ArithmeticOperators. Exemplify the operators.  
 */

/**
 * Examples with arithmetic operators. 
 * @author poclitar
 */
import java.util.Scanner;

public class Lesson2ex5_2_ArithmeticOperators {
    public static void main (String[] args){
            System.out.println("2016.11.20.\n3. Operators");
    Scanner inputA= new Scanner (System.in);
    System.out.println("Insert variable inputA: ");
    int var_a = inputA.nextInt();
    int var_b = var_a * 10;
    System.out.println("var_b = var_a * 10 = " + var_b);
    //
    System.out.println("Arithmetic operators");
    System.out.println("Additive: var_b + 7 = " + (var_b + 7));
    System.out.println("Subtraction: var_b - 7 = " + (var_b - 7));
    System.out.println("Multiplication: var_b * 7 = " + (var_b * 7));
    System.out.println("Division: var_b / 7 = " + (var_b / 7));
    System.out.println("Modulus: var_b % 7 = " + (var_b % 7));
    
    
    }
    
}
