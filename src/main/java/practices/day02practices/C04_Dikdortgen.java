package practices.day02practices;

import java.util.Scanner;

public class C04_Dikdortgen {
    public static void main(String[] args) {

        // Kullanicidan dikdortgenin a ve b kenarlarinin uzunluklarini ayri ayri sisteme girmesini isteyiniz.
        // ve Dikdorgenin cevresini hesaplayarak ekrana yazdiriniz


        Scanner scan = new Scanner(System.in);
        System.out.println("Dikdortgenin a kenarini giriniz");
        int a = scan.nextInt();

        System.out.println("Dikdortgenin b kenarini giriniz");
        int b = scan.nextInt();

        System.out.println("Dikdortgenin Cevresi = " + 2*(a+b));//Dikdortgenin Cevresi = 30


    }//main
}//class
