package practices.day17practices;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02 {
    /*
         Bir tane txt dosyası olusturunuz.
         txt dosyasının icerisine cumleler yazınız
         Olusturdugunuz txt dosyasına ulasınız.
         icerisindeki cumleleri yazdırınız
     */

    public static void main(String[] args) {

         /*
        Bir kod yazılırken olası exceptionları ongorup exception olustugunda
        javanın ne yapmasını istedigimize karar vermeliyiz


        1- eger exception olustugunda kodun calısmaya devam etmesini istemiyorsak;
        main method isminin yanına olusabilecek exceptio'ı deklare ederiz


        2- eger exception olussada kodun calısmaya devam etmesini istiyorsak;
        sorun olusturabilecek kodu try blogunun icine yazmalıyız

        catch bloguna ise exception durumunda javanın ne yapmasını istedigimizi yazmalıyız
         */

        String dosyaYolu="src/main/java/practices/day17practices/dosya.txt";

        try {

            FileInputStream fis = new FileInputStream(dosyaYolu);
            int k = 0;
            while ((k = fis.read())!=-1){
                System.out.print((char) k);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            //read kelimesinin altını çizdikten sonra bir kez daha üzerine
            //gelip soldaki add ile başlayan seçeneğe tıkladık
            //try eklemiş olduk
            e.printStackTrace();
        }


    }
}



//file ye ulaşmak için dosya yolunu almamız gerek (15. satır)
//bunun için txt filesinin üstüne sağ tık, copy path reference, path from content root, tırnak içindeki kısma ctrl v yaptık.

//FileInputStream kızardı üzerine gelip signature tıkladık, main methodun yanına
//throws FileNotFoundException geldi ama bunu istemediğimiz için main method
//yanındaki kısmı silip Code seçeneğinden try catch ekledik

/*
dosya.txt olusturduk ayni package icinde new kismindan file'a geldik ve file kismini secerek olusturduk.
Intellij icinde sirali haldeki package'ler altinda
bizim dosya.txt'i olusturdugumuz package kismina gelip, dosya.txt uzerine gelip tiklayinca basta cikan
ekrandan Copy path reference kismini seciyoruz ve oradan Path from Content Root kismini secince oradaki
src/main/java...seklindeki yaziyi kopyalamis oluruz ve onu alip C02 classimiza getiririz paste
yapinca kizardigini gorunce onu String bir variable olusturarak ona assign ettik.
Bu text'i bu class icinde okuyabilmmemiz icin boyle yaptik ve daha sonra FileInputStream Classindan
object olusturduk; FileInputStream fis=new FileInputStream(dosyaYolu) parametre olarak String variable
ismini koyduk. Cunku bu variable icinde text'imize ait bir yazi var. O text ile islem yapilacak.
Bu islemlere ragmen Java bu dosyayi bulamazsa diye object'imizin constructor kismi kizardi.

Boyle olunce biz dilersek main metod yanina throws keywordu ile birlikte Exception'i ekleyebiliriz.
Biz bu yolu degil main metod'un altina try catch blogu icinde throw keywordu ile exception'i yazmak istedik.
Boylece Javaya bir exception firlatma durumu olursa bunu atabilecegini soylemis olduk.

Object'imizi try blogu icine aldiktan sonra bir while loop olusturduk. Oncesinde int k=0; olusturduk.
while icine dosyami oku -1'e esit degilse k'ya assign et diye bir sart yazdik. -1'e esit ise o dosya icinde  bir sey yazmadigi anlamina gelir. while loop icinde olusturdugumuz sout icine k'yi yerlestirirken oncesinde bir parantez icine char yazdik. Cunku dosya icindeki harfler tek tek okunacak. char ile harfler tek tek okunabilecek.
Ancak burada read yazan kisimda java dosyayi okuyamazsam endisesiyle kizarma yapti. Kizaran kisma geldik ve ikinci bir catch blogu olusturduk

catch (FileNotFoundException e){//child exception
throw new RuntimeException(e);
} catch (IOException e) {//parent exception
throw new RuntimeException(e);
}
read kismi kizarmasaydi bir catch ile yolumuza devam edecektik. Ilk catch javanin dosyayi bulamamasi riskine
karsi olusturuldu. Ikinci catch blogu ise dosyayi okuyamama riskine karsi olusturuldu.
 */