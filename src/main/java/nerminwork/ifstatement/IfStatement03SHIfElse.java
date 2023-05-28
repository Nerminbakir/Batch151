package nerminwork.ifstatement;

import java.util.Scanner;

public class IfStatement03SHIfElse {

    public static void main(String[] args) {

        /*
        Kullanıcıdan bir character alınız.
        Bu character harf ise "Harf" yazdırın.
        Bu character harf degil ise "Harf Degil" yazdırın.

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir character giriniz");
        char ch = scan.next().charAt(0);

        if ((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')){
            System.out.println("Harf");
        }else{
            System.out.println("Harf Degil");

        }


    }
}
