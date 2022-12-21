package Task80;
import java.io.Serializable;

public class Car implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private String color;
    private int speed;
    private  int nucleInCar;
    private  int power;

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNucleInCar(int nucleInCar) {
        this.nucleInCar = nucleInCar;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public String getName(){
        return name;}
    public String getColor(){
        return color;}
    public int getSpeed(){
        return speed;}
    public  int getNucleInCar(){
        return nucleInCar;}
    public  int getPower(){
        return power;}


    public String toString(){
        return getName() + ";" + getColor() + ";" + getSpeed() + ";" + getNucleInCar()+";" + getPower() + ";" ;
    }
    public Car(String name,String color,int speed,int nucleInCar,int power){
        this.name=name;
        this.color=color;
        this.speed=speed;
        this.nucleInCar=nucleInCar;
        this.power=power;
    }
}