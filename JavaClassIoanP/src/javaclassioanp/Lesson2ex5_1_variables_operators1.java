/*
 * Lesson2. Exercise 5_1_variables_operators1. Java primitive variables & operators.
 */
package javaclassioanp;

/**
 * Create variables having one of the 8 standard types we defined in java 
 * (from int to... boolean). Display in console all possible operations 
 * (apply all operators) for all standard types.
 * Java primitive variables: boolean, byte, char, double, float; int, long,
 * short + string.
 * @author poclitar
 */
import java.util.Scanner;
public class Lesson2ex5_1_variables_operators1 {
    public static void main (String[] args){
    
    // declare boolean variable 'BooleanA'.
    System.out.println("Introduce a value for BooleanA");
    Scanner InA = new Scanner(System.in);
    boolean BooleanA = InA.nextBoolean();
    System.out.println("The value of BooleanA is: " + BooleanA + "\n");
    
    // declare byte variable "ByteB".
    System.out.println("Introduce a value for ByteB");
    Scanner InB = new Scanner(System.in);
    byte ByteB = InB.nextByte();
    System.out.println("The value of ByteB is: " + ByteB + "\n");
    
    // declare char variable 'CharC'.
    System.out.println("Introduce a value for CharC");
    Scanner InC = new Scanner(System.in);
    char CharC = InC.next().charAt(0);
    System.out.println("The value of CharC is: " + CharC + "\n");
    
    // declare double variable 'DoubleD'.
    System.out.print("Introduce a value for DoubleD\n");
    Scanner InD = new Scanner(System.in);
    double DoubleD = InD.nextDouble();
    System.out.println("The value of DoubleD is: " + DoubleD + "\n");
    
    // declare float variable 'FloatF'.
    System.out.println("Introduce a value for FloatF");
    Scanner InF = new Scanner(System.in);
    float FloatF = InF.nextFloat();
    System.out.println("The value of FloatF is: " + FloatF + "\n");
    
    // declare int variable 'IntG'.
    System.out.println("Introduce a value for IntG");
    Scanner InG = new Scanner(System.in);
    int IntG = InG.nextInt();
    System.out.println("The value of IntG is: " + IntG + "\n");
    
    // declare long variable 'LongH'.
    System.out.println("Introduce a value for LongH");
    Scanner InH = new Scanner(System.in);
    long LongH = InH.nextLong();
    System.out.println("The value of LongH is: " + LongH + "\n");
    
    // declare short variable 'ShortI'.
    System.out.println("Introduce a value for ShortI");
    Scanner InI = new Scanner(System.in);
    short ShortI = InI.nextShort();
    System.out.println("The value of ShortI is: " + ShortI + "\n");
    
    // declare string variable 'StringJ'.
    System.out.println("introduce a value for StringJ");
    Scanner InJ = new Scanner(System.in);
    String StringJ = InJ.nextLine();
    System.out.println("The value of StringJ is: " + StringJ + "\n");
        
    System.out.println("First part of the exercise is done.\nSecond part, operators will follow.");
    
    }
}
