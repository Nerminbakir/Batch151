package nerminwork.stringmanipulations;

import java.util.Scanner;

public class StringMan01SHOrnek {

    public static void main(String[] args) {

        /*
        1) Kullanıcıdan passwordunu alınız.
        2) Passwordun
                    a) ilk characteri buyuk harf olacak
                    b) son characteri sayi olacak
                    c) en az 6 character uzunlugunda olacak
         sartlarını sagliyorsa "Password basariyla olusturuldu" yazınız.
         3) Password yukarıdaki sartlardan herhangi birini saglamiyorsa "Tekrar deneyiniz" yazdırın.

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen passwordunuzu giriniz");
        String pwd =scan.nextLine();

        if ((pwd.charAt(0)>='A' && pwd.charAt(0)<='Z') &&
                (pwd.charAt(pwd.length()-1)>='0' && pwd.charAt(pwd.length()-1)<='9')&&
                pwd.length()>5) {
            System.out.println("Password basariyla olusturuldu");

        } else {
            System.out.println("Tekrar deneyiniz");
        }





    }//main
}//class
