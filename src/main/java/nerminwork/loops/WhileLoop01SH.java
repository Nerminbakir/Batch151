package nerminwork.loops;

public class WhileLoop01SH {
    public static void main(String[] args) {

        // for loop kullanarak 1'den 5'e kadar tamsayıları ekrana yazdırınız.

        for (int i = 1; i < 5; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        // 2 .yol

        int i = 1;

        while (i < 5) {
            System.out.print(i + " ");
            i++;
        }

        // while-loop kullanarak 10'dan kucuk sayma sayılarını aynı satırda aralarına bosluk bırakarak yazınız.

        int s = 1;

        while (s < 10) {
            System.out.print(s + " ");
            s++;
        }

        System.out.println();
        // while-loop kullanarak 50'dan kucuk cift sayma sayılarını aynı satırda aralarına bosluk bırakarak yazınız.

        int n = 1;
        while (n < 50) {
            if (n % 2 == 0)
                System.out.print(n + " ");
            n++;
        }
        System.out.println();

        // while-loop kullanarak Java kolaydır Stringini tersten yazdırınız.

        String s1 = "Java Kolaydir";
        int m = s1.length()-1;
        while  (m>=0) {
            System.out.print(s1.charAt(m));
            m--;
        }


        }
    }
