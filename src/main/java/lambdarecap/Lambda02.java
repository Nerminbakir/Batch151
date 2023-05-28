package lambdarecap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class Lambda02 {
    public static void main(String[] args) {

                List<String> meyve = new ArrayList<>(Arrays.asList("elma","portakal","uzum","cilek","greyfurt",
                        "nar","mandalina","armut","elma","keciboynuzu","elma"));
                ilkHarfeVeyac(meyve);
                System.out.println(" \n  *******");
                elemanBasinaVeSonunaYildiz(meyve);
                System.out.println(" \n  *******");
                System.out.println(karakterSayGoreBuyKucSirKarSayEnBuyIlk3(meyve));
            }
            // SORU1 : List elemanlarının ilk harfi 'e' veya 'c' olanlari yazdıralım
            public static void ilkHarfeVeyac(List<String> meyve){
                meyve.stream().filter(t->t.startsWith("e") || t.startsWith("c")).forEach(Utils::yazdir);
            }
            // SORU2 : List elemanlarının hepsinin basina ve sonuna yildiz ekleyerek yazdiralim
            public static void elemanBasinaVeSonunaYildiz(List<String> meyve){
                meyve.stream().map(t->"*" + t + "*").forEach(Utils::yazdir);
            }
            // SORU3 : List elemanlarını karakter sayısına gore buyukten kucuge sıralayınız,
            // karakter sayısı en buyuk ilk 3 elemanı List halinde return ederek yazdırınız
            public static List<String> karakterSayGoreBuyKucSirKarSayEnBuyIlk3(List<String> meyve){
/*
       List<String> sonuc = meyve.
                            stream().
                            sorted(Comparator.comparing(t->t.toString().length()).reversed()).
                            limit(3).collect(Collectors.toList());
       return sonuc;
 */
                List<String> sonuc = meyve.
                        stream().
                        sorted(Comparator.comparing(String::length).reversed()).
                        limit(3).collect(Collectors.toList());
                return sonuc;
            }

    }

/*
Stringlerden olusan bir list olusturalim.

List<String> meyve=new ArrayList<>(Arrays.asList("elma", "portakal","uzum", "cilek", "greyfurt", "nar", "mandalina",
"armut", "elma", "keciboynuzu", "elma"));

Her zamanki gibi metodlarimizi main metod disinda olusturup, main metod icinde call ederek calistiracagiz.

// SORU1 : List elemanlarının ilk harfi 'e' veya 'c' olanlari yazdıralım.

Soru bizden ilk harfi e veya olanlari almamizi, bir filtreleme yapmamizi istiyor.

1.adim: ilkHarfeVeyac isimli metodumuzu olusturduk. Parametresi Stringlerden olusan bir list oldu.

2.adim: meyve listimizi stream ile akisa sunduk. List elemanlarinin ilk harfi e veya c olanlari alarak yolumuza
devam edecegiz. startsWith metodu ilk harfi alacagindan bu metodu filter metodu icinde kullandik.
Bundan sonra forEach metodu ile yazdirdik. Utils Class'imizda yazdir metodumuz vardi. O metodun parametresini
Object olarak girmistik. Object yazinca bu metodu hem integerlar hem Stringler icin kullanabiliriz. Burada da kullana-
biliriz.
meyve.stream().filter(t->t.startsWith("e" || t.startsWith("c")).forEach(Utils::yazdir);

3.adim:metodumuzu main metod icinde call ettik ve metod parantezi icine listimizin ismi olan meyve'yi yazdik. Run
edince ekranda ilk harfi e ve c olanlari gorduk.
 */

/*
// SORU2 : List elemanlarının hepsinin basina ve sonuna yildiz ekleyerek yazdiralim.
elemanlarinin basina ve sonuna yildiz ekleyerek elemanlari degisiklige ugratmis olacagimiz icin burada map metodunu
kullanmaliyiz.


1.adim: elamanBasinaVeSonunaYildiz isimli list parametreli metodumuzu main metod disinda olusturduk.

2.adim:
meyve.stream().map(t->"*" + t + "*").forEach(Utils::yazdir);

3.adim:main metod icerisinden metodumuzu call ettik. Argument olarak metod parametresi icine meyve yazdik. Kodumuzu run ettik. Ekranda her elemanin basi ve sonunda * oldugunu gorduk.
 */