package nerminwork.loops;

import java.util.Scanner;

public class DoWhileLoop02 {
    public static void main(String[] args) {

        /*
        Kullanıcıdan bir String alın.
        Bu String'in içinde kac tane harf, kac tane rakam, kac tane harf ve rakam dısı
        karakter oldugunu gösteren programı yazınız.
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir String giriniz");
        String s = scan.nextLine().toLowerCase();

        int harfCounter = 0;
        int rakamCounter = 0;
        int digerCounter = 0;
        int k = 0;

        do {
            if (s.charAt(k) >= 'a' && s.charAt(k) <= 'z') {
                harfCounter++;
            } else if (s.charAt(k) >= '0' && s.charAt(k) <= '9'){
                rakamCounter++;
        }else {
                digerCounter++;
            }
            k++;
        }while (k<s.length());

        System.out.println("Harf Sayısı : " + harfCounter);
        System.out.println("Rakam Sayısı : " + rakamCounter);
        System.out.println("Diger Karakter Sayısı : " + digerCounter);














    }
}
