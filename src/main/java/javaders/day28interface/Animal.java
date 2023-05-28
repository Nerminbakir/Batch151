package javaders.day28interface;

public interface Animal {
    void eat();
    void drink();

    /*
     1) interface'lerdeki tum variable'lar otomatik (default-varsayılan) olarak "final"dir.
        Bu yuzden interface içindeki variable'ı olusturdugunuzda mutlaka deger ataması yapmalısınız.
        Bilindigi gibi final variable'ların degerleri degistirilemez.
     2) interface'lerdeki tum variable'lar otomatik (default-varsayılan) olarak "public"tir.
     3) interface'lerdeki tum variable'lar otomatik (default-varsayılan) olarak "static"tir.

     */

    int age = 4;


}
