package nerminwork.cesitli;

import java.util.Scanner;

public class DikdortgenAlani {

    public static void main(String[] args) {
    /*
    Kullanıcıdan bir dikdörtgenin uzun ve kısa kenarlarını alıp alan ve
    cevresini hesaplayınız.
   */
        Scanner scan = new Scanner(System.in);
        System.out.println("Dikdörtgenin kısa kenarını giriniz");
        double kısa = scan.nextDouble();

        System.out.println("Dikdörtgenin uzun kenarını giriniz");
        double uzun = scan.nextDouble();

        System.out.println("Alan= " + kısa*uzun);
        System.out.println("Cevre= " + (2*kısa+2*uzun));


    }
}
