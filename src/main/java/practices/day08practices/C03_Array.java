package practices.day08practices;

public class C03_Array {
    public static void main(String[] args) {

    /*
      Aşağıdaki multi dimensional array'lerin iç array'lerinde aynı indexe sahip elamanların
      toplamını yazdıran bir program yazın.

      int arr1[][] = {{1,2},{3,4,5}};
      int arr2[][] = {{7,8,9},{10,11},{12}};
     */
        int arr1[][] = {{1,2},{3,4,5}};
        int arr2[][] = {{7,8,9},{10,11},{12}};

        int sinir = 0;
        int toplam = 0;

        for (int i = 0; i < arr1.length; i++) { // dıstaki arraylerin kısa olanının sayısınca donguye alıyoruz.
        if (arr1[i].length<arr2[i].length){ // arr1'in i. indexindeki dıs arrayin eleman uzunlugu ile
                                            // arr2'nin i. indexinin dıs arrayin eleman uzunlugunu karsılastırdık.

            sinir = arr1[i].length;

        }else{
            sinir = arr2[i].length;
        }

            for (int j = 0; j < sinir; j++) {
                toplam = arr1[i][j] + arr2[i][j];
                System.out.println(i + ","+j+"indexindeki elemanların toplamı " + toplam);
            }
   }



        /*
        int arr1[][] = {{1,2},{3,4,5}};
        int arr2[][] = {{7,8,9},{10,11},{12}};

        int[][] result = new int[Math.max(arr1.length, arr2.length)][];

        for (int i = 0; i < result.length; i++) {
            int[] subArr1 = i < arr1.length ? arr1[i] : new int[0];
            int[] subArr2 = i < arr2.length ? arr2[i] : new int[0];

            int[] subResult = new int[Math.max(subArr1.length, subArr2.length)];
            for (int j = 0; j < subResult.length; j++) {
                int num1 = j < subArr1.length ? subArr1[j] : 0;
                int num2 = j < subArr2.length ? subArr2[j] : 0;

                subResult[j] = num1 + num2;
            }

            result[i] = subResult;
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

         */


















        }
}
