package nerminwork.loops;

public class Loops01SHD {
    public static void main(String[] args) {

        // Ekrana 50 kere Nermin yazdırın.

        for (int i = 1; i < 51; i++) {
            System.out.println("Nermin" + " ");

        }


        //4'den 24'e kadar tum tamsayilari ayni satirda,
        // aralarina bosluk birakarak console'a yazdiriniz

        for (int i = 4; i < 25; i++) {
            System.out.print(i + " ");
        }


        System.out.println();
        //33'den 11'e kadar tum cift tamsayilari ayni satirda,
        // aralarina bosluk birakarak console'a yazdiriniz

        for (int i = 33; i > 10; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        //20'den 74'e kadar tum tek tamsayilari ayni satirda,
        // aralarina bosluk birakarak console'a yazdiriniz

        for (int i = 20; i < 75; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        //"Massachusetts" kelimesindeki tum sesli harfleri console'a yazdiriniz

        String s = "Massachusetts"; //Stringlerde index 0 dan baslar.

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                System.out.print(c + " ");
            }
        }

        System.out.println();









}//m
}//c
