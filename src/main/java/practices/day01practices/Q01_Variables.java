package practices.day01practices;

public class Q01_Variables {
    public static void main(String[] args) {

        //Bir variable başlat.
        int age = 34;
        int number = 55;
        String isim = "ALİ";

        System.out.println(age);
        System.out.println("number = " + number);
        System.out.println("isim = " + isim);
        System.out.println(isim);

        //Variable değeri kopyala
        int hisAge = age;
        System.out.println("hisAge = " + hisAge);
        String onunIsmi = isim ;
        System.out.println("onunIsmi = " + onunIsmi);

        //Aynı satırda çoklu variable deklere et.
        int year = 2022, month=3, day=15;
        System.out.println("day = " + day);
        System.out.println("year = " + year);

        //Bir variable değerini güncelle.
        year = 2123;
        System.out.println("year = " + year);

        year = year+5;
        System.out.println("year = " + year);

        // Bir variable deklere et. :x
        double x;

        // Bir variable başlat. :y
        double y = 100.543;

        // Başka bir variable başlat:z
        double z = 43;

        //x değişkenini y değişkeni ile başlat.
        x=y;

        //x değişkenini güncelle.
        x= 3.14;

        //Değişkenleri yazdır.
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

    }

}
