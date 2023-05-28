package javaders.day17multidimensionalarray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultidimensionalArray01 {

    public static void main(String[] args) {

        // Bir Array'in elemanları Array ise bu Array Multidimensional Array'dir.
        // Multidimensional Array nasıl olusturulur ?

        int a [][] = new int[3][2]; // [[5,12][81,45][123,0]]

        // Multidimensional Arraylere eleman nasıl eklenir ?

        a [0][0] = 5;
        a [1][1] = 45;
        a [2][0] = 123;
        a [0][1] = 12;
        a [1][0] = 81;
        a [2][1] = 0;

        // Multidimensional Arrayleri console'a yazdırmak için deepToString () kullanırız.

        System.out.println(Arrays.toString(a)); // [[I@19dfb72a, [I@17c68925, [I@7e0ea639]
        System.out.println(Arrays.deepToString(a)); // [[5, 12], [81, 45], [123, 0]]

        // Multidimensional Array içinden specific bir eleman nasıl yazdırılır ?

        System.out.println(a [1][1]); // 45

        // Multidimensional Array içindeki array nasıl yazdırılır ?

        System.out.println(Arrays.toString(a[0])); // [5, 12]
        System.out.println(Arrays.toString(a[1])); // [81, 45]
        System.out.println(Arrays.toString(a[2])); // [123, 0]

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



    }

}
