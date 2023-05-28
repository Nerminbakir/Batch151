package practices.day09practices;

import java.util.Arrays;
import java.util.Scanner;

public class C03_MethodCreation {

    public static void main(String[] args) {

   /*
        kullanıcıdan bir cumle sisteme girmesini isteyiniz.
        method olusturarak cumlede gecen sesli harfleri konsola yazdırınız
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle = scan.nextLine();

        String arr [] = cumle.split(""); // cumle String old için parcalara ayırsak bile String kalmaya devam eder. char olmaz.
        System.out.println(Arrays.toString(arr)); // [j, a, v, a,  , i, l, e,  , h, a, y, a, t,  , g, u, z, e, l]


        sesliharfleriyazdir(arr); // method call

    }

    public static void sesliharfleriyazdir(String[] arr) { // array elemanları sesli harf mi kontrol ettik
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equalsIgnoreCase("a")
            || arr[i].equalsIgnoreCase("e")
            || arr[i].equalsIgnoreCase("i")
            || arr[i].equalsIgnoreCase("o")
            || arr[i].equalsIgnoreCase("u")){
                System.out.print(arr[i]); //aaieaaue
            }
        }
    }
}
