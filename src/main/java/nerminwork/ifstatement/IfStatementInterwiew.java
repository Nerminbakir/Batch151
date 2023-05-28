package nerminwork.ifstatement;

public class IfStatementInterwiew {

    public static void main(String[] args) {

        //Interwiev Questions USA QA

        // String str = "abbccdc" tekrarsiz karakterleri ekrana yazdiriniz.

        /*abbccdc

                 indexOf ()                          lastIndexOf ()

       a ------     0                  =                  0     (tekrarsız)
       b ------     1                  =                  2
       c ------     3                  =                  6
       d ------     5                  =                  5     (tekrarsız)


            Tekrarsız old için a ve d yi yazdırıcaz

         */

        String str = "abbccdc";

       char ch = str.charAt(0);
       if(str.indexOf(ch) == str.lastIndexOf(ch)){

           System.out.println(ch);
       }//if body

        char ch1 = str.charAt(1);
        if(str.indexOf(ch1) == str.lastIndexOf(ch1)){

            System.out.println(ch1);
        }//if body

        char ch2 = str.charAt(2);
        if(str.indexOf(ch2) == str.lastIndexOf(ch2)){

            System.out.println(ch2);
        }//if body

        char ch3 = str.charAt(3);
        if(str.indexOf(ch3) == str.lastIndexOf(ch3)){

            System.out.println(ch3);
        }//if body

        char ch4 = str.charAt(4);
        if(str.indexOf(ch4) == str.lastIndexOf(ch4)){

            System.out.println(ch4);
        }//if body

        char ch5 = str.charAt(5);
        if(str.indexOf(ch5) == str.lastIndexOf(ch5)){

            System.out.println(ch5);
        }//if body

        char ch6 = str.charAt(6);
        if(str.indexOf(ch6) == str.lastIndexOf(ch6)){

            System.out.println(ch6);
        }//if body


        //  Consolda         a
        //                   d      yazdırır.

        // 2. YOL

//        String str = "abbccdc"; //a d
//        String s = "";
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//
//            if (str.indexOf(ch)==str.lastIndexOf(ch)){
//                if (!s.contains("" + ch)) {
//                    s = s + ch;
//                }
//            }
//        }
//        System.out.print(s);




    }//main
}//class
