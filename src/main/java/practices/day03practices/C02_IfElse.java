package practices.day03practices;

import java.util.Scanner;

public class C02_IfElse {
    public static void main(String[] args) {

        /*
        Kullanicidan ucgenin a, b ve c kenarlarinin uzunluklarini ayri ayri sisteme girmesini isteyiniz.
        Girilen uzunlukların, bir dik ucgenin kenar uzunlukları olup olmadıgını konsola yazdırınız

        Örnek Ekran Çıktısı:

        birinci kenarı giriniz: 3
        ikinci kenarı giriniz:  4
        üçüncü kenarı giriniz:  5
        Bu bir dik üçgendir
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Ücgenin a kenarının uzunlugunu giriniz");
        int a = scan.nextInt();
        System.out.println("Ücgenin b kenarının uzunlugunu giriniz");
        int b = scan.nextInt();
        System.out.println("Ücgenin c kenarının uzunlugunu giriniz");
        int c = scan.nextInt();

        if (a*a + b*b == c*c){
            System.out.println("Bu bir dik ucgendir");
        }else if (a*a + c*c == b*b){
            System.out.println("Bu bir dik ucgendir");
        } else if (b*b +  c*c == a*a) {
            System.out.println("Bu bir dik ucgendir");
        }else {
            System.out.println("Bu bir dik ucgen degildir");
        }


    }//m
}//c
