package practices.day06practices;

import java.util.Scanner;

public class C02_Switch {
    public static void main(String[] args) {

        /*

         Bir ATM'de aşağıdaki banka işlemlerini yapmak için, kullanicidan 1-4 arası işlem numarasını sisteme girmesini isteyiniz.

        işlem 1: Bakiye Sorgulama
        işlem 2: Para Cekme
        işlem 3: Para Yatırma
        işlem 4: İşlemi Sonlandırın

        Ve bu islemleri Switch case kullanarak yaptırınız.

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("1-4 Arasi islem numarasini giriniz " + "\n" +
                "işlem 1: Bakiye Sorgulama" +  "\n" +
                "işlem 2: Para Cekme" +  "\n" +
                "işlem 3: Para Yatırma" +  "\n" +
                "işlem 4: İşlemi Sonlandırın");
        int islemNo = scan.nextInt();

        int bakiye = 1000;

        switch (islemNo){
            case 1 : // Bakiye Sorgulama
                System.out.println("Bakiyeniz: " + bakiye + "TL");
                break;

            case 2 : // Para Cekme
                System.out.println("Cekmek istediginiz miktari giriniz");
                int cekilecekMiktar = scan.nextInt();
                if (cekilecekMiktar<=bakiye){
                    bakiye = bakiye - cekilecekMiktar;
                    System.out.println("Para cekme isleminden sonraki mevcut bakiyeniz : " + bakiye + "TL");
                }else{
                    System.out.println("Bakiyeniz Yetersiz");
                }
                break;

            case 3 : // Para Yatırma
                System.out.println("Yatırmak istediginiz miktari giriniz");
                int yatirilacakMiktar = scan.nextInt();
                if (yatirilacakMiktar<=2000){
                    bakiye = bakiye + yatirilacakMiktar;
                    System.out.println("Para yatirma isleminden sonraki mevcut bakiyeniz : " + bakiye + "TL");
                }else{
                    System.out.println("Gunluk para yatırma limiti 2000 TL");
                }
                break;

            case 4 : // İslemi Sonlandırma
                System.out.println("Bankamızı Tercih Ettiğiniz İçin Teşekkür Ederiz");
                break;

            default:
                System.out.println("Gecerli bir islem numarası giriniz");
        }



    }
}
