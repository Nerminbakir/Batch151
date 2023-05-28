package practices.day16practices_inheritance_overriding;

public class Araba {
    /*
     Araba, Opel, Corsa adında farklı class'lar olusturunuz.
     Opel class'ı Araba class'ına baglı olacak
     Corsa class'ı Opel class'ına baglı olacak
     Araba class'ına genel bilgileri, varible ve method olarak yazınız.
     Opel class'ına gerekli bilgileri, variable ve method olarak yazınız.
     Corsa class'ına en spesifik bilgileri, variable ve method olarak yazınız.

     Corsa class'ından obje olusturarak variableları ve methodları yazdırınız.

     */

        protected String hareket = "Arabalar teker ile hareket eder."; // instance variable
        protected String hiz = "Arabalar motor gücüne göre hız yaparlar.";
        protected String yakit = "Arabalar farklı yakıtlar kullanabilir.";
        protected String marka = "Arabalar üretildikleri markaya sahiptir.";

        protected void motor(){
            System.out.println("ARABALAR FARKLI MARKALARDA MOTOR KULLANIRLAR.");
        }
        protected void yakitTuketimi(){
            System.out.println("ARABALAR MOTOR GÜCÜ VE YAKIT TÜRÜNE GÖRE YAKIT TÜKETİRLER.");
        }





}
