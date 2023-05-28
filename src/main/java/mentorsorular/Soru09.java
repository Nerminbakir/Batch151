package mentorsorular;

import java.util.Scanner;

public class Soru09 {
    public static void main(String[] args) {
        /*
         Soru-9: Kulanıcıdan aracının hızını alınız.Trafik cezasının değerini hesaplayın. 54 hız sınırıdır.
            Eğer hızınız 55-74 arasında ise:Ceza 100 $'dır.
            Eğer hızınız 75 - 84 arasında ise:Ceza 150 $'dır.
            Eğer hızınız 85 -94 arasında ise:Ceza 320 $'dır.
            Eğer hızınız 94'den daha fazla ise: Ceza 500 $'dır.
            ve ayrıca,
            Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.
            Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.
            Örn;
            currentSpeed(Hızınız) 87
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;  sonuç 320 olmalıdır.
            currentSpeed(Hızınız) 65
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = false; sonuç 300 olmalıdır.
         */
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ehliyetiniz var ise E yok ise H harfini giriniz");
        String ehliyet = scan.next().toUpperCase();

        System.out.println("Lutfen arac hızınızı giriniz");
        int hiz= scan.nextInt();

        if (hiz<0) {
            System.out.println("Hatalı veri girdiniz. Hız 0'dan kucuk olamaz");
        }else if(hiz<55){
            System.out.println("Hız sınırını asmadınız");
        }

        if (ehliyet.equals("E")) {
            if (hiz >= 55 && hiz < 74) {
                System.out.println("Ceza 100$");
            } else if (hiz >= 75 && hiz < 84) {
                System.out.println("Ceza 150$");
            } else if (hiz >= 85 && hiz < 94) {
                System.out.println("Ceza 320$");
            } else if (hiz >= 95) {
                System.out.println("Ceza 500$");
            }

        }else {
            if (hiz >= 55 && hiz < 74) {
                System.out.println("Ceza : 300$");
            } else if (hiz >= 75 && hiz < 84) {
                System.out.println("Ceza 350$");
            } else if (hiz >= 85 && hiz < 94) {
                System.out.println("Ceza 520");
            } else if (hiz >= 95) {
                System.out.println("Ceza 700$");
            }
        }










    }
}