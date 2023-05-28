package practices.day05practices;

public class MaymunAlive {
    public static void main(String[] args) {



        /*                          INTERWIEW SORUSU


        Adada yalnız bir maymun var. Her gün 4 muz yemesi gerekiyor
        Adada sadece 165 muz var
        Maymunun kac gun hayatta kalabilecegini hesaplayan kodu yaziniz.

        */

        int numberOfBananas = 165;
        int survivalDays =1;
        boolean monkeyAlive = true; // default deger

        do {
            numberOfBananas-=4; // toplam muz sayısından her gun 4 muz eksilir.
            System.out.println("Kalan Muz Sayısı : " + numberOfBananas);

            survivalDays++;

            if (numberOfBananas<4){
                monkeyAlive=false;
                System.out.println("Bugun " + survivalDays + ". gun; yeterli muz kalmadı, maymun rahmetli. Rest in Peace");
            }else{

                System.out.println("Bugun " + survivalDays + ". gun; Maymun hala yasıyor");
            }

        }while (monkeyAlive);



   }
}