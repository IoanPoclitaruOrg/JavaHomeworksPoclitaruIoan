/*
 * implementation of class Car.
 */
package Cars;

/**
 * Class implements attributes and behavior of a car.
 * @author poclitar
 */
public class Car {
    public enum Color {WHITE, RED, GREEN, MAGENTA, YELLOW};
    private String name;
    private Color color;
    private int speed;
    // first constructor
    public Car (){
        name = "Mercedes";
        color = Color.RED;
        speed = 330;
    }
    // second constructor with 3 parameters
    public Car (String newName, Color newColor, int newSpeed){
        name = newName;
        color = newColor;
        speed = newSpeed;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Color getColor (){
        return color;
    }
    public void setColor(Color color){
        this.color = color;
    }
    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
}
