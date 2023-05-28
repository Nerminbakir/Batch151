package javaders.day32maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap03 {
    public static void main(String[] args) {

        // Example 1: Type code to print the number of occurrences of words in a sentence
        // Verilen cumledeki kelimelerin sayısını veren kodu yazınız. (Interview Question)
        // "I like to move it, move it do you like it?"  => I=1, like=2, to=1, move=2, it=3, do=1, you=1
        // "I like you, like like!" => I=1, like=3, you=1

        String s = "I like you you, like like!";
        System.out.println(s); // I like you, like like!

        // like ile like! aynı yapabilmek için tüm noktalama isaretlerini silelim
        s = s.replaceAll("\\p{Punct}", "");
        System.out.println(s); // I like you like like

        // Kelimelerle calısmalıyım. Bu yuzden split(" ") kullanmalıyım. split() methodu Array'ler ile calıstıgı için her elemanı Array'in içine koyar.
        String words [] = s.split(" ");
        System.out.println(Arrays.toString(words)); // [I, like, you, like, like]

        HashMap<String, Integer> occ = new HashMap<>();

        //"words" arrayindeki kelimeler birer birer Map'de var mi yok mu diye kontrol edilecek.
        //"words" arrayindeki kelimeler Map'de yoksa Map'e value'su 1 olarak yerlestirilecek.
        //"words" arrayindeki kelimeler Map'de varsa Map'e varolan value'u 1 artirilarak yerlestirilecek.

        for (String w : words) {

          Integer numOfOccurence = occ.get(w);

          if(numOfOccurence==null){
              occ.put(w,1);
          }else{
              occ.replace(w, numOfOccurence + 1);
          }
        }
        System.out.println(occ); // {like=3, I=1, you=2}

        System.out.println("------------------------------------");

        String str = "I like to move it, move it do you like it?";  // => I=1, like=2, to=1, move=2, it=3, do=1, you=1

        str = str.replaceAll("\\p{Punct}" , "");
        System.out.println(str); // I like to move it move it do you like it

        String [] yeniStr = str.split(" ");
        System.out.println(Arrays.toString(yeniStr)); // [I, like, to, move, it, move, it, do, you, like, it]

        HashMap < String, Integer> gorunum = new HashMap<>();

        for (String w : yeniStr) {
            Integer grnm = gorunum.get(w);

            if (grnm==null){
                gorunum.put(w,1);
            }else{
                gorunum.replace(w, grnm+1);
            }
        }

        System.out.println(gorunum); // {move=2, like=2, I=1, to=1, it=3, do=1, you=1}













    }
}
