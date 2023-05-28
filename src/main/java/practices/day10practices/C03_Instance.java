package practices.day10practices;

public class C03_Instance {

    // Instance variable == non-static variable == object variable

    // static yazmayınca ==>instance variable'dır
    int sayi;  // 0 ==> Instance variable'lara deger ataması yapmazsak default deger atanır.
    String bransIsmi="Java";
    boolean okuldaMi;  // false

    public static void main(String[] args) {

    /*
    sayi, bransIsmi, okuldaMi seklinde uc tane instance variable olusturalım.
    Bu instance variable'leri main icerisinde yazdıralım
    */
        // instance variable'lara, static method'dan ulasabilmek icin obje olusturmamız gerekir
        C03_Instance obj1 = new C03_Instance();
        System.out.println(obj1.sayi);  // 0
        System.out.println(obj1.bransIsmi); // Java
        System.out.println(obj1.okuldaMi);  // false

        // instance variable'lar objeye baglıdır
        // hangi obje uzerinden variable'da degisiklik yapıldıysa, yapılan bu degisiklik sadece o objeyi baglar

        obj1.sayi=10;
        System.out.println(obj1.sayi);  // 10

        C03_Instance obj2 = new C03_Instance();
        System.out.println(obj2.sayi);  // 0
        obj1.bransIsmi="SQL";
        System.out.println(obj1.bransIsmi); //SQL
        System.out.println(obj2.bransIsmi);  // Java
        System.out.println(obj1.okuldaMi);  // false
        obj1.okuldaMi=true;
        System.out.println(obj1.okuldaMi);  // true
        System.out.println(obj2.okuldaMi);  // false
        obj2.sayi=100;
        System.out.println(obj2.sayi); // 100
        obj2.bransIsmi="API";
        System.out.println(obj2.bransIsmi); // API





        /*
                     *
                    * *
                   *   *
                  *     *
                 *********
                *         *
               *           *
              *             *
             *               *
            *                 *

*/

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i == 1 && j == 5) { // A'nın tepe noktası
                    System.out.print("*");
                } else if (i == 2 && (j == 4 || j == 6)) { // A'nın ikinci satırı
                    System.out.print("*");
                } else if (i == 3 && (j >= 3 && j <= 7)) { // A'nın orta kısmı
                    System.out.print("*");
                } else if (i == 4 && (j == 2 || j == 8)) { // A'nın dördüncü satırı
                    System.out.print("*");
                } else if (i == 5 && (j == 1 || j == 9)) { // A'nın alt noktaları
                    System.out.print("*");
                } else {
                    System.out.print(" "); // Boşluk karakteri yazdırma
                }
            }
            System.out.println(); // Satırın sonunda bir alt satıra geçmek için println kullanılıyor
        }

    }
}
