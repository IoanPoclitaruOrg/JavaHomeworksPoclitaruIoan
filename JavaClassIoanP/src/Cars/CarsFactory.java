/*
 * Using Car class created in our last training session and the approach we had 
 * for desk computer in design of Java Classes create a CarsFactory class that 
 * should be able to delivery different cars to customers, based on their name 
 * and color having also a good management of delivered cars.
 */
package Cars;

/**
 * Scenario:
 * Customer requires delivery of one red car named Mercedes.
 * CarsFactory creates a new one red Mercedes car.
 * CarsFactory displays: "A new red Mercedes was delivered!"
 * CarsFactory adds new red Mercedes car to its list of delivered cars.
 * Repeat the scenario for other customers requiring other cars names and 
 * colors (Renault, yellow, Dacia red, Dacia white, Mercedes white, etc.).
 * At the end of each delivery, CarsFactory displays the list of delivered cars as: 
 * We delivered N cars as follows:
 * No.  Car name    Car color   Max-Speed
 * ======================================
 * 1.   Mercedes    Red         330
 * 2.   Renault     Yellow      280
 * 3.   Dacia       Red         200
 * 4.   Dacia       White       200
 * 5.   Mercedes    White       330
 * @author poclitar
 */
public class CarsFactory {
    public static void main (String[] args) {
        // Create the first car, a red Mercedes.
        Car firstCar = new Car();
        System.out.println("Name of the 1st car is:                 " + firstCar.getName() );
        System.out.println("Color of the 1st car is:                " + firstCar.getColor() );
        System.out.println("The maximum speed of the 1st car is:    " + firstCar.getSpeed() + " km/h");
        System.out.println("\nWe delivered 1 car as follows:\n" +
" * No.  Car name    Car color   Max-Speed\n" +
" * ======================================\n" +
" * 1.   "+firstCar.getName()+"    "+firstCar.getColor()+"         "+firstCar.getSpeed()+"\n*****\n");
        // 2nd car
        int maxSpeed = 280;
        Car secondCar = new Car("Renault", Car.Color.YELLOW, maxSpeed);
        // 3rd car and the rest
        maxSpeed = 200;
        Car thirdCar = new Car("Dacia", Car.Color.RED, maxSpeed);
        Car fourthCar = new Car("Dacia", Car.Color.WHITE, maxSpeed);
        maxSpeed = 330;
        Car fifthCar = new Car("Mercedes", Car.Color.WHITE, maxSpeed);
        // display 2nd car
        System.out.println("Name of the 2nd car is:                 " + secondCar.getName() );
        System.out.println("Color of the 2nd car is:                " + secondCar.getColor() );
        System.out.println("The maximum speed of the 2nd car is:    " + secondCar.getSpeed() + " km/h");
        System.out.println("\nWe delivered 2 cars as follows:\n" +
" * No.  Car name    Car color   Max-Speed\n" +
" * ======================================\n" +
" * 1.   "+firstCar.getName()+"    "+firstCar.getColor()+"         "+firstCar.getSpeed()+"\n" +
" * 2.   "+secondCar.getName()+"     "+secondCar.getColor()+"      "+secondCar.getSpeed()+"\n*****\n");
        // display 3rd car
        System.out.println("Name of the 3rd car is:                 " + thirdCar.getName() );
        System.out.println("Color of the 3rd car is:                " + thirdCar.getColor() );
        System.out.println("The maximum speed of the 3rd car is:    " + thirdCar.getSpeed() + " km/h");
        System.out.println("\nWe delivered 3 cars as follows:\n" +
" * No.  Car name    Car color   Max-Speed\n" +
" * ======================================\n" +
" * 1.   "+firstCar.getName()+"    "+firstCar.getColor()+"         "+firstCar.getSpeed()+"\n" +
" * 2.   "+secondCar.getName()+"     "+secondCar.getColor()+"      "+secondCar.getSpeed()+"\n" +
" * 3.   "+thirdCar.getName()+"       "+thirdCar.getColor()+"         "+thirdCar.getSpeed()+"\n*****\n");
        // display 4th car
        System.out.println("Name of the 4th car is:                 " + fourthCar.getName() );
        System.out.println("Color of the 4th car is:                " + fourthCar.getColor() );
        System.out.println("The maximum speed of the 4th car is:    " + fourthCar.getSpeed() + " km/h");
        System.out.println("\nWe delivered 4 cars as follows:\n" +
" * No.  Car name    Car color   Max-Speed\n" +
" * ======================================\n" +
" * 1.   "+firstCar.getName()+"    "+firstCar.getColor()+"         "+firstCar.getSpeed()+"\n" +
" * 2.   "+secondCar.getName()+"     "+secondCar.getColor()+"      "+secondCar.getSpeed()+"\n" +
" * 3.   "+thirdCar.getName()+"       "+thirdCar.getColor()+"         "+thirdCar.getSpeed()+"\n" +
" * 4.   "+fourthCar.getName()+"      "+fourthCar.getColor()+"        "+fourthCar.getSpeed()+"\n*****\n");
        // display 5th car
        System.out.println("Name of the 5th car is:                 " + fifthCar.getName() );
        System.out.println("Color of the 5th car is:                " + fifthCar.getColor() );
        System.out.println("The maximum speed of the 5th car is:    " + fifthCar.getSpeed() + " km/h");
        System.out.println("\nWe delivered 5 cars as follows:\n" +
" * No.  Car name    Car color   Max-Speed\n" +
" * ======================================\n" +
" * 1.   "+firstCar.getName()+"    "+firstCar.getColor()+"         "+firstCar.getSpeed()+"\n" +
" * 2.   "+secondCar.getName()+"     "+secondCar.getColor()+"      "+secondCar.getSpeed()+"\n" +
" * 3.   "+thirdCar.getName()+"       "+thirdCar.getColor()+"         "+thirdCar.getSpeed()+"\n" +
" * 4.   "+fourthCar.getName()+"       "+fourthCar.getColor()+"       "+fourthCar.getSpeed()+"\n" +
" * 5.   "+fifthCar.getName()+"    "+fifthCar.getColor()+"       "+fifthCar.getSpeed()+"\n*****\n");
        
    }
    
}
