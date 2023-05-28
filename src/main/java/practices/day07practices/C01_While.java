package practices.day07practices;

import java.util.Scanner;

public class C01_While {
    public static void main(String[] args) {

        // Kullanıcıdan sisteme bir rakam girmesini isteyiniz
        // kullanıcının girdigi sayının while loop kullanarak faktoriyelini bulunuz

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int rakam = scan.nextInt();

        int num = 1; // carpma işlemine 1'den baslayacagımız için

        int faktoriyel = 1; // carpma işleminin etkisiz elemanı 1dir.

        while (num<=rakam){

            faktoriyel = faktoriyel*num;
            num++;
        }

        System.out.println(rakam + "!= " + faktoriyel);





    }
}
