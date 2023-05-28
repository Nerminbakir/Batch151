package javaders.day31collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Sets02 {
    public static void main(String[] args) {

        //Example 1: Ogrenci email adreslerini natural order'da siralanmis olarak depolayiniz.

        //1. yol treeSet cok yavas oldugu için bu yöntemi kullanmak yerine 2. yolu kullanırız

        long t1 = System.nanoTime();

        TreeSet <String> emails = new TreeSet<>(); // natural order dedigi için treeset kullandık
        emails.add("a@gmail.com");
        emails.add("t@gmail.com");
        emails.add("g@gmail.com");
        emails.add("x@gmail.com");
        emails.add("n@gmail.com");
        emails.add("b@gmail.com");
        emails.add("c@gmail.com");

        System.out.println(emails); //[a@gmail.com, b@gmail.com, c@gmail.com, g@gmail.com, n@gmail.com, t@gmail.com, x@gmail.com]

        long t2 = System.nanoTime();

        //2. yol recommended; cuvalın içine attık

        HashSet<String> emailHs = new HashSet<>();

        emailHs.add("a@gmail.com");
        emailHs.add("t@gmail.com");
        emailHs.add("g@gmail.com");
        emailHs.add("x@gmail.com");
        emailHs.add("n@gmail.com");
        emailHs.add("b@gmail.com");
        emailHs.add("c@gmail.com");

        TreeSet <String> emailTs = new TreeSet<>(emailHs);
        System.out.println(emailTs); // [a@gmail.com, b@gmail.com, c@gmail.com, g@gmail.com, n@gmail.com, t@gmail.com, x@gmail.com]

        long t3 = System.nanoTime();

        System.out.println(t2-t1); //treeSet 1417500
        System.out.println(t3-t2); //hashSet 153300

        // Farkı; 2. yol daha hızlı calısır.



    }
}
