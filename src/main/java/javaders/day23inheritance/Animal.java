package javaders.day23inheritance;

public class Animal {
    /*
    1) eat () methodu gibi bir cok class'ın kullanması gereken methodları her class'a ayrı ayrı yazarsak;
        i) Tekrar yapmıs oluruz, tekrar ideal code'da olmamalıdır.
        ii) Aynı method'u tekrar tekrar yazmak zaman kaybıdır.
        iii) Tekrar tekrar yazılan methodun tamiri cok zaman alır.
        iv) Tekrar tekrar yazılan methodun geliştirilmesi cok zaman alır.
        v) Methodu tekrar tekrar yazmak "atomic yapı"ya terstir.
    2) private class member'lar child class'lar tarafından kullanılamaz.
       public class'lar child class'lar tarafından kullanılabilir.
       default class member'lar aynı package'de child class'lar tarafından kullanılabilir.
       protected class member'lar farklı package'de de olsalar child class'lar tarafından kullanılabilir.
    3) Javada bie class'ın sadece 1 tane parent'ı olabilir.
       Coklu parent'a "multiple inheritance" denir. Tekli parent'a "single inheritance" denir.
       Java "multiple inheritance"ı desteklemez. Java "single inheritance" kullanılır.
    4) Apartman seklindeki inheritance yapısına "multilevel inheritance" denir.
        Java "multilevel inheritance"i destekler.

       */
    protected void eat(){
        System.out.println("Animals eat...");

    }

    public void drink(){
        System.out.println("Animals drink...");
    }



}
