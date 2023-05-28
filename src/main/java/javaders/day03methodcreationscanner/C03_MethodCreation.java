package javaders.day03methodcreationscanner;

public class C03_MethodCreation {

    public static void main(String[] args) {
    //Dikdortgenin alanini hesaplayan bir method olusturunuz.

    //dikdortgenAlani(10,20)+2;   void kullandık. void kullandigimiz icin baska bir islem yapamayız. Ama karenin alaninin return type'ı int oldugu icin +,-,... gibi islemler yapabiliriz.
    dikdortgenAlani(10,20);

    //Karenin alanini hesaplatan methodu yaziniz.

        System.out.println(kareAlani(6));

    }//main

    private static int kareAlani(int a) {

        return a*a;


    }

    private static void dikdortgenAlani(int a, int b) {

        System.out.println(a*b);//200
    }

}//class
