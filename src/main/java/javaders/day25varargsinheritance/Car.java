package javaders.day25varargsinheritance;

public class Car extends Vehicle{

    public Car (){
        this("make");
        System.out.println("Car 1");
    }//constructor

    public Car (String make){
        super();
        System.out.println("Car String Parametreli");
    }

    public String model = "car model";
    public int km = 20000;
}
