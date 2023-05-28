package nerminwork.loops;

import java.util.Scanner;

public class ForLoop03SH {
    public static void main(String[] args) {

        /*
        5 ten 12 ye kadar tum sayıların toplamını hesaplayıp ekrana yazdıran programı yazdırınız
        5+6+7+8+9+10+11+12 //68
         */

        int toplam =0;
        for (int i = 5; i <13 ; i++) {
            toplam = toplam+i;
        }
            System.out.println("toplam= " + toplam);

        System.out.println();

        /*
        18 den 3 e kadar tum tamsayıların toplamını ekrana yazdırın
         */
        int top=0;

        for (int i = 18; i >2; i--) {
            top = top+i;
        }

        System.out.println("Top = " + top);


        /*
         Baslangıc ve bitiş degerlerini kullanıcıdan alın.
         Baslangıc degerinden bitiş degerine kadar tum tamsayıların toplamını ekrana yazdırın
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Baslangıc sayısını giriniz");
        int bas = scan.nextInt();
        System.out.println("Bitis sayısını giriniz");
        int bit = scan.nextInt();
        int toplam2 = 0;

        for (int i = bas; i <bit+1 ; i++) {
            toplam2= toplam2+i;

        }
        System.out.println("Toplam2 =" + toplam2);





    }//m
}//c
