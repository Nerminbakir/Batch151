package practices.day17practices;

import java.util.Scanner;

public class C01_Exception {
    public static void main(String[] args) {

        /*
        Kullanıcıdan istedigi kadar sayiyi alıp toplayan bir program yazınız
        toplam 500'u gecerse programı bitirsin veya kullanıcı bitirmek istediginde Q'ya basmalıdır
         */

        Scanner scan = new Scanner(System.in);

        int toplam = 0;

        do {
            System.out.println("Toplamak istediğiniz sayıyı giriniz \n Bitirmek için Q'ya basınız");
            int sayi=0;
            try {                                //Q'ya basınca hata verir--->InputMismatchException
                sayi = scan.nextInt();
            } catch (Exception e) {
                String hataliGiris = scan.next();

                if(hataliGiris.equalsIgnoreCase("q")){
                    break;
                }else {
                    System.out.println("Hatalı giriş");
                }
            }
        toplam+=sayi;
        }while (toplam<500);
        System.out.println("Girdiğiniz Sayıların Toplamı : " + toplam);


    //yukarıda yan yan bulunan file edit satırından code surround with i bulduk orda try catch i bulduk

    }
}
/*
Scanner object'ini olusturduk.
do while loop ile islemi yapacagiz. Ancak do while scope disinda once toplanan sayilari tutacagimiz bir int variable olusturacagiz; int toplam=0;
while icine sartimizi su sekilde yazdik: toplam<500. 500'den kucuk oldugu surece loop donecek do body'si icinde kullaniciya sayiyi girmesini ve bitirmek istediginde q'ya basmasi yonunde mesaj verdik.
Bu mesajimizdan sonra int sayi=scan.netxInt(); kullanicinin verecegi sayiyi int sayi'ya assign ettik.
Kodumuzu bu sekilde calsitirinca 100 ve ardindan 200 sayilari verilince bir problem cikmadi. Ancak kullanici Q'ya basinca ekranda Run Time Exception olarak InputMismatchException atildigini gorduk, exception'in 19. satirda atildigini anladik.

Q bir integer olmadigi icin biz bu exception ile karsilastik. Bu bir Run Time Exception oldugundan try catch ile bu exception'i handle edebiliriz. 19. satira geldik ve try catch ile o satirdaki kodumuz try catch blogu icine girdi. Bunu nasil yaptik? 19. satirdaki kod blogumuzu secili halde biarkip sayfamiz disinda Code kismina gelip gelince Surround kismindan try catch blogunu sectik.
try'i pozitif senaryoya gore olusturduk. int sayi=sacn.nextInt(); bu kismi zaten onceden yazmistik.Kullanici
sayi verdiyse bu sayiyi bir integer variable'ina assign ettik. Boyle olursa problem cikmayacak. Ancak
kullanici sayi yerine baska bir sey girmis olabilir diye catch ile devam ettik.
catch kisminda ise Exception e yazdiktan sonra body'si icine String hataliGiris=scan.next(); yazdik.
Cunku sayi yerine harf girerse diye scan.net()'i bir String'e assign ettik.
Devaminda if statement'i olusturduk. String hataliGiris variable'inda muhafaza edilen sayi ya da harf
neyse bunun q olup olmadigini kontrol etmemiz gerektiginden if () icinde
hataliGiris.equalsIgnoreCase("q") olmasi halinde break ile devam etmemesini istemis olduk. Eger kullanici
q vermediyse String hataliGiris icinde "q" yoksa sayi ve q disinda bir seyi kullanici vermistir. Bu durumda
sout icine "Hatali Giris" yazilmasini istedik. Kullanici sayi girdi ve Q'ya bastiysa verdigi sayilarin
toplamini alabilmek icin toplam+=sayi; yazmistik. while loop q'ya basilip bittiginde ya da 500'den buyuk bir sayi girilmesi neticesinde bittiginde ekranda
girilen sayinin toplaminin yazdirilmasini sout ile istemis olduk.
 */