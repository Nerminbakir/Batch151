package mentorsorular;

import java.util.Scanner;

public class Soru10 {
    public static void main(String[] args) {

        // Soru-10:Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız

        String[] birler = {"", "Bir", "İki", "Üç", "Dört", "Beş", "Altı", "Yedi", "Sekiz", "Dokuz"};
        String[] onlar = {"", "On", "Yirmi", "Otuz", "Kırk", "Elli", "Altmış", "Yetmiş", "Seksen", "Doksan"};
        String[] yuzler = {"", "Yuz", "İkiyuz", "Ucyuz", "Dortyuz", "Besyuz", "Altıyuz", "Yediyuz", "Sekizyuz", "Dokuzyuz"};

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen 3 basamaklı bir sayı girin");
        int sayi = input.nextInt();

        if (sayi < 100 || sayi > 999) {
            System.out.println("Lütfen 3 basamaklı bir sayı girin.");
           }

        int birinciBasamak = sayi / 100;
        int ikinciBasamak = (sayi / 10) % 10;
        int ucuncuBasamak = sayi % 10;

        System.out.println(yuzler[birinciBasamak] + " " + onlar[ikinciBasamak] + " " + birler[ucuncuBasamak]);




        }
}

