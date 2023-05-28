package javaders.day25varargsinheritance;

public class Honda extends Car{
    public Honda (){
        super("make"); // default oldugu için biz görmüyoruz
        System.out.println("Honda 1");
        System.out.println(this.model);
        System.out.println(super.km);
    }//constructor

    public String model = "civic";
    public int km = 10000;
}
