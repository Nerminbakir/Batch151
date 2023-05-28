package nerminwork.ternary;

import java.util.Scanner;

public class Ternary03SH {
    public static void main(String[] args) {

        /*
        Kullanıcıdan bir üçgenin üç kenar uzunlugunu alin.
        Eger iki kenar uzunlugu birbirine esitse ekrana "İkizkenar Ücgen" yazdırın
        Diger durumlarda ekrana "İkizkenar Ücgen degil" yazdırın.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Üçgenin üç kenar uzunlugunu giriniz");
        double k1 = scan.nextInt();
        double k2 = scan.nextInt();
        double k3 = scan.nextInt();

        String result =k1==k2 || k2==k3 || k1==k3 ? "İkizkenar Ücgen" : "İkizkenar Ücgen Degil";
        System.out.println(result);


    }
}
