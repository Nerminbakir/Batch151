package nerminwork.ifelse;

import java.util.Scanner;

public class IfElse01SH {

    public static void main(String[] args) {
        /*
        Kullanıcıdan alacagı ürün miktarını ve ürünün birim fiyatını alın.
        Eger ürün miktarı 1000'den fazla ise kullanıcıya %10 indirim yapın ve
        ödemesi gereken toplam parayı ekrana yazdırın.
        Diger durumlarda ödemesi gereken toplam parayı herhangi bir indirim yapmadan ekrana yazdırın.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("urun miktarını yazınız.");
        int qty = scan.nextInt();
        System.out.println("urun fiyatını yazınız.");
        double price = scan.nextDouble();

        if (qty>1000){
            System.out.println("%10 indirimli fiyat = " + price*0.9*qty);//ürünün %10 indirimi 0.9 a esit old icin 0.9 ile carptık

        }else{
            System.out.println("indirimsiz fiyat = " + price*qty);
        }



    }//main
}//class
