package practices.day05practices;

import java.util.Scanner;

public class C01_cdenoncekia {

    public static void main(String[] args) {
     /*
        Kullanıcıdan aldığınız 'c' ve 'a' iceren bir String değer içerisindeki
        'c' karakterinden önceki 'a' karakterlerinin sayısını bulan bir kod yazınız.
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 'c' ve 'a' harflerini içeren bir kelime giriniz");
        String str = scan.nextLine().toLowerCase();

        int counter = 0; // default deger sonucu degiştirmeyen degerdir.

        //Toplama ve cikarma islemlerinde default deger sifirdir.(0)
        //Carpma ya da bolme islemlerinde default deger birdir (1)
        //String datalar icin ""; (hiclik)

        // 1.YOL

        for (int i = 0; i < str.indexOf("c") ; i++) {
            if (str.charAt(i)=='a'){
                counter++;
            }//if body
        }//for body

        System.out.println("c'den önce " + counter + " a vardır");

        // 2.YOL
        int sayac = 0;
        if(str.contains("c") && str.contains("a")){

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i)=='a'){
                    sayac++;
                }else if (str.charAt(i)=='c'){
                    break;
                }//else if
            }//for loop

            System.out.println("c'den önceki a sayısı " + sayac);

        }else{
            System.out.println("Lutfen 'c' ve 'a' harflerini içeren bir kelime giriniz");
        }


    }
}
