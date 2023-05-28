package nerminwork.ifelse;

import java.awt.event.MouseAdapter;
import java.util.Scanner;

public class İfElseİf02SH {
    public static void main(String[] args) {

        /*
        Kullanıcıdan bir üçgenin üç kenar uzunlugunu alınız.  Eger
        Üç kenar uzunlugu birbirine esitse ekrana "Eskenar Ücgen" yazdırın.
        Sadece iki kenar uzunlugu birbirine esitse ekrana "İkizkenar Ücgen" yazdırın
        Tum kenar uzunlukları birbirinden farklı ise ekrana "Cesitkenar Ücgen" yazdırın
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Üçgenin üç kenar uzunlugunu giriniz");
        double a = scan.nextInt();
        double b = scan.nextInt();
        double c = scan.nextInt();


        if (a==b && b==c){
            System.out.println("Eskenar Ücgen");
        } else if (a==b || b==c || a==c) {
            System.out.println("İkizkenar Ücgen");
        }else if (a!=b && b!=c && a!=c) {
            System.out.println("Cesitkenar Ücgen");
        }




    }//main
}
