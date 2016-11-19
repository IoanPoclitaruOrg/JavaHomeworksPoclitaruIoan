package javaclassioanp;

/*
 * Class Lesson2ex5_2_UnaryOperators. Exemplify the operators.  
 */

/**
 * Example with unary operators. 
 * @author poclitar
 */
import java.util.Scanner;

public class Lesson2ex5_2_UnaryOperators {
    public static void main (String[] args){
    Scanner inputA= new Scanner (System.in);
    System.out.println("Insert variable var_a: ");
    int var_a = inputA.nextInt();
    int var_b = var_a * 10;
    System.out.println("var_b = var_a * 10 = " + var_b);
    //
    System.out.println("Unary operators");
    System.out.println("Plus: +var_b = " + (+var_b));
    System.out.println("Minus: -var_b = " + (-var_b));
    System.out.println("Increment prefix: ++var_b = " + (++var_b));
    System.out.println("Increment postfix: var_b++ = " + (var_b++));
    System.out.println("Decrement prefix: --var_b = " + (--var_b));
    System.out.println("Decrement postfix: var_b-- = " + (var_b--));
    
    }
    
}
