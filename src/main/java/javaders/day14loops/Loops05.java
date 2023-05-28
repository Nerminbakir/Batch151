package javaders.day14loops;

public class Loops05 {

    public static void main(String[] args) {

        //Verilen bir String'de kucuk harfleri console'a yazmayiniz
        //"Pwd12?Ab" ==> P12?A

        String s = "Pwd12?Ab";

        for (int i = 0; i <s.length(); i++) {
            char ch = s.charAt(i);
            if (ch>= 'a' && ch<='z'){
                continue;
            }else{
                System.out.print(ch);
            }
        }

        System.out.println();

        // break ile continue arasındaki fark nedir?
        // break swich'in dısına cıkmak için loopu kırmak için kullanılır.
        // continue ise loop calısırken bazı elemanları işleme sokmamak için kullanılır.


        // Bir String'i ters ceviren kodu yazınız.
        // "Java" ==> avaJ

        //1. Yol

        String t = "Java";
        String ters = "";

        for (int i = t.length()-1; i >=0; i--) {
            ters = ters + t.substring(i,i+1);

        }
        System.out.println(ters);

        //2. Yol

        String u = "Java";
        String ters2 = "";

        for (int i = u.length()-1; i >=0; i--) {
            ters2 = ters2 + u.charAt(i);

        }
        System.out.println(ters2);


        //Bir tamsayinin rakamlarinin toplamini veren kodu yaziniz
        //578 ==>5+7+8=20

        int sum =0;

        int num= -578;
        num = Math.abs(num); //negatif sayılarda mutlak degere aldıktan sonra devam ederiz.

        for (int i = num; i>0 ; i=i/10) {
            sum = sum + i%10;

        }
        System.out.println(sum);//20


    }//m
}//c
