package nerminwork.ifelse;

import java.util.Scanner;

public class IfElse01 {

    public static void main(String[] args) {
        /*
        Kullanicidan bir karakter aliniz
        Bu karakter harf ise ekrana harf yazdiriniz
        harf degl ise ekrana harf degil yazdiriniz
         */

        Scanner scan = new Scanner (System.in);
        System.out.println("Bir character giriniz");
        char ch = scan.next().charAt(0);

        if ((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')){
            System.out.println("Harf");

        }else {
            System.out.println("Harf Degil");
        }

        //************************************************

        /*
            Kullanıcıdan bir tamsayi alin ve tamsayının mutlak degerini ekrana yazdırınız.

        */

        Scanner input = new Scanner (System.in);
        System.out.println("Bir integer giriniz");
        int a = input.nextInt();

        if (a>=0){
            System.out.println(a);
        }else{
            System.out.println(-a);
        }






    }
}
