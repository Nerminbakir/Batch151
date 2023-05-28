package nerminwork.stringmanipulations;

import java.util.Scanner;

public class StringMan {


    public static void main(String[] args) {

        /*
            Kullanicidan email adresini girmesini isteyin,
            Asagidaki kurallara gore kullanicinin
            girdigi email adresini kontrol ediniz.

               i)mail adresi "@gmail" icermeli
               ii)Space characteri mail'de olmamali
               iii)mail adresinde buyuk harf olmamali
               iv)En az bir tane noktalama isareti bulunmali
     */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen mail adresinizi  \n" +
                " i)mail adresi \"@gmail\" icermeli\n" +
                " ii)Space characteri mail'de olmamali\n" +
                "iii)mail adresinde buyuk harf olmamali\n" +
                " iv)En az bir tane noktalama isareti bulunmali \n seklinde veriniz");

        String mail= input.nextLine();
        //    i)mail adresi "@gmail" icermeli
        boolean first =mail.contains("@gmail");
        System.out.println("@gmail = " + first);

        // ii)Space characteri mail'de olmamali
        boolean second = !mail.contains(" ");
        System.out.println("space = " + second);

        //iii)mail adresinde buyuk harf olmamali
        boolean third = !mail.contains("[A-Z]");
        System.out.println("third = " + third);

       /* Contaıns methodu regex karakterlerle dogru bir seklde calismaz.
        Bu nedenle replaceAll ya da replace ile silme yapip geriye kalanlarin length ()'ne bakilir.
        banu@gmail.com */

        //iii)mail adresinde buyuk harf olmamali



    }//main

}//class

