package javaders.day14loops;

import java.util.Scanner;

public class Loops02 {
    public static void main(String[] args) {


        //3ten 8 e kadar tum sayıları consola yazdıran kodu yazınız.

        //1.Way

        for (int i = 3; i < 9; i++) {
            System.out.print(i + " ");

        }
        System.out.println();

        //2.Way

        int i = 3;

        while (i < 9){

            System.out.print(i + " ");

            i++;

        }
        System.out.println();

        // Ex = 21 den 180 e kadar hem 4 hemde 6 ile bolunebilen tamsayıları ekrana yazdıran kodu yazınız.

        //1.Way

        for (int k = 21;k<181;k++){

            if(k%4==0 && k%6==0){
                System.out.print(k+ " ");//24 36 48 60 72 84 96 108 120 132 144 156 168 180
            }
        }

        System.out.println();

        //2.Way

        int k = 21;

        while (k<181){

            if(k%4==0 && k%6==0){
                System.out.print(k+ " ");//24 36 48 60 72 84 96 108 120 132 144 156 168 180
            }
            k++;
        }

        System.out.println();

        //Size verilen kucuk harfle yazilmis String'in index'i cift sayi olan character'lerini buyuk harfe donusturunuz
        //miami ==> MiAmI
        String s = "miami";
        int m=0;

        while(m<s.length()){

            String ch = s.substring(m,m+1);

            if(m%2==0){
                System.out.print(ch.toUpperCase());
            }else{
                System.out.print(ch);
            }
            m++;//Bu kismi unutmayin yoksa "infinite loop" olusur. Yani; "sonsuz loop" olusur.
            // "sonsuz loop"lar application'in donmasina sebep olur.
        }

        System.out.println();

        //Size verilen tamsayinin rakamlari toplamini console'a yazdiran kodu yaziniz.
        int r = -578;
        r = Math.abs(r);

        int sum = 0;

        while(r>0){
            sum = sum + r%10;
            r=r/10;
        }
        System.out.println(sum);

        //Kullanıcıdan aldıgınız sayı için carpım tablosu oluşturan kodu yazınız.
        // 3*1=3     3*2=6   3*3=9 ......3*10=30

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = input.nextInt();

        int u = 1;

        while (u<11) {
            System.out.println(n + "x" + u + "=" + (n*u));

            u++;
        }

        System.out.println();

        //Kullanıcıdan aldıgınız Stringteki sessiz harfleri console'a yazdıran kodu yazınız.
        //Alabama ==> lbm

        System.out.println("Please enter a word");
        String y= input.next();

        int z =0;

        while (z<y.length()){

           char ch = y.charAt(z);

           boolean x = ch=='a' || ch == 'e' || ch=='o' || ch=='u' ||ch=='A' || ch == 'E' || ch=='O' || ch=='U';

            if (!x) {
              System.out.print(ch);
           }
           z++;
        }


    }//m
}//c
