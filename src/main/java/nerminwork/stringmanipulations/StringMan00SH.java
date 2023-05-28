package nerminwork.stringmanipulations;

public class StringMan00SH {

    public static void main(String[] args) {


        //**************   charAt () Methodu   *************

        String s1 = "StudyHardStayHumble"; //Cok calış mütevazi ol.
        System.out.println(s1.charAt(0));//S

        //7. characteri ekrana yazdırınız.

        System.out.println(s1.charAt(6));//a

        //Son characteri ekrana yazdırınız.
        System.out.println(s1.charAt(18));//e   19-1=18

        System.out.println(s1.length());//19    Son characterin indexi = character -1
        System.out.println(s1.charAt (s1.length()-1));

        //Ortadaki characteri ekrana yazdırınız.
        if(s1.length()%2!=0){// uzunluk tek sayı old için orta harf var. cift olunca orta harf yoktur.
            System.out.println(s1.charAt ((s1.length()-1)/2));//S

        }
        //System.out.println(s1.charAt(38)); hata verir.

        /*
        charAt() methodunda olmayan bir index kullandıgımızda
        programi caliştirdiktan sonra ekranda kırmızı hata mesaji alırız.
        Javada temelde 2 tur hata vardır.
        1)Compile Time Error = Kod yazarken alınan kırmızı alt cizgiler
        2)Run Time Error = Kod calıstıktan sonra consolda gozuken kırmızı cizgiler
        Run Time Error oldugunda sonraki kodlar calışmaz.
        Java kod calıştırmayı (execution) durdurur.
         */

        //**************  concat  () Methodu   *************

        String s2 = "Ogreten Ögrenir";
        //String methodları gecici degişiklik yapar. Orjinal String degişmez.
        System.out.println(s2.concat(" tamam mi?")); //Ogreten Ögrenir tamam mi?


        //************** contains () Methodu   *************

        // contains () Methodu boolean return eder.

        String s3 = "Java ögren zengin ol";
        System.out.println(s3.contains("J"));//true
        System.out.println(s3.contains("x"));//false
        System.out.println(s3.contains("ögren"));//true
        System.out.println(s3.contains("Zengin"));//false
        System.out.println(s3.contains(""));//true
        System.out.println(s3.contains(" "));//true



        //************** endsWith () Methodu   *************

        //Bu method String ile calişir. Char kabul etmez.

        String s4 = "Testi al kendini gör";
        System.out.println(s4.endsWith("r"));//true
        System.out.println(s4.endsWith("gör"));//true
        System.out.println(s4.endsWith(""));//true
        System.out.println(s4.endsWith("Testi al kendini gör"));//true


        //************** equals () Methodu   *************

        System.out.println("Ali".equals("Ali"));//true
        System.out.println("Ali".equals("ALI"));//false
       // System.out.println("Ali" == "Ali");//true        her zaman true vermeyebilir. Bu yuzden equals methodu tercih edilir.


       //**************  indexOf () Methodu   *************

        //Bu method indexi sorulan char'ın String içindeki ilk görünümünün indexini return eder.
        //Hem char hem de String ile calişir.
        //Birden fazla characterin indexi sorulursa ilk characterin indexi retur edilir.

        //String s4 = "Testi al kendini gör";
        System.out.println(s4.indexOf('i'));//4
        System.out.println(s4.indexOf('T'));//0
        System.out.println(s4.indexOf(' '));//5
        System.out.println(s4.indexOf("al"));//6
        System.out.println(s4.indexOf('x'));//-1
        System.out.println(s4.indexOf(""));//0


        //************** indexOf () Methodu   *************

        String s5= "Cabuk ögrenilen cabuk unutulur";
        System.out.println(s5.indexOf('a', 6));//17
        //6. indexe geliriz ve sonraki ifadenin içinde 'a' harfini ararız.
        //6. index ==ö  --> ögrenilen cabuk unutulur --> a harfi 17. indextedir.

        System.out.println(s5.indexOf('r', 8));//8
        //8. indexe geliriz ve sonraki ifadenin içinde 'r' harfini ararız.
        //8. index ==r  --> renilen cabuk unutulur --> r harfi 8. indextedir.

        System.out.println(s5.indexOf("buk", 5));
        //5. indexe geliriz ve sonraki ifadenin içinde "buk" ararız.
        //5. index == (space)  --> ()ögrenilen cabuk unutulur--> buk 18. indextedir



        //************** isEmpty () Methodu   *************

        //Bu methoddan true alıyorsanız o Stringin içinde hiç karakter yok demektir.
        //yani o Stringin lengthi 0 demektir.

        String s6 = "Tekrar et unutma";
        System.out.println(s6.isEmpty());//false
        System.out.println("".isEmpty());//true



        //************** lastIndexOf  () Methodu   *************

        //Bu method indexi sorulan characterin son görünümünün indexini return eder.

        System.out.println(s6.lastIndexOf('e'));//7

        String s7 = "Tekrar et tekrar unutma";
        System.out.println(s7.lastIndexOf("rar"));//13

        System.out.println(s7.lastIndexOf('r', 16));//15
        //ilk 16 indexe kadar alırız. == "Tekrar et tekrar "//16
        //Aldıgımız ifadedeki en sonki 'r' harfinin indexi =15tir.

        System.out.println(s7.lastIndexOf("k", 14));//12
        //ilk 14 indexe kadar alırız. == "Tekrar et tekra"
        //Aldıgımız ifadedeki en sonki "k" harfinin indexi = 12tir.


        //**************  length () Methodu   *************
        //Bir Stringdeki characterlerin sayisini verir.

        //String s7 = "Tekrar et tekrar unutma";
        System.out.println(s7.length());//23



        //**************  replace () Methodu   ************* (yerine koymak)

        //String s7 = "Tekrar et tekrar unutma";
        System.out.println(s7.replace('e', 'E')); //TEkrar Et tEkrar unutma
        System.out.println(s7.replace('x', 'M')); //Tekrar et tekrar unutma
        System.out.println(s7.replace("krar", "miz")); //Temiz et temiz unutma
        System.out.println(s7.replace("a", ""));//Tekrr et tekrr unutm
        System.out.println(s7.replace(" ", ""));//Tekrarettekrarunutma
        System.out.println(s7.replace("", "/"));//   /T/e/k/r/a/r/ /e/t/ /t/e/k/r/a/r/ /u/n/u/t/m/a/



        //**************  replaceAll () Methodu   *************

        /*
        Regular Expression = (Regex)(Düzenli İfade)
        Belli türdeki charakterleri secebilmemize yarar.
        1)\\d == tüm rakamlar
          \\D == tüm rakam dışı characterler

        2) \\w == A-Z   a-z     0-9     _
            \\W == A-Z   a-z     0-9     _  disindaki her sey

        3) \\s == space
            \\S == space disindakiler


         */

        String s8 = "Code1 yazarak2 ogrenilir3";
        System.out.println(s8.replaceAll("\\d", "*")); //Code* yazarak* ögrenilir*
        System.out.println(s8.replaceAll("\\D", "*")); //****1********2**********3
        System.out.println(s8.replaceAll("\\w", "*")); //***** ******** **********
        System.out.println(s8.replaceAll("\\W", "*")); //Code1*yazarak2*ogrenilir3
        System.out.println(s8.replaceAll("\\s", "*")); //Code1*yazarak2*ogrenilir3
        System.out.println(s8.replaceAll("\\S", "*")); //***** ******** **********



        //**************  startsWith () Methodu   *************


        System.out.println(s8.startsWith("C"));//true
        System.out.println(s8.startsWith("c"));//false
        System.out.println(s8.startsWith("Code"));//true
        System.out.println(s8.startsWith("e", 3));//true



        //**************  substring () Methodu   *************

        String s9 = "Java OOP languagedir";

        System.out.println(s9.substring(3));//a OOP languagedir
        System.out.println(s9.substring(5));//OOP languagedir
        System.out.println(s9.substring(19));//r
        System.out.println(s9.substring(s9.length()-1));//r -- dinamik kod
        System.out.println(s9.substring(9, 17));//language
        //index 9 dahil index 17 hariç

        System.out.println(s9.substring(0, 1));//J
        //substring(0, 1) Stringdeki ilk harfi verir.

        System.out.println(s9.substring(5, 5)); //Ekranda hicbir sey gorulmez.
        //indexler esitse hicbir sey görülmez.

        //System.out.println(s9.substring(5, 2)); //Run Time Error verir.
        //String index out of range = String aralıgının dısında demektir.


        //**************  trim () Methodu   *************

        //Stringin basindaki ve sonundaki spaceleri siler. Aradaki spacelere dokunmaz.

        String s10= "    Java ogrenen diger dilleri cabucak ogrenir    ";
        System.out.println(s10.trim());//Java ogrenen diger dilleri cabucak ogrenir


    }//main
}//class
