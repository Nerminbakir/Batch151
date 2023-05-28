package nerminwork.cesitli;

import java.util.Arrays;

public class MultiDimensionalArraySHD {
    public static void main(String[] args) {

        // Bir arrayin elemanları da array olursa bu tarz elemanlara MultiDimensional Array denir.

        // MultiDimensional Array nasıl oluşturulur?

        String names [][] = new String[3][2]; // [[null, null], [null, null], [null, null]]

        names [1][0] = "P";
        names [2][1] = "Z";
        names [0][0] = "A";
        names [0][1] = "K";
        names [1][1] = "M";
        names [2][0] = "C";

        // MultiDimensional Arrayleri console'a yazdırmak için toString () methodu degil, deepToString () methodu kullanılır.

        System.out.println(Arrays.deepToString(names)); // [[A, K], [P, M], [C, Z]]

        // MultiDimensional Array içinden spesific bir eleman nasıl yazdırılır?

        System.out.println(names [1][1]); // M

        // Multidimensional Array içindeki bir array nasıl yazdırılır ?

        System.out.println(Arrays.toString(names [0])); // [A, K]
        System.out.println(Arrays.toString(names [1])); // [P, M]
        System.out.println(Arrays.toString(names [2])); // [C, Z]

        // Kısa yoldan Multidimensional Array nasıl olusturulur ?

        String students [][] = {{"Ali", "Kemal"}, {"Cemal"}, {"Ayhan", "Beyhan", "Seyhan"}, {"Ceyhan", "Kayahan"}};

        //Example 1: Yukaridaki students array'inde toplam kac isim oldugunu bulunuz.

        int sum = 0;

        for ( String [] w : students) {

            sum = sum + w.length;

        }
        System.out.println(sum); // 8

        // Example 2: Yukaridaki students array'inde icinde "m" olan isimleri console'a yazdiriniz
        // {{"Kemal"}, {"Cemal"}};

        for ( String [] w : students ) {
            for ( String k: w ) {

                if (k.contains("m")){
                    System.out.println(k);
                }
            }
        }

        // Example 3: Bir integer Multidimensional Array olusturunuz. Tum elemanların carpımını yazdırınız.

        int nums[][] = { {5, 4}, {2, 3, 2}, {7}};

        int result = 1;

        for (int [] w : nums ) {

            for (int k : w){

                result = result*k;
            }
        }
        System.out.println(result); //1680

        //Example 4: Iki boyutlu bir array'i tek boyutlu bir array'e ceviriniz
        int numbers[][] = { {5, 4}, {2, 3, 2} }; // ==> { 5, 4, 2, 3, 2 }

        //1.Step: Iki boyutlu array'de kac eleman oldugunu bulan kodu yazmaliyiz
        int toplamElemanSayisi = 0;

        for(int[] w : numbers){
            toplamElemanSayisi = toplamElemanSayisi + w.length;
        }
        //2.Step: Tek boyutlu array'i iki boyutlu array'in eleman sayisini kullanarak olusturmaliyiz
        int newArr[] = new int[toplamElemanSayisi];

        //3.Step: Iki boyutlu array'deki elemanlari tek boyutlu array'e transfer etmeliyim
        int idx = 0;


        for(int[] w : numbers){
            for(int k : w){
                newArr[idx] = k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(newArr));

        //Example 5: Bir integer multidimensional array'deki en kucuk ve en buyuk elemanin toplamini bulunuz.
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
