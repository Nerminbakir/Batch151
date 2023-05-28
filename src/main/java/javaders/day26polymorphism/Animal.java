package javaders.day26polymorphism;

public class Animal {

    /*
        1) Parent Classdaki methodu Child Class içinde özellestirerek kullanmaya overriding denir.
        2) Overriding de methodun parantezine ve methodun ismine dokunulmaz. (method signature)
        3) private methodlar override edilemezler.
        4) Child classtaki methodun access modifieri parent tan daha dar olamaz.
        5) Child Class'ta override edilen methodun return type'i ile Parenttaki methodun return type'i arasında
           "İS A" ilişkisi varsa return type degistirilebilir.
        6) Methodun return type'i primitive ise Overriding yaparken primitive type degistirilemez. Cunku return type
           ya ayni olur yada parent'tan secilir, ama primitiveler arasinda parent-child iliskisi olmadigindan parent'tan
           secmek mevzu bahis olamaz o zaman tek secenek aynisi olmalidir.
        7) Child'da override edilen methodun return type'i ile parent'taki methodun return type'i arasinda
          IS-A iliskisi yoksa return type DEGİSTİRİLEMEZ.
          Mesela ;
          Integer Wrapper classi ile Long Wrapper classi arasinda IS-A iliskisi yoktur o yuzden return type'i
          degistiremedik.
       8) Methodun return type'i void ise Overriding yaparken return type DEGISTIRILEMEZ.
       9) static methodlar override edilemezler. Cunku static methodlar tum child'lar için ortak methodlardır.
          Bir child bir ortak methodu degistirdiginde diger child'lar bundan olumsuz etkilenebilir.
          Bu yuzden java static methodların override edilmesine izin vermez.
      10) final methodlar override edilemezler. final methodların body'si degistirilemez ama override ederken
          method body'i degistiririz. Bu bir celiskidir. Bu yuzden java final methodların override edilmesine müsaade etmez.
                a) final keywordunu variable'lar ile kullanabiliriz.
                   i) final variable ise mutlaka deger atanmalıdır.
                   ii) ilk atanan deger degistirilemez.

                b) final keywordunu methodlar ile kullanabiliriz.
                   i) method final ise methodun body'si degistirilemez.
                   ii) methodun body'si degistirilemeyince override yapmak mumkun olmaz.

                c) final keywordunu Class'lar ile kullanabiliriz.
                    => class final ise O classin child'i olamaz.

       ==> Polymorphism ==> Method Overloading + Method Overriding;

     */

    public void eat(){

        System.out.println("Animals eat...");
    }

    public void drink(){

        System.out.println("Animals drink...");
    }

    public Animal create (){
      return new Animal();
    }

    public int add(int a, int b){
        return a+b;
    }

    public Integer multiply(int a, int b){
        return a*b;
    }

    public final double circleArea (double r) {
        return 3.14*r*r;
    }


    final Integer a = 13; // final keywordunu Wrapper ile kullanmak istersek mutlaka deger ataması yapmalıyız.

}
