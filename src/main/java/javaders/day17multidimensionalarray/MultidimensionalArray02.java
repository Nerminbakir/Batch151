package javaders.day17multidimensionalarray;

import java.util.Arrays;

public class MultidimensionalArray02 {
    public static void main(String[] args) {

        //Example 1: Iki boyutlu bir array'i tek boyutlu bir array'e ceviriniz
        int numbers[][] = { {5, 4}, {2, 3, 2} }; // ==> { 5, 4, 2, 3, 2 }

        //1.Step: Iki boyutlu array'de kac eleman oldugunu dinamic olarak bulan kodu yazmaliyiz
        int toplamElemanSayisi = 0;

        for(int[] w : numbers){
            toplamElemanSayisi = toplamElemanSayisi + w.length;
        }
        //2.Step: Tek boyutlu array'i elde ettiğimiz eleman sayisini kullanarak olusturalim
        int newArr[] = new int[toplamElemanSayisi]; // [0, 0, 0, 0, 0]

        //3.Step: Iki boyutlu array'deki elemanlari tek boyutlu array'e transfer etmeliyim

        int idx = 0;

        for(int[] w : numbers){
            for(int k : w){
                newArr[idx] = k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(newArr));

        //Example 2: Bir integer multidimensional array'deki en kucuk ve en buyuk elemanin toplamini bulunuz.
        int ages[][] = { {15, 4}, {12, 43, 21} }; // ==> 4 + 43 = 47

        int small = ages[0][0];
        int big = ages[0][0];

        // { {15, 4}, {12, 43, 21} }

        for(int[] w : ages){

            for(int k : w){
                small = Math.min(small, k);
                big = Math.max(big, k);
            }
        }
        System.out.println(small + big);





    }

}
