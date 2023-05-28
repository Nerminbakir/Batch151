package nerminwork.nestedternary;

import java.util.Scanner;

public class NestedTernary01SH {
    public static void main(String[] args) {

    /*
    Kullanıcıdan bir tamsayı girmesini isteyin.
    Tamsayı 3 basamaklı ise ekrana "3 basamaklı" yazdırın

    3 basamaklı degil ise cift olup olmadıgını kontrol edin.
    Cift ise "3 basamaklı olamayan cift sayi" yazdırın
    Cift degil ise "3 basamaklı olmayan tek sayi" yazdırın
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir tamsayi girin");
        int s = scan.nextInt();


       String result = s>99 && s<1000 ?  "3 basamaklı" : (s%2==0 ? "3 basamaklı olmayan cift sayi" : "3 basamaklı olmayan tek sayi");
       System.out.println(result);





    }
}
