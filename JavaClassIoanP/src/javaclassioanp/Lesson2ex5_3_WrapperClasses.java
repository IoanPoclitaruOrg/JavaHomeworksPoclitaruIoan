package javaclassioanp;

/*
 * Lesson2ex5_3_WrapperClasses. Learn about primitive data and wrapper classes. 
 */

/**
 * Normally, when we work with Numbers, we use primitive data types such as byte, 
 * int, long, double, etc.
 * Example
 * int i = 5000;
 * float gpa = 13.65;
 * double mask = 0xaf;
 * However, in development, we come across situations where we need to use objects 
 * instead of primitive data types. In order to achieve this, Java provides wrapper classes.
 * All the wrapper classes (Integer, Long, Byte, Double, Float, Short) are subclasses of the abstract class Number.
 * Number Classes
 * The object of the wrapper class contains or wraps its respective primitive 
 * data type. Converting primitive data types into object is called boxing, 
 * and this is taken care by the compiler. Therefore, while using a wrapper class 
 * you just need to pass the value of the primitive data type to the constructor 
 * of the Wrapper class. And the Wrapper object will be converted back to a 
 * primitive data type, and this process is called unboxing. The Number class 
 * is part of the java.lang package.
 * https://www.tutorialspoint.com/java/java_numbers.htm 
 * @author poclitar
 */
public class Lesson2ex5_3_WrapperClasses {
    public static void main (String[] args){
        System.out.println("boxing / unboxing an int to an Integer object");
        Integer x = 100; // boxes int x to an Integer object
        x = x / 2;  // unboxes the Integer to an int and solve the operation
        System.out.println("x = " + x); // x =  1100
        //
        System.out.println("\nNUMBER METHODS");
        //
        //
        System.out.println("\n1; xxxValue()");
        /* xxxValue(); Converts the value of this Number object to the xxx 
        * data type and returns it. */
        Integer z = 5;
        System.out.println("Integer z = 5");
        // Returns byte primitive data type
        System.out.println("z.byteValue() = " + z.byteValue() );
        // Returns double primitive data type
        System.out.println("z.doubleValue() = " + z.doubleValue() );
        // Returns long primitive data type
        System.out.println("z.longValue() = " + z.longValue() ); 
        //
        //
        System.out.println("\n2; compareTo()");
        /* compareTo(); Compares this Number object to the argument. However, 
        * two different types cannot be compared, both the argument and the 
        * Number object invoking the method should be of the same type. 
        * referenceName − This could be a Byte, Double, Integer, Float, Long, or Short.
        * If the Integer is equal to the argument then 0 is returned.
        * If the Integer is less than the argument then -1 is returned. If the 
        * Integer is greater than the argument then 1 is returned.
        */
        Double y = 10.0;
        System.out.println("Double y = 10.0");
        System.out.println("y.compareTo(5.0) = " + y.compareTo(5.0) );
        System.out.println("y.compareTo(10.0) = " + y.compareTo(10.0) );
        System.out.println("y.compareTo(20.0) = " + y.compareTo(20.0) );
        //
        //
        System.out.println("\n3; equals()");
        /* Compares this Number object to the argument. The method determines 
        * whether the Number object that invokes the method is equal to the 
        * object that is passed as an argument. The method returns True if the 
        * argument is not null and is an object of the same type and with the 
        * same numeric value. */
        Integer w1 = 5;
        Integer w2 = 10;
        Integer w3 =5;
        Short w4 = 5;
        System.out.println("        Integer w1 = 5;\n" +
            "        Integer w2 = 10;\n" +
            "        Integer w3 =5;\n" +
            "        Short w4 = 5;");
        System.out.println("w1.equals(w2) = " + w1.equals(w2) );
        System.out.println("w1.equals(w3) = " + w1.equals(w3) );
        System.out.println("w1.equals(w4) = " + w1.equals(w4) );
        //
        //
        System.out.println("\n4; valueOf()");
        /* Returns an Integer object holding the value of the specified primitive.
        * The valueOf method returns the relevant Number Object holding the value 
        * of the argument passed. The argument can be a primitive data type, 
        * String, etc. This method is a static method. The method can take two 
        * arguments, where one is a String and the other is a radix.
        * 
        * Parameters 
        * i − An int for which Integer representation would be returned.
        * s − A String for which Integer representation would be returned.
        * radix − This would be used to decide the value of returned Integer 
        based on the passed String.
        * 
        * Return Value
        * valueOf(int i) − This returns an Integer object holding the value of 
        * the specified primitive.
        * valueOf(String s) − This returns an Integer object holding the value 
        * of the specified string representation.
        * valueOf(String s, int radix) − This returns an Integer object holding 
        * the integer value of the specified string representation, parsed with 
        * the value of radix.
        */
        Integer x41 = Integer.valueOf(9);
        Double x42 = Double.valueOf(5);
        Float x43 = Float.valueOf("80");
        Integer x44 = Integer.valueOf("444",16);
        System.out.println ("   Integer x41 = Integer.valueOf(9) = " + x41 );
        System.out.println ("   Double x42 = Double.valueOf(5) = " + x42 );
        System.out.println ("   Float x43 = Float.valueOf(\"80\") = " + x43 );
        System.out.println ("   Integer x44 = Integer.valueOf(\"444\",16) = " + x44 );
        //
        //
        System.out.println("\n5; toString()");
        /* Returns a String object representing the value of a specified int or Integer. 
        * The method is used to get a String object representing the value of the Number Object. 
        * If the method takes a primitive data type as an argument, then the String 
        * object representing the primitive data type value is returned.
        * If the method takes two arguments, then a String representation of the 
        * first argument in the radix specified by the second argument will be returned.
        * Parameters
        * i − An int for which string representation would be returned.
        * Return Value
        * toString() − This returns a String object representing the value of this Integer.
        * toString(int i) − This returns a String object representing the specified integer.
        */
        Integer x51 = 5;
        System.out.println("    Integer x51 = 5");
        System.out.println("    x51.toString() = " + x51.toString() );
        System.out.println("    Integer.toString(12) = " + Integer.toString(12) );
        //
        //
        System.out.println("\n6; parseInt()");
        /* This method is used to get the primitive data type of a certain String.
        * 
        * Parameters
        * s − This is a string representation of decimal.
        * radix − This would be used to convert String s into integer.
        * 
        * Return Value
        * parseInt(String s) − This returns an integer (decimal only).
        * parseInt(int i) − This returns an integer, given a string representation 
        * of decimal, binary, octal, or hexadecimal (radix equals 10, 2, 8, or 16 respectively) numbers as input.
        */
        int x61 = Integer.parseInt("9");
        double x62 = Double.parseDouble("5");
        int x63 = Integer.parseInt("F",16);
        System.out.println("    Integer.parseInt(\"9\") = " + Integer.parseInt("9") );
        System.out.println("    Double.parseDouble(\"5\") = " + Double.parseDouble("5") );
        System.out.println("    Integer.parseInt(\"F\",16) = " + Integer.parseInt("F",16) );
        
        
    }
    
    
}
