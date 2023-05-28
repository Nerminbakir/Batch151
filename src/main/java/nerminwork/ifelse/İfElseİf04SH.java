package nerminwork.ifelse;

import java.util.Scanner;

public class İfElseİf04SH {

    public static void main(String[] args) {
        /*
        Kullanıcıdan bir yıl alın eger yıl 1000'e bölünüyorsa ekrana "Milenyum" yazdırın.
        Eger yıl 100'e bölünüyorsa ekrana "Yuzyıl" yazdırın.
        Eger yıl 10'a bölünüyorsa ekrana "Onyıl" yazdırın.
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("yıl giriniz");
        int yil = scan.nextInt();

        if (yil<=0){
            System.out.println("Negatif veya sifir yil olarak kabul edilmez");
        }else if (yil%1000==0){
            System.out.println("Milenyum");
        } else if (yil%100==0) {
            System.out.println("Yuzyıl");
        } else if (yil%10==0) {
            System.out.println("Onyıl");

        }else{
            System.out.println("Hicbiri");
        }


    }//m
}//c
