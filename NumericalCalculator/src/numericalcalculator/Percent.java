/*
 * Public Class Percent.
 */
package numericalcalculator;

/**
 * The Percent for calculating the value of a percentage num1 applied
 * to a base num2. The num1 and num 2 are double type parameters. The result is 
 * stored by the variable 'result' which type is double. 
 * @author poclitar
 */
public class Percent {
    public double percentage (double num1, double num2){
        double result = (num1 * num2)/100;
        return (result);
    }
    
}
