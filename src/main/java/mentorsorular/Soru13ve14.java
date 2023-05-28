package mentorsorular;

import java.util.Scanner;

public class Soru13ve14 {
    public static void main(String[] args) {

        /*
        Soru-13:Seyahat Projesi-->Bulundugunuz yerden, bir yere yolculuk edeceksiniz.
            A. Köln veya Frankfurta gidebilirsiniz.
            B. Bilet fiyatı hesabı = Her 20 Km başına 5 euro. örn: (100 km yol. Bilet parası  (100/20)* 5 =25 euro
              İPUCU:  toplamTutar, işlem, FrankfurtKm, KmBirimFiyat   gibi sabit veri tipleri oluşturabilirsiniz.
              İşlemlerde direkt bunları cağırabilirsiniz.
              to-do İLK OLARAK;
             "Nereye yolculuk etmek istiyorsunuz? (Frankfurt :60KM---Köln:80 KM---(20 KM başına 5 euro bilet parası alınmaktadir..)yazısı gelsin.
       1.Frankfurt veya Köln olarak bir giriş yapın. (Girdiğiniz sehrin harfleri , girildikten sonra büyük hale gelsin.
              to-do Frankfurt girildiyse,
                 örn: girdi= Frankfurt
                 case=FRANKFURT:
                 Rota = Frankfurt yazdırın.
                 Frankfurt km hesabı işlemi yapın. son olarak konsolda: Frankfurt 15 Euro yazsın.
              to-do case: KÖLN ise
                 "Rota = Köln" yazdırın. km hesabına göre işlemi yapınız.son olarak konsolda:  Köln   20 Euro yazsın.
       2.Sistem bize "Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir):" sorusunu sorsun.
             case:1 ise" 1 kişilik " yazdırın. (1 kişilik seçerseniz bir işlem yapmanıza gerek kalmaz, bilet ücreti yukarıda çoktan belirlenmiş olur.
             case:2 ise "2 kişilik " yazdırın.2 kişi için bilet fiyatını hesaplayın.
              to-do  Son olarak yolculugunuzu check edin;
        konsolda örn:   Frankfurt  - 2 Kişilik    yazsın.
        a.Bakiyemi belirtin.
        b.Toplam Tutarı belirtin.
        c.double paraUstu oluşturun ve hesaplayın.
        d.Double para üstünü yazdırın.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Nereye yolculuk etmek istiyorsunuz? : (Frankfurt :60KM---Köln:80 KM---(20 KM başına 5 euro bilet parası alınmaktadir..)" +
                "\n Frankfurt" +
                "\n Köln" );

        String sehir = scan.next().toUpperCase();
        double bakiye = 100;
        double frUcret = 60/20 *5;
        double kolnUcret = 80/20*5;

        System.out.println("Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir)");
        int sayi = scan.nextInt();


        switch (sehir){
            case "FRANKFURT" :
                System.out.println("Rota = Frankfurt");
                if (sayi==1){
                    System.out.println("Frankfurt " + frUcret + " Euro");
                    System.out.println("Kalan Bakiyeniz : " + (bakiye - frUcret));
                } else if (sayi==2) {
                    System.out.println("2 kişilik Frankfurt Bileti " + (2*frUcret) + " Euro");
                    System.out.println("Kalan Bakiyeniz : " + (bakiye - 2*frUcret));
                }else {
                    System.out.println("Max 2 kişi olabilir");
                }
                break;

            case "KOLN" :
                System.out.println("Rota = Koln");
                if (sayi==1){
                    System.out.println("Koln " + kolnUcret + " Euro");
                    System.out.println("Kalan Bakiyeniz : " + (bakiye - kolnUcret));
                } else if (sayi==2) {
                    System.out.println("2 kişilik Koln Bileti " + 2*kolnUcret + " Euro");
                    System.out.println("Kalan Bakiyeniz : " + (bakiye - 2*kolnUcret));
                }else {
                    System.out.println("Max 2 kişi olabilir");
                }
                break;

            }

  /*
        Soru-14:Kullanıcıdan üç adet sayı alarak bu sayıların bir dik üçgenin kenar uzunlukları olup olmadığını hesaplatan bir kod yazınız
            (İpucu: Bir üçgenin dik olduğunu anlamak için a2+b2=c2 pisagor bağlantısından yararlanabilirsiniz)
            Örnek Ekran Çıktısı
            birinci kenarı giriniz: 2
            ikinci kenarı giriniz 15
            üçüncü kenarı giriniz: 7
            Bu bir dik üçgen değildir/Bu bir dik üçgendir
         */


        System.out.println("3 adet sayı giriniz");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a*a + b*b == c*c || b*b + c*c == a*a || a*a + c*c == b*b){
            System.out.println("Bu bir dik ucgendir");
        }else{
            System.out.println("Bu bir dik üçgen değildir");
        }




    }
}
