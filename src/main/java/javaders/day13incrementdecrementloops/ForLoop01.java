package javaders.day13incrementdecrementloops;

import java.util.Scanner;

public class ForLoop01 {

    public static void main(String[] args) {

        // Ex = 21 den 180 e kadar hem 4 hemde 6 ile bolunebilen tamsayıları ekrana yazdıran kodu yazınız.

        for (int i = 21;i<181;i++){

            if(i%4==0 && i%6==0){
                System.out.print(i+ " ");//24 36 48 60 72 84 96 108 120 132 144 156 168 180
            }
        }
        System.out.println();

        // Ex = Size verilen kucuk harfle yazılmıs String'in indexi cift sayı olan karakterlerini
        //buyuk harfe donusturunuz. ankara ==>AKR

        // Bir String'de son index her zaman length()-1 dir.
        // Note = Yazdıgımız kod belli senaryolar için calısıyor ancak tum senaryolar için calısmıyorsa
        // bu tarz koda = hard kod denir ve mutlaka duzeltilmelidir.

        String s = "ankara";
                        //i<=length()-1
        for (int i =0; i<s.length() ;i++){
           String ch = s.substring(i,i+1);
           if(i%2==0){
               System.out.print(ch.toUpperCase());
            }
        }



    }//m
}//c
