package nerminwork.typecasting;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {

    /*
    Kenar uzunluklari kullanıcıdan alınan bir üçgenin cevresini
    hesaplayan program yazınız. Byte kullanınız.

     */

        /*Scanner scan = new Scanner(System.in);
        System.out.println("Ucgenin kenar uzunluklarını giriniz");
        byte k1= scan.nextByte();
        byte k2 = scan.nextByte();
        byte k3 = scan.nextByte();

        int cevre = k1 + k2 + k3 ;
        System.out.println("cevre = " + cevre);

         */

        //Kullanıcının girdigi 4 basamakli sayinin ilk ve son rakaminin toplamini
        // ekrana yazdıran programi yaziniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir sayi giriniz");
        int s =scan.nextInt();

        //Bir sayinin birler basamagini kullanmak istedigimizde %10 kullanırız.
        int sonSayi = s %10;
        //Bir sayinin ilk rakamını kullanmak istedigimizde 1000'e böleriz
        int ilkSayi = s / 1000;

        System.out.println("Toplam = " +(ilkSayi +sonSayi));



    }


}
