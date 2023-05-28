package practices.day06practices;

import java.util.Scanner;

public class C04_ForAgac {
    public static void main(String[] args) {

        /*

          Agac sekli olusturmak icin, kullanicidan yaprak satir sayisini ve gövde satir sayisini ayrı ayrı
         sisteme girmesini isteyiniz.

         Asagıdaki agac seklini konsala yazdırınız

        ^
        ^^
        ^^^
        ^^^^
        ^^^^^
        |||
        |||
        |||
        |||
        |||

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Yaprak satir sayisini giriniz");
        int satirNo = scan.nextInt();
        System.out.println("Yaprak govde sayisini giriniz");
        int govdeNo = scan.nextInt();

        String yaprak = "";
        String govde = "|||";

        for (int i = 0; i < satirNo; i++) { // 0'dan satirNo'ya kadar donguye aldık. int i = 1; i <= satirNo;
            yaprak = yaprak + "^";
            System.out.println(yaprak);
        }
            for (int i = 0; i < govdeNo; i++) { // 0'dan govdeNo'ya kadar donguye aldık.
                System.out.println(govde);

        }












    }
}
