package javaders.day25varargsinheritance;

public class Vehicle {
        /*
        1) Javada Object Class tum Java Class'larının ortak parentidir.
        2) Javada Object Class haric tüm Class'ların parent'i vardır.
        3) Javada Parent'tan child'a olan iliskilere HAS A RELATIONSHIP denir.
           Javada child'dan Parent'a olan iliskilere IS A RELATIONSHIP denir.
        4) Javada her class'ın bir tane default constructor'ı vardır.
           Bu default constructor classın içinde görünmez.
           Cünkü default constructor Object Class'ın içindedir.
        5) Child classtan bir object olusturdugumuzda constructorlar en ustteki
           parent classtan baslatılarak alta dogru calıstırılır.
        6) Child Class'daki constructordan parent classdaki constructor a gidebilmek için
           super () kullanılır.
        7) Parent Class'ta birden fazla constructor varsa istenilen constructor super()
           ifadesinin içine yazılan parametreler yardımı ile secilebilir.
        8) Aynı class içindeki constructorları secmek için this() kullanılır.
           Aynı classta birden fazla constructor varsa istenilen constructor this ()
           parantezinin içine yazılan parametreler yardımı ile secilebilir.
        9) super() ifadesini yazmak istege baglıdır. Siz yazmasanızda java sanki super()
           varmıs gibi davranır. Ama kodumuzu daha okunur kılmak için yazmanız tavsiye edilir.
        10) super() ve this() ifadeleri constructor icinde her zaman ilk satirda olmalidir
        11) Bir constructor icinde super() ve this() ifadeleri sadece bir kere kullanilabilir
           bakiniz 10. madde
        12) Inheritance'da variable'ları ve methodları cagırmak için this veya super kullanılır.
            this ==> kendi classından
            super ==> parent classından variable ya da method cagırmayı saglar.
        */

    public Vehicle(){
        this(5);
        System.out.println("Vehicle 1");
    }//constructor

     // "super();" default oldugu için biz görmüyoruz. Beni parent'taki constructora götür diyor. parent class'daki variable'lari cagirmaya yarar

    public Vehicle(int price){

        System.out.println("Vehicle int parametreli");
    }



}
