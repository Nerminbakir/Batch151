package nerminwork.swich;

import java.util.Scanner;

public class Switch03SH {

    public static void main(String[] args) {

        /*
        Kullanıcı ay ismini girdiginde o ayın kac cektigini ekrana yazdıran programı yazınız.
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("ay ismi giriniz");
        String ay = scan.next();

        switch (ay.toLowerCase()){
            case "ocak" :
            case "mart" :
            case "mayıs" :
            case "temmuz" :
            case "agustos" :
            case "ekim" :
            case "aralık" :
                System.out.println(31);
                break;
            case "subat" :
                System.out.println("28 veya 29");
                break;
            case "nisan" :
            case "haziran" :
            case "eylül" :
            case "kasım" :
                System.out.println(30);
                break;

            default:
                System.out.println("lutfen gecerli bir ay ismi giriniz");
        }


    }//m
}//c
