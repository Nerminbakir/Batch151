package javaders.day10IfStatement;

import java.util.Scanner;

public class C01_IfStatement {

    public static void main(String[] args) {

         //if it rains I will cancel the picnic
        //Eger yagmur yagarsa piknigi iptal edecegim

        //Ex = Verilen karakter buyuk harf ise ekrana buyuk harf yazdiriniz.

        char ch ='A';

        if (ch>= 'A' && ch<= 'Z'){

            System.out.println("Buyuk Harf");
        }//if body

        // Ex = Verilen sayi cift ise ekrana "Cift Sayi" yazdiriniz.

        byte sayi = 21;

        if (sayi % 2 ==0){  //kodun dinamik yazilmasi icin variable'in ismi yazilir. Direk deger yazilirsa
          //  hurd coding yani tek datalik kod olur
            System.out.println("Cift Sayi");

        }

        // Ex = Verilen sayi 300 den kucuk veya 1200 den buyuk ise ekrana "Harika Sayi" yazdiran kodu yaziniz.

        int number = -98;

        if (number <300 || number>1200){
            System.out.println("Harika Sayi"); //Harika Sayi

        }

        // Ex = Kullanicidan alinan datanin tek mi cift mi oldugunu yazdiran kodu yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int num = input.nextInt();
        //1.  yol Bagimsiz If Statement
        if (num % 2 ==0){
            System.out.println("Cift Sayi");

        }
        if (num % 2 !=0) {
            System.out.println("Tek Sayi");
        }

        //2.  yol if Else

        if (num % 2 ==0){
            System.out.println("Cift Sayi"); //Eger num icerisindeki datanin 2 ye bolumunden kalan
            //0 a esitse "Cift Sayi" yazdirir

        }else {      //(degilse) Geriye kalan tum ihtimaller icin burasi calisir

            System.out.println("Tek Sayi");
        }

        //Ex = Verilen bir sayinin pozitif mi negatif mi notr mu odugunu soyleyen kodu yaziniz

        int numara = 0;

        if (numara<0){
            System.out.println("3lu kontrol Negatif Sayi");

        }else if (numara == 0) {
            System.out.println("3lu kontrol Notr Sayi");//Notr Sayi

        }else {

            System.out.println("3lu kontrol Pozitif Sayi");
        }

        //3 ihtimalden sadece bir tanesi calisir. Diger ikisi calismaz






    }//main
}//class
