package javaders.day12switchloops;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {


   // Ex  1) Kullanıcıdan iki sayi ve yapilacak işlemi alan ve +,-,*,/,% işlemlerini yapan kodu yazınız.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz..");
        double a = input.nextDouble();
        double b = input.nextDouble();
        System.out.println("Yapılacak işlemi giriniz. +,-,*,/,% birini seciniz..");
        char opr = input.next().charAt(0);

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
            case '%':
                System.out.println(a+ " % " + b + " = " + (a*b/100));
                break;
            default:
                System.out.println("Bu işlem tanımlanmamıştır");


        }



    }//main
}//class
