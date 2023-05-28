package nerminwork.loops;

import java.util.Scanner;

public class DoWhileLoop01 {
    public static void main(String[] args) {

        /*
        while-loop ile do-while loop farkı :
        1) while-loop kullanırsanız Java önce sartı kontrol eder sonra loop body'si içindeki kodu calıstırır.
           do-while loop kullanırsanız Java önce loop body içindeki kodu calıstırır sonra sartı kontrol eder.
        2) while-loop kullanırsanız loop body içindeki kod bazen hiç calısmayabilir.
           Fakat do-while loop içindeki kod en az bir kere calısır.

           Note :  do-while loop oyun programı yazmak için iyidir.

         */



        int i =1;

        while (i<1){
            System.out.println("while loop"); // Ekranda hic birsey yazmaz
            i++;
        }

        int k = 1;
        do {
            System.out.println("Do While Loop"); // Ekranda Do While Loop yazar.
            k++;
        }while (k<1);



        /*
        Kullanıcıdan bir sayı alınız.
        Sayı 10'dan kucuk ise ekrana "Kazandınız" yazdırın.
        Sayı 10 veya 10dan buyuk ise ekrana "Sayı giriniz" yazdırın.
        */


        Scanner scan = new Scanner(System.in);
        int s = 0;

        do {
            System.out.println("Sayı giriniz");
            s = scan.nextInt();
        }while (s>=10);

        System.out.println("Kazandınız");


    }
}
