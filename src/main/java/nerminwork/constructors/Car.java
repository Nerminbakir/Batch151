package nerminwork.constructors;



public class Car {
    int price;
    int year;
    String make;
    String model;
    String color;
    boolean isDiesel;
    double km;

    public Car(int price, int year, String make, boolean isDiesel) {
        this.price = price;
        this.year = year;
        this.make = make;
        this.isDiesel = isDiesel;
    }//constructor olusturduk

    public Car(int price, int year, String make, String model, String color, boolean isDiesel, double km) {
        this.price = price;
        this.year = year;
        this.make = make;
        this.isDiesel = isDiesel;
        this.model = model;
        this.color = color;
        this.km = km;

    }//constructor olusturduk

    public static void main(String[] args) {

        Car car1 = new Car(5000, 2018, "Toyota", true);
        System.out.println(car1.price);//5000
        System.out.println(car1.year);//2018
        System.out.println(car1.make);//Toyota
        System.out.println(car1.isDiesel);//true

        Car car2 = new Car(80000, 2020, "Audi", false);
        System.out.println(car2.price);//5000
        System.out.println(car2.year);//2018
        System.out.println(car2.make);//Toyota
        System.out.println(car2.isDiesel);//true

        Car car3 = new Car(30000, 2017, "BMW", "3.35i", "Red", false, 5000);
        System.out.println(car3.price);
        System.out.println(car3.year);
        System.out.println(car3.make);
        System.out.println(car3.isDiesel);
        System.out.println(car3.model);
        System.out.println(car3.color);
        System.out.println(car3.km);



    }//main method içinde constructor sayesinde obje olusturduk. ister sadece fiyata , modele göre, ister diğer özelliklere göre olusturabiliriz.
}