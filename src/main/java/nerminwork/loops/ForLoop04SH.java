package nerminwork.loops;

import java.util.Scanner;

public class ForLoop04SH {

    public static void main(String[] args) {

        //3'ten 6'ya kadar tum tamsayıların carpımını hesaplayan programı yazınız.

        int sum = 1;

        for (int i = 3; i <7 ; i++) {
            sum = sum*i;

        }
        System.out.println(sum);

        /*
        Kullanıcıdan baslangıc ve bitis degerlerini alınız.
        Baslangic ve bitis degerleri nasıl olursa olsun baslangıc degerinden
        bitis degerine kadar tum sayıların carpımını hesaplayan programı yazınız.
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Baslangıc degeri giriniz");
        int bas = scan.nextInt();
        System.out.println("Bitis degeri giriniz");
        int bit = scan.nextInt();

        int carpim = 1;

        if (bas<=bit){

            for (int i= bas; i <=bit ; i++) {
                carpim = carpim*i;
            }

        }else{
            for (int i= bas; i >=bit ; i--){
                carpim = carpim*i;
            }
        }
        System.out.println(carpim);



    }//m
}//c
