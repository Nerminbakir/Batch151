package kahvemakinesiprojesi;

import java.util.Scanner;

public class Kahve {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Hangi Kahveyi İstersiniz : \n 1. Turk Kahvesi \n 2. Filtre Kahve \n 3. Espresso");
        String hangiKahve = input.nextLine();


        System.out.println("Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız):");
        String sut = input.next().toLowerCase();

        if (sut.equalsIgnoreCase("evet")) {
            System.out.println("Süt ekleniyor...");
        } else {
            System.out.println("Süt eklenmiyor...");
        }

        System.out.println("Şeker ister misiniz ? (Evet veya hayır cevabını veriniz) : ");
        String seker = input.next();

        if (seker.equalsIgnoreCase("evet")) {
            System.out.println("Kaç şeker olsun?");
            int kacSeker = input.nextInt();
            System.out.println(kacSeker + " şeker ekleniyor");
        } else {
            System.out.println("Şeker eklenmiyor...");
        }

        String bosKod = input.nextLine();
        System.out.println("Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.) :");
        String boyut = input.nextLine().toLowerCase();


       if (boyut.equalsIgnoreCase("Büyük boy")) {
            System.out.println("Kahveniz buyuk boy" + boyut + " hazırlanıyor.");
        } else if (boyut.equalsIgnoreCase("Orta boy")){
            System.out.println("Kahveniz " + boyut + " hazırlanıyor.");
        }else {
            System.out.println("Kahveniz " + boyut + " hazırlanıyor.");
        }


    }
}
