package practices.day03practices;

import java.util.Scanner;

public class C04_IfElse {

    public static void main(String[] args) {

        /*
        Kullanıcıdan ayrı ayrı iki kelime sisteme girmesini isteyin.
        Eger İlk kelimenin karakter sayısı çift ise, ikinci kelimeyi birinci kelimenin ortasına koyun.
        İlk kelimenin karakter sayısı tek ise, konsola "ilk kelimenin ortasina ikinci kelimeyi koyamazsin cunku ilk kelime tek karakterli" yazdırın.
        */


        Scanner scan = new Scanner(System.in);
        System.out.println("Birinci kelimeyi giriniz");
        String kelime = scan.next();
        System.out.println("İkinci kelimeyi giriniz");
        String kelime2 = scan.next();

        if (kelime.length()%2==0){
            String kelimeIlkYarisi = kelime.substring(0,kelime.length()/2);

            String kelimeSonYarisi = kelime.substring(kelime.length()/2);

            System.out.println(kelimeIlkYarisi+kelime2+kelimeSonYarisi);
        }else{
            System.out.println("ilk kelimenin ortasina ikinci kelimeyi koyamazsin cunku ilk kelime tek karakterli");
        }



    }
}
