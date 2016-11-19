/*
 * Piublic class ChangeSign.
 */
package numericalcalculator;

import java.util.Scanner;

/**
 * This class is used to change the sign of the num1 & num2 parameters. The 
 * parameters' type is double. It returns the selected parameter with a changed 
 * sign. The type of returned parameters is also double.
 * @author poclitar
 */
public class ChangeSign {
    public double changingSign (double num1, double num2){
        double result = 0;
        Scanner sign = new Scanner (System.in);
        System.out.println("Please select the parameter for which you would "
                + "like to change the sign: 1 for num1, 2 for num2.");
        int num3 = sign.nextInt();
        switch (num3){
            case 1:
                num1 = - num1;
                System.out.println("The new value of num1 is " + num1);
                return (num1);
            case 2:
                num2 = -num2;
                System.out.println("The new value of num2 is " + num2);
                return (num2);
            default: System.out.println("None of the parameters were selected");
        }
        System.out.println("num1= " + num1 + "; num2= " + num2);
        return (result);
    }
    
}
