package nerminwork.constructors;

public class Constructors {

    /*
        1) Constructors'in ismi class'in ismi ile aynı olmalıdır.
        2) Constructor olusturulurken class ismi yazıldıktan sonra () konulmalıdır.
        3) Class olusturuldugunda Java bu classdan object olusturulacagını düşünerek "Constructor" olusturur.
        4) Siz kendiniz Constructor ürettiğinizde, Java default constructor'ı iptal eder.
        5) Constructor ureterek bir class'tan cok farklı objectler uretebiliriz.
        6) Constructor'larda return type yoktur. Bu yuzden Constructor'lar method degildir.
        7) Constructor'larda sadece class ismi isim olarak kullanılabilir, fakat methodlarda isim olarak her sey kullanılabilir.
     */

    public Constructors (){

    }

    public static void main(String[] args) {
     // Class ismi       Object ismi    new keyword     Constructor
        Constructors        obj1    =       new         Constructors();
    }



}
