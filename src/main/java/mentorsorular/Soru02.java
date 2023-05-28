package mentorsorular;

import java.util.Scanner;

public class Soru02 {
    public static void main(String[] args) {
        /*
        Soru-2: Kullanicidan 3 tane pozitif  tam sayi alniz. Bu uc sayinin ucgen olusturma durumunu kontrol ediniz
	        Eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz
	        INFO-->üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, herhangi iki kenar farkı diger kenardan büyük olmali
		          a+b>c>a-b
		          a+c>b>a-c
	              b+c>a>b-c
		          a=b=c ise es kenar ucgen
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("3 pozitif sayı giriniz");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if ((a+b>c && c>a-b) && (a+c>b && b>a-c) && (b+c>a && a>b-c)){
             if (a==b && b==c){
                System.out.println("Bu bir ucgen ve eskenar ucgendir");
            }else {
                 System.out.println("eskenar ucgen degildir");
        }
        }else {
            System.out.println("ucgen degildir.");
        }


    }
}
