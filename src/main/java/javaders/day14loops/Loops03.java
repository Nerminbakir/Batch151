package javaders.day14loops;

import java.util.Scanner;

public class Loops03 {
    public static void main(String[] args) {

        //while loop

        int i = 1;

        while (i<1){// while loopta loop bodysinin hiç çalısmaması mumkundur.(Zero execution is possible)

            System.out.println("while loop");

            i++;
        }

        //***********   do-while loop    **************

        //önce calısır sonra dusunur..while loop ;trafikte önce ısıklara bak sonra gec. do while loop atm ye kart girişi password girişi sonrası işlem yapmamız gibi.
        int k=1;

        do{//do while loopta loop bodysi en az bir kere calısır.
            System.out.println("do-while loop");
            k++;
        }while (k<1);


        // Kullanıcı bir sayı girsin. Sayı 100 den kucuk ise kullanıcı "Kazandınız" mesajı alsın.
        // Diger durumlarda "Kaybettiniz" mesajı alsın.

        Scanner input = new Scanner(System.in);

        do{
            System.out.println("Please enter an integer");
            int n = input.nextInt();
            if (n<100){
                System.out.println("Won!");
            }else{
                System.out.println("Lost!");
                break;
            }
        }while (true);


        // Kullanıcıdan alınan bir cümlenin buyuk harf ile baslayıp
        // nokta ile bittigini kontrol eden kodu yazınız.

                do{

                System.out.println("Please enter a word");
                String s = input.next();

                if(s.endsWith(".") && (s.charAt(0)>='A' && s.charAt(0)<='Z')){
                    System.out.println("Your sentence is correct grammatically");
                }else{
                    System.out.println("Your sentence has grammatical mistake");
                    break;
                }

            }while(true);






    }//m
}//c
