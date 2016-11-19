package javaclassioanp;

/*
 * Class Lesson2ex5_2_AssignmentOperators. Exemplify the operators.  
 */

/**
 * Examples with assignment operators. 
 * @author poclitar
 */

public class Lesson2ex5_2_AssignmentOperators {
    public static void main (String[] args){
    int a = 2;
    int b = 4;
    int c;
    System.out.println("a = " + a + " (0000 0010)\n" + "b = " + b + " (0000 0100)");
    //
    System.out.println("c = a + b (simple assignment operator): " + (c = a + b));
    System.out.println("c += a is equivalent to c = c + a (Add AND assignment operator): " + (c += a));
    System.out.println("c -= a is equivalent to c = c – a (Subtract AND assignment operator): " + (c -= a));
    System.out.println("c *= a is equivalent to c = c * a (Multiply AND assignment operator): " + (c *= a));
    System.out.println("c /= a is equivalent to c = c / a (Divide AND assignment operator): " + (c /= a));
    System.out.println("c %= a is equivalent to c = c % a (Modulus AND assignment operator): " + (c %= a));
    System.out.println("a <<= 2 is equivalent to a = a << 2 (Left shift AND assignment operator = 8 = 0000 1000): " + (a <<= 2));
    System.out.println("b >>= 2 is equivalent to b = b >> 2 (Right shift AND assignment operator = 1 = 0000 0001): " + (b >>= 2));
    System.out.println("b &= 2 is equivalent to b = b & 2 (Bitwise AND assignment operator = 0 = 0000 0000): " + (b &= 2));
    System.out.println("a ^= 10 is equivalent to a = a ^ 10 (Bitwise exclusive OR = XOR assignment operator = 2 = 0000 0010): " + (a ^= 10));
    System.out.println("a |= 8 is equivalent to a = a | 8 (Bitwise inclusive OR assignment operator = 10 = 0000 1010): " + (a |= 8));
    }
    
}
