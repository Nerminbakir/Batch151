package nerminwork.ternary;

import java.util.Scanner;

public class Ternary01SH {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int s = scan.nextInt();

        //1.yol
        if (s>9){
            System.out.println("Rakam degil");
        }else{System.out.println("Rakam");}

        //2.yol
        String result = s>9 ? "Rakam degil" : "Rakam";// ? == mu. : == (else) degilse
        System.out.println(result);

        System.out.println(s > 99 && s < 1000 ? "3 basamaklı" : s);

    }//m
}//c
