package javaders.day04memorykullanimiwrapperclass;

import java.util.Scanner;

public class C01_Scanner {

    public static void main(String[] args) {

        //Kullanicidan aldiginiz 5 basamakli ilk iki ve son iki basamagindaki sayilarin
        // toplamini yazdıran kodu olusturunuz.

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen 5 basamakli bir sayi giriniz");

        int number = input.nextInt(); //38671

        // Son rakami al

        int lastDigit = number%10; //1

        //Sayiyi kucult

        number = number/10; //3867

        //Sondan ikinci rakami al

        int lastSeconDigit = number%10; //7

        //Sayi kucult

        number = number/10; //386

        //Sondan ucuncu rakami al

        int lastThirdDigit = number%10; //6

        //Sayi kucult

        number = number/10; //38

        //Sondan dorduncu rakami al

        int lastFourtDigit = number%10; //8

        //Sayi kucult

        number = number/10; //3

        //Sondan besinci rakami al

        int lastFifthDigit = number%10; //3

        System.out.println(lastFifthDigit+lastFourtDigit+lastSeconDigit+lastDigit);


    }//main
}//class
