package mentorsorular;

import java.util.Scanner;

public class Soru12 {
    public static void main(String[] args) {
        // Soru-12:Bankamatik Sorusu-->
        // Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin
        // yapıldıgı bie ATM app. code create ediniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yapmak istediğiniz işlemi seciniz : " +
                "\n Bakiye Ögrenme : 1" +
                "\n Para Çekme : 2" +
                "\n Para Yatırma : 3" +
                "\n Çıkıs : 4");

        int islem = scan.nextInt();

        int mevcutBakiye = 1000;


        switch (islem){
            case 1 :
                System.out.println(mevcutBakiye);
                break;
            case 2 :
                System.out.println("Cekilecek Tutarı Girin");
                int cekilecekTutar = scan.nextInt();
                if (cekilecekTutar>mevcutBakiye){
                    System.out.println("Cekilecek Tutar Mevcut Bakiyenizden Fazla Olamaz");
                }else {
                    System.out.println("Kalan Bakiyeniz : "  + (mevcutBakiye - cekilecekTutar));
                }
                break;
            case 3 :
                System.out.println("Yatırılacak Tutarı Girin");
                int yatirilacakTutar = scan.nextInt();
                if (yatirilacakTutar>2000){
                    System.out.println("Cekilecek Tutar 2000'den Fazla Olamaz");
                }else {
                    System.out.println("Mevcut Bakiyeniz : "  + (mevcutBakiye + yatirilacakTutar));
                }
                break;
            case 4 :
                System.out.println("İyi gunler dileriz...");
                break;
            default:
                System.out.println("Gecersiz islem");
        }





    }
}
