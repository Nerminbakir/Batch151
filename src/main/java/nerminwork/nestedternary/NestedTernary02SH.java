package nerminwork.nestedternary;

import java.util.Scanner;

public class NestedTernary02SH {
    public static void main(String[] args) {

        /*
        Artık yıl(Leap Year) = 100'e bölünen yıllardan 400'e bölünenler artık yıldır.
                             = 100'e bölünemeyen yıllardan 4'e bölünenler artık yıldır.
        Kullanıcıdan alınan yılın artık yıl olup olmadıgını yazdırın.

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("yıl giriniz");
        int yil = scan.nextInt();

        String result = yil%100==0 ? (yil%400==0 ? "Artık yıl" : "Artık yıl degil") : (yil%4 ==0 ?"Artık yıl" : "Artık yıl degil" );
        System.out.println(result);


    }//m
}//c
