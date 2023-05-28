package practices.day16practices_inheritance_overriding;

public class Corsa extends Opel{

    protected String hiz = "Corsa max 200 km hız yapar."; // instance variable
    protected String yakit = "Corsa benzinli veya elektriklidir";
    protected String model = "Corsa";

    protected void motor(){
        System.out.println("CORSA ARABALAR ÇEVRECİ MOTOR KULLANIR");
    }
    protected void yakitTuketimi(){
        System.out.println("CORSA 5.6 LT YAKIT TÜKETİR");
    }
    protected void vitesSayisi(){
        System.out.println("CORSA 5 VİTESLİDİR");
    }

    public static void main(String[] args) {

        /*
            inheritance variable;
            Olusturdugumuz objenin data type'ı hangi Class'a aitse oradan baslayarak bakar.
            Yoksa Parent'ına gider.
            Ilk buldugu Class'tan alir.
         */
        /*
            Inheritance method;
            Olusturdugumuz objenin data type'i hangi Class'a ait ise oradan baslayarak bakar.
            Yoksa Parent'ina gider.
            Buldugu yerden hemen almaz. Override edilmi mi diye kontrol eder.
            (Constructor Class'ina kadar ayni isimde method var mi diye kontrol eder)
            Override edileni alir.
            en son nerede override edilmisse ordan alır.

         */

        Corsa arb1 = new Corsa();

        System.out.println(arb1.hareket); // Araba Class
        System.out.println(arb1.hiz); // Corsa Class
        System.out.println(arb1.yakit); // Corsa Class
        System.out.println(arb1.marka); // Opel Class
        System.out.println(arb1.sirketMerkezi); // Opel Class
        System.out.println(arb1.model); // Corsa Class

        arb1.motor(); // Corsa Class

        Opel arb2 = new Corsa();
        System.out.println(arb2.hareket); // Araba Class
        System.out.println(arb2.hiz); // Opel Class ==> kendi Class'ında hiz olmasına ragmen parent'ı olan Opel Class'ına gidip yazdırdı.
        System.out.println(arb2.yakit); // Araba Class
        System.out.println(arb2.marka); // Opel Class
        System.out.println(arb2.sirketMerkezi); // Opel Class
        // System.out.println(arb2.model); model variable'ı parent class'larda olmadıgından CTE verir.

        arb2.motor(); // Corsa Class
        arb2.garanti(); // Opel Class
        arb2.yakitTuketimi(); // Corsa Class
        // arb2.vitesSayisi(); vitesSayisi() methodu parent class'larda olmadıgından CTE verir.

        Araba arb3 = new Corsa();
        System.out.println(arb3.hareket); // Araba Class
        System.out.println(arb3.hiz); // Araba Class
        System.out.println(arb3.yakit); // Araba Class
        System.out.println(arb3.marka); // Araba Class
        // System.out.println(arb3.sirketMerkezi); (arb3.sirketMerkezi); variable'ı Araba class'ında olmadıgından CTE verir.
        // System.out.println(arb3.model); (arb3.model); variable'ı Araba class'ında olmadıgından CTE verir.
        arb3.motor(); // Corsa Class
        arb3.yakitTuketimi(); // Corsa Class
        // arb3.garanti(); garanti(); methodu parent class'larda olmadıgından CTE verir.
        // arb3.vitesSayisi(); vitesSayisi(); methodu parent class'larda olmadıgından CTE verir.
    }

    /*
    Variableyi Objeyi oluşturduğumuz Class'tan veya parent'ından, methodları parent'tan degil, constructor'ı' aldığımız Class'tan alır.
     */

    /*
        Object data type'i Opel classindan, Constructor ise Corsa(child) classindan olusturuldu.
        Objectimiz Opel classindan olustugu icin basta Opel classina gelip motor methodu var mi diye bakar.
        Opel classinda bu method olsa da hemen almaz onu. Once bu method child tarafindan override edilmis mi diye bakar. Orada override edildigini gorunce parent Opeldekini degil Corsa classindaki override edilen motor
        methodunu alip onu yazdirir. Eger Corsa class'inda motor methodu olmasaydi, o zaman Opel classindaki motor methodunu alir ve yazdirirdi.
        Corsa classinda motor methodu override edildigi icin bize Corsa classindaki degeri yazdiracak.
        "CORSA ARABALAR CEVRECI MOTOR KULLANIR"

     */


}
  /*
Inheritance variable;
Olusturdugumuz objenin data type'ı hangi Class'a aitse oradan baslayarak bakar.
Yoksa Parent'ına gider. Ilk buldugu Class'tan alir.
Inheritance method;
Olusturdugumuz objenin data type'i hangi Class'a ait ise oradan baslayarak bakar.
Yoksa Parent'ina gider.
Buldugu yerden hemen almaz. Override edilmi mi diye kontrol eder.
(Constructor Class'ina kadar ayni isimde method var mi diye kontrol eder)
Override edileni alir. en son nerede override edilmisse ordan alır.

         */