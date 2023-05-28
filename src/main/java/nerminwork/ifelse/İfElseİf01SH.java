package nerminwork.ifelse;

import java.util.Scanner;

public class İfElseİf01SH {

    public static void main(String[] args) {
        /*
        Kullanıcıdan bir sayi alin.
        Eger tamsayi 0 dan kucuk ise ekrana "Negatif" yazdırın.
        0 ise "Notr" yazdırın.
        0 dan buyuk ise "Pozitif" yazdırın.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        double sayi = scan.nextDouble();

        if (sayi<0){
            System.out.println("Negatif");

        }else if (0==0){
            System.out.println("Notr");
        }else{
            System.out.println("Pozitif");
        }












    }
}
