/*
 * Class NumericalCalculator_1. Create a numerical calculator project in Java.
 */
package numericalcalculator;

/**
 * Implement all calculator functions as described in the class #4. 
 * @author poclitar
 */
import java.util.Scanner; // import class Scanner.
public class NumericalCalculator_1 { // declared a public class named NumericalCalculator_1.
    public static void main (String[] args){ /* the public method main which 
        * doesn't return a value */
        System.out.println(" *** This is the calculator ***\nThe operations are:"
                + "\n + (add), - (subtract), * (multiply), / (divide),"
                + "\n % (percent), C (clear result), CE (clear all), X (exit)");
        double num1, num2, num3; // declare variables num1, num2, num3, type double.
        double stack; // declare a variable named stack to memorize the result. 
        String ops; // declare variable ops, type string, to capture the 
        // selected operation.
        Equal keyEqual = new Equal (); /* invoke class Equal and the parameter
        * keyEqual to take over a new class instance */ 
        do { // start a do-while loop
            Scanner inNum1 = new Scanner(System.in); // import num1.
            System.out.println("Introduce the first number:");
            num1 = inNum1.nextDouble();
            Scanner inNum2 = new Scanner(System.in); // import num2.
            System.out.println("Introduce the second number:");
            num2 = inNum2.nextDouble();
            // do-while loop for changing the sign of the parameters.
            do {  
                Scanner sign = new Scanner (System.in);
                System.out.println("In case you like to change the sign for one "
                    + "of the parameters \nplease select the parameter for which "
                    + "you would like to change the sign: \n1 for num1, 2 for "
                    + "num2.\nPress 3 for next.");
                num3 = sign.nextInt();
                num1 = (num3 == 1 ? - num1 : num1) ;
                num2 = (num3 == 2 ? - num2 : num2) ;
                System.out.println("num1= " + num1 + "; num2= " + num2);
            } while (num3 != 3);
            // end of do-while loop for changing the sign of the parameters.
            Scanner inOps = new Scanner(System.in); // import ops.
            System.out.println("Please select the operation (+), (-), (*), (/), "
                    + "(%), (C), (CE), (X)");
            ops = inOps.nextLine();
            // go to selected 'ops'.
            switch (ops){ // evaluate var ops.
                case "+":
                    Plus keyPlus = new Plus(); /* invoke class Plus and the 
                    * parameter keyPlus to take over a new class instance */
                    stack = keyPlus.add(num1, num2); /* stack stores the result  
                    * of the add method done by class Plus for num1 & num2 */
                    keyEqual.display(stack); /* the keyEqual parameter of the
                    * method display is used to display the result thru memo
                    * stack variable */
                    break;
                case "-": // new case for Minus class.
                    Minus keyMinus = new Minus (); /* invoke class Minus and 
                    * parameter keyMinus to take over a new class instance */
                    stack = keyMinus.subtract(num1, num2); /* the result of 
                    * subtract method num1-num2 is stored in stack variable */
                    keyEqual.display(stack); /* the keyEqual parameter of the 
                    * method 'display' is used to display the result thru memo
                    * stack variable */
                    break;
                case "*": // new case for Multiply class.
                    Multiply keyMultiply = new Multiply (); /* invoke class 
                    * Multiply and parameter keyMultiply to take over a new 
                    *class instance */
                    stack = keyMultiply.multiplication(num1, num2); /* the 
                    * result of the multiplication method num1*num2 is stored
                    * in stack variable */
                    keyEqual.display(stack); /* the keyEqual parameter of the 
                    * method 'display' is used to display the result thru memo
                    * stack variable */
                    break;
                case "/": // new case for Divide class.
                    Divide keyDivide = new Divide();
                    stack = keyDivide.division(num1, num2);
                    keyEqual.display(stack);
                    break;
                case "%":
                    Percent keyPercent = new Percent();
                    stack = keyPercent.percentage(num1, num2);
                    keyEqual.display(stack);
                    break;
                //case "+/-":
                    //ChangeSign keyChangeSign = new ChangeSign ();
                    //stack = keyChangeSign.changingSign(num1, num2);
                    //System.out.println("The result is: ");
                    //keyEqual.display(stack);
                    //break;
                case "CE":
                    EraseAll keyEraseAll = new EraseAll ();
                    stack = keyEraseAll.erasingAll(num1, num2);
                    keyEqual.display(stack);
                    break;
                case "C":
                    EraseResult keyEraseResult = new EraseResult ();
                    stack = keyEraseResult.erasingResult();
                    keyEqual.display(stack);
                default: 
                    System.out.println("the parameters were: num1= " + num1 + 
                            "; num2= " + num2 + " ; ops= " + ops);
            }
            
        } while (!ops.equals("X"));
    System.out.println ("End of calculator program"); 
    } 

    
}
