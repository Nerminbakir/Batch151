package practices.day06practices;

import java.util.Scanner;

public class C05_For {
    public static void main(String[] args) {

        /*

        Kullanıcıdan sisteme 5 adet sayi girmesini isteyiniz
        Bu sayilardan 5 ile 10 arasındakiler haric, digerlerinin toplamını bulunuz

         */

        Scanner scan = new Scanner(System.in);

        int toplam = 0;

        for (int i = 0; i < 5; i++) { // 0'dan 5'e kadar donguye aldık ve kullanıcıdan 5 adet sayi girmesini istedik
            System.out.println("Bir sayi giriniz");
            int sayi = scan.nextInt();

            if (sayi >= 5 && sayi <= 10) { // 5 ile 10 Arasında Olan Sayilari İsleme Almadık
                System.out.println("Girdiginiz Sayi 5 ile 10 Arasında Oldugundan İsleme Alınmayacaktır");
            }else{
                toplam = toplam + sayi; // degilse sayıları topladık
            }
        }
        System.out.println(toplam);







    }//main


}//class
