package practices.day07practices;

import java.util.Arrays;
import java.util.Scanner;

public class C03_Array {
    public static void main(String[] args) {

            // Kullanıcıdan 4 tane rakam sisteme girmesini isteyiniz
            // ve bu rakamları bir array'e esayn ediniz. Olusturdugunuz array'i yazdırınız
            // Array'in icindeki elemanların ortalamasını bulunuz. Ortalamayı yazdırınız
            // Ortalamadan daha buyuk olan array elemanlarını yazdırınız
            Scanner scan = new Scanner(System.in);
            int arr[]=new int[4];
            for (int i = 0; i <4 ; i++) { // kullanıcıdan 4 tane rakam alacagımız icin 0'dan 4'e kadar for dongusune aldık
                System.out.println("Bir Rakam Giriniz");
                int rakam = scan.nextInt();
                arr[i]=rakam;  // kullanıcıdan aldıgımız her rakamı sırasıyla arr'e esayn ettik
            }
            System.out.println(Arrays.toString(arr));
            // Array'in icindeki elemanların ortalamasını bulunuz. Ortalamayı yazdırınız
            double toplam = 0;
            for (int each:arr) {
                toplam=toplam+each;
            }
            double ortalama = toplam/arr.length;
            System.out.println(ortalama);
            // Ortalamadan daha buyuk olan array elemanlarını yazdırınız
            for (int each:arr) {
                if(each>ortalama){
                    System.out.println(each + " ");
                }
            }

        }
}
