package javaclassioanp;

/*
 * Class Lesson2ex5_2_BitwiseOperators. Exemplify the operators.  
 */

/**
 * Examples with bitwise operators. 
 * @author poclitar
 */

public class Lesson2ex5_2_BitwiseOperators {
    public static void main (String[] args){
    int a = 60;
    int b = 13;
    System.out.println("a = 60 = 0011 1100 \nb = 13 = 0000 1101");
    //
    System.out.println("& (bitwise and): (a & b) will give "+(a & b)+" which is 0000 1100: 12");
    System.out.println("| (bitwise or): (a | b) will give "+(a | b)+" which is 0011 1101: 61");
    System.out.println("^ (bitwise XOR): (a ^ b) will give "+(a ^ b)+" which is 0011 0001: 49");
    System.out.println("~ (bitwise compliment): (~a ) will give "+(~a)+" which is \n"
            + "1100 0011: -61 in 2's complement form due to a signed binary number");
    System.out.println("<< (left shift): a << 2 will give "+(a<<2)+" which is 1111 0000: 240");
    System.out.println(">> (right shift): a >> 2 will give "+(a>>2)+" which is 0000 1111: 15");
    System.out.println(">>> (zero fill right shift): a >>> 3 will give "+(a>>>3)+" which is 0000 0111: 7");    
    }
    
}
