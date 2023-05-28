package nerminwork.ifstatement;

import java.util.Scanner;

public class IfStatement04SH {
    public static void main(String[] args) {

        /*
        Kulanicidan bir tamsayi alin ve o tamsayinin mutlak degerini
        ekrana yazdırın.
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir integer sayi giriniz");
        int a = scan.nextInt();

        if (a>=0){
            System.out.println(a);
        }else {
            System.out.println(-a);
        }








    }//main

}//class
