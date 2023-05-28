package javaders.day15loopsarreys;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        /*
        1) Array; Javanın aynı data type'inda coklu data depolamak için olusturdugu bie yapidir.
        2) Array'ler primitive data typeları veya reference'lar ile calısır.
        3) Array'ler "süper fast" dir ve memoryde cok az yer kaplarlar.
        */

        //Array nasıl olusturulur?
        String stdNames []= new String[5];

        //Array nasıl yazdırılır?
        System.out.println(Arrays.toString(stdNames));//[null, null, null, null, null] nullar Stringin default degerleridir.

        //Array'e nasıl eleman eklenir?
        stdNames[0] = "Ajda";
        stdNames[3] = "Cüneyt";
        stdNames[2] = "Kemal";
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";

        System.out.println(Arrays.toString(stdNames));//[Ajda, Ayhan, Kemal, Cüneyt, Filiz]

        // Array'deki spesifik bir elemanı nasıl alabiliriz?
        System.out.println(stdNames[3]);//Cüneyt

        //Example 1: stdNames array'indeki her ismin sonuna yildiz koyarak console'a yazdiriniz

        // 1 . Way

        for (int i=0; i<stdNames.length ; i++) {//length Stringlerde ()'li Array'lerde ()'siz kullanılır.
            System.out.println(stdNames[i] + "*");
        }

        // 2 . Way : for each loop ==> Enhanced (Zenginleştirilmiş) loop -  Mumkunse hep for each loop kullanırız.
        // for each loop Arrays'ler ve Collection'larla kullanılır.

        for (String w : stdNames) {
            System.out.println(w + "*");
        }


        // Example 1 = Bir integer array olusturunuz. 5 eleman ekleyiniz.
        //Elemanların toplamını bulup console'a yazdırınız.

        int ages []= new int[5];
        System.out.println(Arrays.toString(ages));//[0, 0, 0, 0, 0]

        ages [0]=12;
        ages [1]=23;
        ages [2]=9;
        ages [3]=38;
        ages [4]=27;

        System.out.println(Arrays.toString(ages));//[12, 23, 9, 38, 27]

        int sum = 0;

        for (int w : ages) {

            sum = sum + w;
            System.out.println(sum);//109
        }

        //Example 1 = Bir char array olusturunuz. 3 eleman ekleyiniz.
        //Elemanların carpımını bulup console'a yazdırınız.

        char initials []= new char[3];

        initials [0]='J'; // Ascii degerleri kullanır.
        initials [1]='P';
        initials [2]='A';

        System.out.println(Arrays.toString(initials));//[J, P, A]

        int carpim = 1; //1 carpmanın etkisiz elemanı old için 1 koyduk.

        for (char w : initials) {

            carpim = carpim * w;

        }
        System.out.println(carpim);//384800





    }//m
}//c
