package javaders.day12switchloops;

public class Loops01 {
    public static void main(String[] args) {

    //Ex = Ekrana 5 kere "Hi" yazdırınız.

        //1.Yol (tavsiye edilmez)

        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        /*
        Code Standarts
        1) Tekrarlar olmamalıdır. (Repetition)
        2) Dynamic olmalıdır.
        3) Tamir (Fix) ve update kolay yapılabilmelidir.
        */

        //2. Yol

        /*
        Aynı adımlar tekrar tekrar yapılması gerektiğinde "Loop"lar kullanılır.
        4 cesittir.
        1)for-loop  2)while-loop    3)do-while loop     4)for-each loop
         */

        //1) *******************   for loop   ********************

        /*

        for (Baslangıc Degeri  ; Loop Calısma sarti   ;  Arttırma / Eksiltme){
            calısacak kodlar
        }
        */
        //Baslangıc Degeri  ; Loop Calısma sarti   ;  Arttırma / Eksiltme
        for (   int i = 1   ;   i<6                ;         i++              ){
            System.out.println("Hi");
        }

        // Ex = 11 den 14 e kadar tum sayıları ekrana yazdırınız.

        for (int i = 11;i<15;i++){
            System.out.println(i);
        }

        // Ex = 40 tan 23 kadar tum cift sayıları ekrana yazdırınız.

        for (int i = 40; i>22; i--){
            if (i%2==0){
                System.out.println(i);
            }

        }
        // Ex = 18 tan 56 kadar tum tek sayıları ekrana yazdırınız.

        for (int i = 18; i<57 ; i++){
            if (i%2!=0){
                System.out.print(i+ " ");
            }

        }



    }//main
}//class
