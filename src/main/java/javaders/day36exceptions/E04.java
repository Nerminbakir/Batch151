package javaders.day36exceptions;

public class E04 {
    public static void main(String[] args) {

        /*
            * throw keyword bir method bodysi içinde istedigimiz yerde, istedigimiz kosullar için istedigimiz kadar
            exception atmamızı saglar.
            * throw keywordu yazıldıktan sonra bir Exception Class Objecti olusturulur. (new keyword)
            * Exception Class constructor'ının parantez içine istedigimiz Exceptions mesajını yazabiliriz.
         */

        /*
            throw ile throws keyword'leri arasındaki farklar SH

            1)"throws" method signature satirinda kullanilir, "throw" ise method body icinde kullanilir.
            2)"throws" method signature satirinda bir veya birden fazla Exception ile bir kere kullanilir.
              "throw" ise method body icinde bir tane Exception ile tekrar tekrar kullanilabilir.
            3)"throws" dan sonra sadece Exception Class isimleri yazilir,
              "throw" dan sonra Exception Class'dan object olusturulur

            throw ile throws keyword'leri arasındaki farklar MH

           1) "throw" method bodysi icinde, "throws" ise main method parantezinden hemen sonra kullanilir.
           2) "throw" method bodysi icinde istenilen yerde istenildigi kadar kullanilabilir
              "throws" ise main method parantezinden hemen sonra ve sadece 1 kere kullanilabilir.
           3) "throw" dan sonra "new" keyword ve constructor kullanilarak object olusturulur
              * "throws" dan sonra sadece Exception Class ismi yazilir
           4) "throw" belli sartlar icin Exception atmada kullanilir
              "throws" ise applicationu Exception attiktan sonra durdurur.

         */

        printAge(160); // 63  ==> kullanıcı (-) negatif bir deger girerse ya da mesela 1300000 gibi bir yas girerse calısmaya devam eder.

    }

    public static void printAge (int age){
        if(age<0){
            throw new IllegalArgumentException("Age cannot be negative");
        }else if(age>150){
            throw new IllegalArgumentException("Yas 150'den buyuk olamaz");
        }else {
            System.out.println(age);
        }

    }
}
