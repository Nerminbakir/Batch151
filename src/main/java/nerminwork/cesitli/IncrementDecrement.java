package nerminwork.cesitli;

public class IncrementDecrement {
    public static void main(String[] args) {

        int a =12;
        a= a+1;//Javada tekrar sevilmez.
        a += 1;
        a++;//sadece 1 arttırmak için kullanılır.

        int price =12;
        price=price-3;
        price-=3;
        price--;//sadece 1 azaltmak için kullanılır.

        int age =12;
        System.out.println(age);//12

        age=age++;      //post increment
        System.out.println(age);//12

        //Java kodları yukarıdan asagı soldan saga dogru okudugu için
        // age konteynırına atama operatorunden sonra sadece age'i alır ve ++ 'yı okumaz.daha sonra okur ama topl. işl. yapmaz.

        age = ++age;    //pre-increment
        System.out.println(age);//13

        int salary = 40;
        salary=salary--;//40        post decrement
        salary=--salary;//39        pre decrement
        System.out.println(salary);


    }//m
}//c
