package javaders.day15loopsarreys;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        /*
            1) Applicationlarda data ile bu dataları işleyen kodlar (logic) birbirinden ayrılır.
            Yani; logic dataya bagımlı olmamalıdır. dynamic olmalıdır.
            Dataya bagımlı olarak yazılan kodlara "hard kod" denir.
            Hard kod hatalı kod demektir.

            Asagıdaki grades arrayinde son elemanı almak için "4" veya grades.length-1 kullanılabilir.
            "4" kullanırsak arraye bir eleman eklendiğinde kodunuz yanlis cıktı verir ama
            length-1 kullanırsak hep dogru sonucu alırsınız.
         */

        //Array'leri kısa yoldan nasıl olusturabiliriz?

        int grades []={67, 98, 100, 34, 76};
        System.out.println(Arrays.toString(grades));// [67, 98, 100, 34, 76]

        // Example = grades array'indeki en küçük ve en buyuk grade'in toplamını ekrana yazdıran kodu yazdırınız.

        Arrays.sort(grades);
        System.out.println(Arrays.toString(grades));// [34, 67, 76, 98, 100]

        System.out.println(grades[0] + grades [grades.length-1]);//134

        // Example 2 = Size verilen bir String arraydeki isimlerden 5 characterden az character içerenleri console a yazdırınız.

        String stdNames[] = new String[5];
        stdNames[0] = "Ajda";
        stdNames[3] = "Cuneyt";
        stdNames[2] = "Tom";
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";

        for (String w : stdNames){
            if (w.length()<5){
                System.out.println(w);
            }
        }

        // Example 3 = Size verilen bir String arraydeki isimleri alfabetik sıraya koyduktan sonra F ile baslayan
        // isimlerden önceki isimleri console a yazdırınız.

        Arrays.sort(stdNames);//[Ajda, Ayhan, Cüneyt, Filiz, Tom]

        for (String w : stdNames){
            if (w.startsWith("F")){
                break;
            }
            System.out.println(w);
        }
        // Example 4 = Size verilen bir String arraydeki isimleri alfabetik sıraya koyduktan sonra F ile baslayan
        // isimlerden önceki isimleri ve F ile baslayanları console a yazdırınız.

        Arrays.sort(stdNames);//[Ajda, Ayhan, Cüneyt, Filiz, Tom]

        for (String w : stdNames){

            System.out.println(w);
            if (w.startsWith("F")){

                break;
            }

        }

        // Example 5 = Size verilen bir String arraydeki isimleri alfabetik sıraya koyduktan sonra F ile baslayan
        // isimler hariç diger isimleri console a yazdırınız.

        Arrays.sort(stdNames);  //sort () methodu numeric dataları kucukten buyuge dizer.(ascending)
                                // Stringleri ise alfabetik sıra ile dizer. (alphabetically)
                                // ascending + alphabetically ==> Natural Order
        for (String w : stdNames){
            if (w.startsWith("F")){
                continue;
            }else{
                System.out.println("w = " + w);
            }
        }




    }//m
}//c
