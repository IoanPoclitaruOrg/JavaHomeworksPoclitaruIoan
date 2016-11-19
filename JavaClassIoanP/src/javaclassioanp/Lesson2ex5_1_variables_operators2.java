/*
 * Lesson2. Exercise 5. Java primitive variables & operators.
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
public class Lesson2ex5_1_variables_operators2 {
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
        
    System.out.println("***First part of the exercise is done.\n\nSecond part, 'operators' will follow.");
    // start Arithmetic operators
    System.out.println("\n1. Arithmetic operators\n");
    //
    System.out.println("IntG + FloatF = FloatGF");
    float FloatGF = IntG + FloatF;
    System.out.println(IntG + " + " + FloatF + " = " + FloatGF + "\n");
    System.out.println("CharC + StringJ = StringCJ");
    String StringCJ = CharC + StringJ;
    System.out.println(CharC + " + " + StringJ + " = " + StringCJ + "\n");
    System.out.println("FloatF - IntG = FloatFG");
    float FloatFG = FloatF - IntG;
    System.out.println(FloatF + " - " + IntG + " = " + FloatFG + "\n");
    System.out.println("IntG * FloatF = FloatGxF");
    float FloatGxF = IntG * FloatF;
    System.out.println(IntG + " * " + FloatF + " = " + FloatGxF + "\n");
    System.out.println("FloatF / IntG = FloatGdivF");
    float FloatGdivF = FloatF / IntG;
    System.out.println(FloatF + " / " + IntG + " = " + FloatGdivF + "\n");
    //start unary operators
    System.out.println("\n2. Unary operators\n");
    //
    System.out.println("- IntG = IntGnegative");
    int IntGnegative = - IntG;
    System.out.println(IntG + " with sign changed = " + IntGnegative + "\n");
    //
    System.out.println("increment prefix IntG = IntGinc");
    int IntGin = IntG;
    int IntGinc = ++ IntG;
    System.out.println("++" + IntGin + " = " + IntGinc + "\n");
    //
    System.out.println("increment postfix IntG = IntGinc1");
    IntGin = IntG;
    int IntGinc1 = IntG++;
    int IntGinc2 = IntG;
    System.out.println(IntGin + "++" + " = " + IntGinc1 + ". One step later = " + IntGinc2 + "\n");
    //
    System.out.println("decrement prefix IntGinc = IntG");
    int IntGi = IntGinc;
    int IntGg = -- IntGinc;
    System.out.println("--" + IntGi + " = " + IntGg + "\n");
    //
    System.out.println("decrement postfix IntGinc = IntG");
    IntGi = IntGinc1;
    IntGg = IntGinc1--;
    int IntGg1 = IntGinc1;
    System.out.println(IntGi + "-- = " + IntGg + ". One step later = " + IntGg1 + "\n");
    //
    System.out.println("complemented BooleanA = BooleanB");
    boolean BooleanB = ! BooleanA;
    System.out.println("!(" + BooleanA + ") = " + BooleanB + "\n");
    //start Equality and Relational operators
    System.out.println("\n2. Equality and Relational operators\n");
    //
    System.out.println("(is IntG equal to IntGinc?) = BooleanC");
    boolean BooleanC = (IntG == IntGinc);
    System.out.println("(" + IntG + " == " + IntGinc + ") = " + BooleanC + "\n");
    
    System.out.println("(is IntG not equal to IntGin?) = BooleanD");
    boolean BooleanD = (IntG != IntGinc);
    System.out.println("(" + IntG + " != " + IntGinc + ") = " + BooleanD + "\n");
    
    System.out.println("(is IntG > IntGinc?) = BooleanE");
    boolean BooleanE = (IntG > IntGinc);
    System.out.println("(" + IntG + " > " + IntGinc + ") = " + BooleanE + "\n");
    
    System.out.println("(is IntG >= IntGinc?) = BooleanF");
    boolean BooleanF = (IntG >= IntGinc);
    System.out.println("(" + IntG + " >= " + IntGinc + ") = " + BooleanF + "\n");
    
    System.out.println("(is IntG < IntGinc?) = BooleanG");
    boolean BooleanG = (IntG < IntGinc);
    System.out.println("(" + IntG + " < " + IntGinc + ") = " + BooleanG + "\n");
    
    System.out.println("(is IntG <= IntGinc?) = BooleanH");
    boolean BooleanH = (IntG <= IntGinc);
    System.out.println("(" + IntG + " <= " + IntGinc + ") = " + BooleanH + "\n");
    
    System.out.println("(is (IntG > 1) AND (IntGinc <= 100?)) = BooleanI");
    boolean BooleanI = ((IntG > 1) && (IntGinc <= 100));
    System.out.println("(" + IntG + ">1) && (" + IntGinc + "<=100) = " + BooleanI + "\n");
    
    System.out.println("(is (IntG < 10) OR (IntGinc > 10?)) = BooleanJ");
    boolean BooleanJ = ((IntG < 10) || (IntGinc > 10));
    System.out.println("(" + IntG + "<10) || (" + IntGinc + ">10) = " + BooleanJ + "\n");
    // ternary operator
    System.out.println("test condition ? statement if true : statment if false");
    System.out.println("IntGinc=" + IntGinc + " ; IntG=" + IntG);
    System.out.println("IntGinc = (IntG > 10 ? 0 : 100)");
    IntGinc = (IntG > 10 ? 0 : 100);
    System.out.println("IntGinc=" + IntGinc + " ; IntG=" + IntG + "\n");
    //
    System.out.println("StringK = (StringJ equals Ioan) ? StringJ : Ioan)");
    String StringK = (StringJ.equals("Ioan") ? StringJ : "Ioan");
    System.out.println("StringJ=" + StringJ + " ; StringK=" + StringK + "\n");
    System.out.println("\n *** End exercise variables & operators");
    
    }
}
