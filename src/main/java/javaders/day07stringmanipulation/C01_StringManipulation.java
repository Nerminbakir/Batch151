package javaders.day07stringmanipulation;

public class C01_StringManipulation {

    public static void main(String[] args) {


                //***********  endswith ***********

        /*
            endsWith () metnin belirli bir datayla bitip bitmediğini verir.
            Bize boolean bir sonuc dondurur.
            Tek karakterde coklu karakterde kullanılabilir.

                //***********  replace ***********

             Metnin içerisindeki belirli bir datanın yerine verilen diğer datayi yerleştirir.
             Bize String bir data dondurur.
             tekli karakter ile de coklu karakterler ile de calisir. 
             Ancak her iki tarafta da "" ya da  her iki tarafta da '' kullanılmalıdır.


               //***********  replaceAll () ***********

             Bir grup datayi degistirmek için kullanilir.
             Bir grup datayi ifade edebilmek için Regular Expression (Regex) kullanilir.
               */

        String s ="Learn Java earn money";

        // Ex = s Stringinin money ile bitip bitmediğini kontrol ediniz.

        boolean isEnd = s.endsWith("money");
        boolean isEnd1 = s.endsWith("y");
        boolean isEnd2 = s.endsWith("ney");
        boolean isEnd3 = s.endsWith(".");

        System.out.println(isEnd); //true
        System.out.println(isEnd1); //true
        System.out.println(isEnd2); //true
        System.out.println(isEnd3); //false
        System.out.println("isEnd = " + isEnd); //true

        // Ex = s Stringinin money kelimesini dolar kelimesine ceviriniz.

        String s1 = s.replace("money", "dolar");
        System.out.println("s1 = " +s1 ); //s1 = Learn Java earn dolar

        // Ex = s Stringindeki "earn" kelimesini "win" kelimesiyle degistiriniz

        String s2 = s.replace("earn", "win");
        System.out.println("s2 = " + s2); //s2 = Lwin Java win money

        // Ex = s Stringindeki "a" harflerini "*" ile degistiriniz.
        
        String s3 = s.replace("a","*");
        String s4 = s.replace('a','*');
        System.out.println("s3 = " + s3); //s3 = Le*rn J*v* e*rn money
        System.out.println("s4 = " + s4); //s4 = Le*rn J*v* e*rn money

        // Ex = s Stringindeki "n" harflerini "***" ile degistiriniz.
        
        String s5 = s.replace("n" ,"***");
        System.out.println("s5 = " + s5); //s5 = Lear*** Java ear*** mo***ey

        // Ex = s Stringindeki "e" harflerini siliniz.
        
        String s6 = s.replace("e", "");
        System.out.println("s6 = " + s6);//s6 = Larn Java arn mony


        //char data type'inin icerisine mutlaka bir karakter yerleştirilmelidir.
        // Space bir karakterdir. char'in içine yerlestirilebilir .
        // Ancak hiçlik javada char için kullanılamaz.
        // Bu nedenle silme işlemi yaparken mutlaka String kullanmalıyız.


        String t = "Yucel 25 ya$indadir sandik ama 30'mus!.";

        // Ex = t Stringindeki tum rakamlari "*" a ceviriniz

        String t1 = t.replaceAll("[0-9]" , "*");
        System.out.println("t1 = " + t1); //t1 = Yucel ** ya$indadir sandik ama **'mus!.

        /*
        En Cok Kullanılan Regexler

        1) Tum Rakamlar                  ==> [0-9]
        2) Tum Kucuk Harfler             ==> [a-z]
        3) Tum Buyuk Harfler             ==> [A-Z]
        4) Tum Harfler                   ==> [a-zA-Z]
        5) Tum Harfler ve Tum Rakamlar   ==> [a-zA-Z0-9]
        6) Tum Noktalama İsaretleri      ==> \\p{Puncht}
        7) Tum Sesli Harfler             ==> [aeiouAEIOU]



       ^ ==> den farklı, haricinde

        1) Tum Rakamlar Haric                   ==> [^0-9]
        2) Tum Kucuk Harfler Haric              ==> [^a-z]
        3) Tum Buyuk Harfler Haric              ==> [^A-Z]
        4) Tum Harfler Haric                    ==> [^a-zA-Z]
        5) Tum Harfler ve Tum Rakamlar Haric    ==> [^a-zA-Z0-9]
        6) Tum Noktalama İsaretleri Haric       ==> [^\\p{Punct}]
        7) Tum Sesli Harfler Haric              ==> [^aeiouAEIOU]
             Bosluk haric                       ==> [^ ]

         */


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

        //Ex = t Strindeki tum rakamlari ve harfleri '!' e ceviriniz.

        String t2 =t.replaceAll("[a-zA-Z0-9]" ,"!");
        System.out.println("t2 = " + t2); //t2 = !!!!! !! !!$!!!!!!! !!!!!! !!! !!'!!!!.

        //Ex = t Strindeki spacelar dısındaki tum jarakterleri '+' ya ceviriniz.

        String t3 =t.replaceAll("[^ ]" ,"+");
        System.out.println("t3 = " + t3); //t3 = +++++ ++ ++++++++++ ++++++ +++ ++++++++

        //Ex = t Strindeki kucuk harfler dısındaki tum jarakterleri '?' ya ceviriniz.

        String t4 =t.replaceAll("[^a-z]" ,"?");
        System.out.println("t4 = " + t4); //t4 = ?ucel????ya?indadir?sandik?ama????mus??

        //Ex = t Strindeki tum sesli harfler disindaki karakterleri & 'ne donusturunuz

        String t5 =t.replaceAll("[^aeiouAEIOU]" ,"&");
        System.out.println("t5 = " + t5); //t5 = &u&e&&&&&&a&i&&a&i&&&a&&i&&a&a&&&&&u&&&





    }//main
}//class
