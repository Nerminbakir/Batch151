package mentorsorular;

import java.util.Scanner;

public class Soru01DortIslem {
    public static void main(String[] args) {
         /*
            Soru-1: Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz dort islemden biri ile isleme koyup sonucunu yazdiriniz

          */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        double a = scan.nextInt();
        double b = scan.nextInt();
        System.out.println("Yapmak istediginiz islemi seciniz: +, -, *, /");
        char opr = scan.next().charAt(0);

        switch (opr){
            case '+':
                System.out.println(a+ " + " + b + " = " + (a+b));
                break;
            case '-':
                System.out.println(a+ " - " + b + " = " + (a-b));
                break;
            case '*':
                System.out.println(a+ " * " + b + " = " + (a*b));
                break;
            case '/':
                System.out.println(a+ " / " + b + " = " + (a/b));
                break;
            default:
                System.out.println("Bu işlem tanımlanmamıştır");

        }

        /*
          Scanner scan = new Scanner(System.in);//kullanıcıdan input almak için canner obj create ettik.
          System.out.println(" toplama için 1\n çikarma için 2\n bolme için 3\n çarpma için 4");
          //kullanıcıya seçim içn işlem menusu yazdırdık
          int islem = scan.nextInt();//kullanıcının islem tercihi için veriable create edildi
          System.out.println("lütfen iki tam sayı giriniz : ");//kullanıcıya bildirmde bulunuldu.
          double num1 = scan.nextDouble();//1 sayı assign edildi
          double num2 = scan.nextDouble();//2 sayı assign edildi
          if (islem == 1) {
            System.out.println("toplama işleminin sonucu :" + num1 + " + " + num2 + " = " + (num1 + num2));
          }else if (islem == 2) {
            System.out.println("cıkarma işleminin sonucu :" + num1 + " - " + num2 + " = " + (num1 - num2));
          } else if (islem == 3) {
            System.out.println("bolme işleminin sonucu :" + num1 + " / " + num2 + " = " + (num1 / num2));
          } else if (islem == 4) {
            System.out.println("carpma işleminin sonucu :" + num1 + " x " + num2 + " = " + (num1 * num2));
          } else System.out.println("hatalı secim yaptınız tekrar deneyiniz");

         */


    }
}
