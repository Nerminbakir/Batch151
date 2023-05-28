package javaders.day13incrementdecrementloops;

public class ForLoop02 {
    public static void main(String[] args) {

        //Ex = Verilen bir Stringde ilk 'a' harfinden önceki tum karakterleri consola yazdırınız.
        // "I love Java"        == "I love J"

        String s = "I love Java";

        for (int i = 0; i<s.length();i++){

                if (s.charAt(i)=='a'){
                break;
            }
                System.out.print(s.charAt(i));//I love J

        }
        System.out.println();
       /* for (int i = 0; i<s.length();i++){
            char ch = s.charAt(i);

            if (ch=='a'){
                break;
            }
            System.out.print(ch);

        }

        */

        // Ex = Verilen bir Stringde son 'a' dan sonraki tum characterleri
        // ters sırada yazdırınız. Germany == yn

        String t = "Germany";
        for (int i = t.length()-1; i>=0 ; i--){

            if (t.charAt(i)=='a'){
               break;
            }
            System.out.print(t.charAt(i));//yn
        }



        /*
            for (int i =t.length()-1 ; i >=0 ;   i-- ) {
            char ch = t.charAt(i);
            if(ch=='a'){
                break;
            }
            System.out.print(ch);
        }

         */


    }//m
}//c
