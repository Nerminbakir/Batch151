package nerminwork.loops;

import java.util.Scanner;

public class DoWhileLoop03 {

    public static void main(String[] args) {

        /*
        Kullanıcıdan sayı girmesini isteyin.
        Kullanıcı sıfır girdiginde ekrana o ana kadar girmis oldugu tüm sayıların toplamını yazdırınız.
        ör; 5, 4, 7, 0 =16
         */

        Scanner scan = new Scanner(System.in);

        int i=1;
        int num = 0;

        do {
            System.out.println("Bir sayı giriniz");
            i=scan.nextInt();
            num = num + i;

        }while (!(i==0));

        System.out.println("Girilen Sayıların Toplamı  : " + num);



    }
}
