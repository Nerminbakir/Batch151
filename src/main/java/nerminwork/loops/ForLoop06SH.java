package nerminwork.loops;

import java.util.Scanner;

public class ForLoop06SH {
    public static void main(String[] args) {

        /*
        For Loop kullanarak asagıda verilen sekli olusturunuz.

                        *
                        **
                        ***
                        ****
                        *****

        */
        for (int s = 1; s <= 5; s++) {
            for (int y = 1; y <= s; y++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        /*For Loop kullanarak asagıda verilen sekli olusturunuz. Satır sayısını kullanıcıdan alınız.

         *
         * *
         * * *
         * * * *
         * * * * *
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Satır sayisi giriniz");
        int st = scan.nextInt();

        for (int i = 1; i <= st; i++) {//satırlar için loop
            //spaceler için loop
            for (int k = st - 1; k >= i; k--) {
                System.out.print(" ");
            }
            //* için loop
            for (int m = 1; m <= i; m++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        /*
        Satır sayısını kullanıcıdan alarak asagidaki sekli olusturunuz.
                    * * * * *
                     * * * *
                      * * *
                       * *
                        *

         */
        System.out.println("Lutfen satır sayisi giriniz");
        int str = scan.nextInt();

        for (int i = 0; i < str; i++) {//satırlar için loop

            //spaceler için loop
            for (int k = 0; k<i; k++) {
                System.out.print(" ");
            }
            //* için loop
            for (int m = 1; m <= str-i; m++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        /* Satır sayısını kullanıcıdan alarak asagidaki sekli olusturunuz.
                    *******
                     *****
                      ***
                       *


         */

        System.out.println("Lutfen satır sayisi giriniz");
        int a = scan.nextInt();

        for (int d = 0; d < a; d++) {//satırlar için loop

            //spaceler için loop
            for (int b = 0; b<d; b++) {
                System.out.print(" ");
            }
            //* için loop
            for (int c = 1; c <2*(a-d); c++) {
                System.out.print("*");
            }
            System.out.println();
        }




    }//

}//