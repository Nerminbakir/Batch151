package practices.day12practices;

public class C03 {
    int fiyat = 300000;
    int yil = 2023;
    String marka = "Opel";
    public C03(int fiyat, int yil, String marka) {
        this.fiyat =fiyat;
        this.yil =yil;
        this.marka=marka;
    }
    public C03() {
    }
    public static void main(String[] args) {
        C03 obj1 = new C03();
        System.out.println(obj1.fiyat);
        System.out.println(obj1.yil-3);
        System.out.println(obj1.marka.replace("Opel","Mercedes"));
        C03 obj2 = new C03(500000,2021,"Citroen");
        System.out.println(obj2.fiyat + ", " + obj2.yil + ", " + obj2.marka);
        // instance variable'lar objeye baglıdırlar
        // Hangi obje uzerinden, variable'da degisiklik yapıldıysa, yapılan bu degisiklik sadece o objeyi baglar
    }

    /*
    obj1'i olusturdugumuzda main method disinda bir constructor olusturmadik. Ilk objemiz parametresiz olup main method disinda bir constructor olmadigindan, javanin bizim icin olusturdugu parametresiz gorunmeyen default constructordan faydalandik. Default constructor objemiz ile calisti, daha sonra tekrar main method
icine girdik ve sout icinde ne yazdiysak onlari calistirmis olduk. Sout icinde objemizin ismi ile ilgili instance variablein ismini yazdik ya da ilgili variable ismi yaninda eksiltme ya da replace methodu ile degisim yapip yazdirdik.

Ikinci objemiz ile ilgili olarak; Elimizde uc tane instance variableimiz var. Ikinci objemizi parametreli olarak olusturduk, boylece instance variablelarimiza yeni degerler verdik. Parametreli obje oldugu ve main method disinda parametreli bir constructorimiz olmadigi icin ihtiyacimiz olan constructor'i olusturduk.
Constructor'in body'si icinde sirasiyla instance variablarimizin isimlerini this keywordu ile alt alta yazdik.
this yanina yazdigimiz isimler instance variablelara ait iken = karsindaki isimler constructor
icindeki parametreleri temsil eder. Ikinci objemizde verdigimiz degerler, constructor parametrelerini
degistirir. Objelere bagli olan instance variablelar bu yontemle deger degisikligine ugrarlar ve guncellenen degerleri ile yazdirilirlar.
     */








}




