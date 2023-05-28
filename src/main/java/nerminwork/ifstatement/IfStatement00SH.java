package nerminwork.ifstatement;

import java.util.Scanner;

public class IfStatement00SH {

    public static void main(String[] args) {

        /*
        If it rains I will cancel picnic
        it rains ifadesi true ise calısır. False ise calısmaz.

        If (it rains) {I will cancel picnic
        }//if body
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("iki sayi giriniz");
        double a = scan.nextDouble();
        double b = scan.nextDouble();

        if (a > b) {                               //parantezin içi ==condition ==şart
            System.out.println("İlk sayi buyuk");

        }//if body

        if (a < b) {
            System.out.println("Ikincı sayi buyuk");
        }

        if (a == b) {
            System.out.println("Iki sayi birbirine esıt");
        }

        /*
        Kullanıcıdan bir sayi alın bu sayı cift sayi ise console a "Cift" yazdırın.
        Tek sayı ise "Tek" yazdırın.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir integer giriniz");
        int c =scan.nextInt();

        if (c % 2 ==0) {
            System.out.println("Cift");
        }

        if (c % 2 !=0) {
            System.out.println("Tek");
        }




    }//main
}//class
