package nerminwork.loops;

import java.util.Scanner;

public class WhileLoop02SH {
    public static void main(String[] args) {

        //Kullanıcıdan bir sayı alınız. Bu sayi için carpım tablosunu olusturunuz.

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int a = input.nextInt();

        int b = 1;

        while (b<11) {
            System.out.println(a + "x" + b + "=" + (a*b));

            b++;
        }


    }
}
