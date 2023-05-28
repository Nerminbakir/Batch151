package mentorsorular;

import java.util.Scanner;

public class Soru15ve16 {
    public static void main(String[] args) {

        /*
        Soru-15:Katsayıları verilen 2 bilinmeyenli denklemin kökleriniz bulunuz.
                ax^2 + bx + c;
                Çözüm adımları-->kullanıcıdan a,b,c yi okutun.
                Delta = bb - 4ac
                Delta > 0 => 2 tane kök vardır x1=(-b + kök(d)) / (2a)  , x2= (-b - kök(d)) / (2*a)
                Delta = 0 => 1 tane kök vardır x = -b/2a
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("3 adet sayı giriniz");
        int a = scan.nextInt(); //1             1
        int b = scan.nextInt(); // -3           -2
        int c = scan.nextInt(); // -4           1

        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("Girdiğiniz denklemin iki tane kökü vardır\nx1= " + x1 + " x2= " + x2);

        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Girdiğiniz denklemin 1 tane kökü vardır\nx= " + x);
        } else {
            System.out.println("Girdiğiniz denklemin kökü yoktur");
        }


        }

    }

