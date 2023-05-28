package mentorsorular;

import java.util.Scanner;

public class Soru19ve20 {
    public static void main(String[] args) {


       /*
    Soru-19:Kullanıcıdan bir pozitif tamsayı girmesini isteyin, o pozitif tamsayı 3 basamaklı ise ekrana “3 Basamaklı” yazdırın.
            3 basamaklı degilse çift olup olmadigini kontrol edin. Çift ise “3 basamaklı olmayan çift sayı” yazdırın.
            Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.*/

            Scanner scan = new Scanner(System.in);
            System.out.println("Pozitif bir sayı giriniz");
            int sayi = scan.nextInt();

            if (sayi>99 && sayi<1000){
                System.out.println("3 Basamaklı");
            }else{
                if (sayi%2==0){
                    System.out.println("3 basamaklı olmayan çift sayı");
                }else{
                    System.out.println("3 basamaklı olmayan tek sayı");
                }
            }



    /*Soru-20:Kullanıcıdan notunu alın ve aşağıdaki kurallara göre console'a A, B, C veya D yazdırın.
		    -> 0(dahil) ile 50 arasi - D
		    -> 50(dahil) ile 60 arası - C
		    -> 60(dahil) ile 80 arası - B
		    -> 80(dahil) ustu- A
		Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin

		*** IPUCU--> switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
		             switch() de int, byte, short, char, String kullanilir.

     */

        System.out.println("Notunuzu giriniz");
        int not = scan.nextInt();

        if(not>=0 && not<50) {
            not = 0;
        }else if(not>=50 && not<60){
            not = 50;
        }else if(not>=60 && not<80){
            not = 60;
        }else if(not>=80 && not<=100){
            not = 80;
        }
        switch(not) {
            case 0:
                System.out.println("D");
                break;
            case 50:
                System.out.println("C");
                break;
            case 60:
                System.out.println("B");
                break;
            case 80:
                System.out.println("A");
                break;
            default:
                System.out.println("Gecerli not giriniz");
                break;
        }



    }
}
