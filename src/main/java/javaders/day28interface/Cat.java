package javaders.day28interface;

public class Cat implements Mammal{
    @Override
    public void eat() {

    }

    @Override
    public void drink() {

    }

    public static void main(String[] args) {
        // interface'lerde variable cagırırken interface adını kullanarak cagırın.
        // Bu hem static variable olmanın geregidir hem de okunurlulugu arttırır.

        System.out.println(Animal.age); // 4
        System.out.println(Mammal.feedBaby); // Milk
        System.out.println(Mammal.age);// 6
    }
}
