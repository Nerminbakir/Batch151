package nerminwork.swich;

import java.util.Scanner;

public class Switch01SH {
    public static void main(String[] args) {

        /*
         Switch () statement if else if ile aynı işi yapar.
         Switch () statement daha kolay yazılır ve daha kolay okunur.
         2den fazla durum varsa genellikle if else if yerine switch ile kullanılır.
         */


       // Ex =  Kullanıcı hafta gununun sayısını girsin program haftanın gununu yazsın.

        Scanner scan = new Scanner(System.in);
        System.out.println("ismini görmek istediginiz gunun sayisini giriniz");
        int gun = scan.nextInt();

        //1. yol
        if (gun==1){
            System.out.println("Pazartesi");
        } else if (gun==2) {
            System.out.println("Salı");
        }else if (gun==3) {
            System.out.println("Carsamba");
        }else if (gun==4) {
            System.out.println("Persembe");
        }else if (gun==5) {
            System.out.println("Cuma");
        }else if (gun==6) {
            System.out.println("Cumartesi");
        }else if (gun==7) {
            System.out.println("Pazar");
        }else {
            System.out.println("Gecerli bir gun sayısı giriniz");
        }

        //2. yol

        switch (gun){
            case 1 :
                System.out.println("Pazartesi");
                break;
            case 2 :
                System.out.println("Salı");
                break;
            case 3 :
                System.out.println("Carsamba");
                break;
            case 4 :
                System.out.println("Persembe");
                break;
            case 5 :
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7 :
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Gecerli bir gun sayısı giriniz");
        }


    }//m
}//c
