package javaders.day26polymorphism;

public class Cat extends Animal{
    public void meow(){

        System.out.println("Cats meow");
    }
    @Override
    public void eat(){ // Override Annotation override kurallarını java tarafından kontrol edilmesini saglar.
       // Child daki override edilmis eat () methoduna "Overriding Method" denir.
       // Parent taki override edilmis eat() methoduna "Overriden Method" denir.
       System.out.println("Cats eat");
    }

    @Override
    public void drink() {

        System.out.println("Cats drink");
    }

    @Override
    public Animal create() {
        return new Cat();
    }

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public Integer multiply(int a, int b) {
        return a*b;
    }
//    @Override
//    public double circleArea(double r) {
//        return super.circleArea(r);
//    }

}
