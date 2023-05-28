package javaders.day33maps;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMap01 {
    public static void main(String[] args) {

        String s = "Hello Henry!";
        System.out.println(getTheNumOfOccurenceOfLetters(s)); // {r=1, e=2, H=2, y=1, l=2, n=1, o=1}
    }

    // Example 1 : Verilen bir String'te hangi harfin kac defa kullanıldıgını veren method olusturunuz.
    //          "Hello Henry!" ==> H=2, e=2, l=2, o=1, n=1, r=1, y=1

    public static TreeMap<String, Integer> getTheNumOfOccurenceOfLetters (String s){

    // Stringteki harf dısı characterleri sil
    s = s.replaceAll("[^A-Za-z]", "");

    // Görünüm sayılarını olusturmak için Map olustur.
    //HashMap<String, Integer> numOfOccurence = new HashMap<>();
    TreeMap<String, Integer> numOfOccurence = new TreeMap<>(); // afabetik sıra

    // Harfleri almamız lazım.
    String letters [] = s.split("");

    // for-each loop olustur

        for (String w : letters) {
            Integer numOfOcc = numOfOccurence.get(w);

            if(numOfOcc==null){
                numOfOccurence.put(w,1);
            }else{
                numOfOccurence.replace(w,numOfOcc+1); // put () methodu da kullanılabilir ama okunurluk acısından replace () methodu daha uygundur.
            }
        }

        return numOfOccurence;


            /*
                Soruya bakildiginda map kullanilacagi anlasiliyor. (H=2, e=2, l=2, o=1, n=1, r=1, y=1)
                Main method disinda method olusturacagiz. HashMap  olarak olusturdugumuz methodu static yapiyoruz.
                Boylece main methodu kullanabilecegiz.

                Bu method ile kullanilacak harfler soruldugundan bir String olusturacagiz. Biz harflere bakacagimizdan
                harfler disindaki karakterleri replaceAll methodu ile silecegiz. Eger harf degil her karakterin kac kez
                kullanildigi denseydi bu silme islemini yapmazdik. Gorunum sayilarini depolamak icin bir map
                olusturacagiz. HashMap'imizi bir String bir Integer ile olusturacagiz. HashMap'imizin adi numOfOccurence.

                Harfleri almaliyiz. Bunun icin split methodu kullaniriz. s isimli Stringimiz ile split methodunu kullaniriz.
                split icine hiclik saydigimiz "", koyduk. Boylece tek tek her harfi alabiliriz.Aldigimiz harfleri yine
                bir String array'e koyduk ve ona letters dedik. Split methodu arraylerde kullanilir.

                Loop olusturmamiz gerekir. For each loop icinde harfleri barindiran letters'i w olan String'e atadik.
                get methodunu Map ismi ile kullandık ve w;yi aldik, bir Integer variable'ina assign ettik.
                Bu yolla harfin kac kez gorundugunu bulacagiz.

                Bir if statement ile map kendisine w'yu assign ettigimiz Integer variable'in null'a esit olup olmadigini
                bulmaya calistik. Null ise o eleman yok demektir ve olmayan eleman yerine 1 degerini verdik. Put methodu
                bize o elemani al, yerine su degeri ver dedigimizde onu yapar. put () methodu da kullanılabilir ama
                okunurluk acısından replace () methodu daha uygundur. Ornek w'yi al, yerine 1 yerlestir.
                Daha sonra loop ile diger elemana bakacagiz. O eleman varsa ilk if statement artik calismaz,
                else bolumune gecilir ve buna gore deger artisi yapilir. Var olan bir eleman ise
                w icinde buldugumuz o elemana arti bir deger verdik. O eleman once 1 iken bu defa 2 olur,
                sonraki dongulerde yine varsa 2 olan elaman artik 3 olacak.

                If statement icindeki kosul gerceklesmezse if kismi degil else kismi calisir. Loop tamamlaninca numOfOccurence
                map'ini return ediyoruz loop {} disinda. Boylelikle sonucu alabiliyoruz.
                */

    }

}
