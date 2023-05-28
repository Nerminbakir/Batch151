package nerminwork.loops;

import java.util.Scanner;

public class ForLoop07SH {
    public static void main(String[] args) {

    /*
    Kullanıcıdan bir String alınız ve Stringin tersini (Reverse String) ekrana yazdırınız.
    */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir String giriniz ");
        String s = scan.nextLine();

        for (int i = s.length()-1; i>=0 ; i--){

            System.out.print(s.charAt(i));

            }


    }

}

