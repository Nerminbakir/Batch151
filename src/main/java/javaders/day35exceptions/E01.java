package javaders.day35exceptions;

public class E01 { // ArithmeticException
     /*SH
        1)"Exception" beklenmedik problem demektir.
        2)"Exception" i halledebilmek icin iki temel yol vardir;
            i)"Exception" a uygun cozumler uretebilirsiniz. Buna "Exception Handling" denir.
            ii)"Exception" olustugunda bunu ilan eder ve geri cekilirsiniz. Buna da "Throw Exception" denir.
        3)"Exception" a uygun cozumler uretmede "try-catch" kullanilir.
          "try block" da yapilmasi gereken islemi Java'dan yapmasi istenir.
          Java islemi problemsiz bir sekilde yaparsa "catch block" Java tarafindan okunmaz.
          "try block" da islem yapilirken "Exception" olusursa "catch block" devreye girer ve "catch block" icindeki kodlar calisir.
        4)"try block" da islem yapilirken "Exception" olusursa "try block" icindeki Exception'dan sonraki kodlar calistirilmaz
     */
    /*MH
     * "Exception" beklenmedik problem demektir. java cozemedigi bir sorunla karsilastiginda "Exception" class'i devreye girer
        Exception class'i bize karsilasilan sorunun cinsini , bu sorunun nereden kaynaklandigini ve sebebini verir
     * Java "exception" firlattiginda kodun calismasini durdurur. Java "exception" olusturan kod icin bizden bir karar vermemizi ister
     * Eger hiç bir sey yapmaz isek beklendiği gibi kodumuzun calısmasını durdurur.
       Kodumuzun calısmaya devam etmesini istiyorsak try catch ile exception olusturması muhtemel kodlarımızı catch blogu içinde yazmalıyız.
     * "Exception a uygun cozumler uretmede "try-catch" kullanilir, try block icinde yapilmasi gereken islemi java dan isteriz
        Eger java bu islemi sorunsuz bir sekilde yaparsa catch block devreye girmez
        try block icerisinde eger bir "exception" olusursa catch block o zaman devreye girer, ve catch black icindeki kodlar calisir
     *  try block icinde islem yapilirken "Exception" olusursa try block icindeki exceptiondan sonraki kodlar calistirilmaz
     *  catch satirindaki parantez icine karsilasilmasi muhtemel olan exception class ismini ve bir obje ismi (e) yazariz
     *  if else kullanirsak olusabilecek her problemi specific olarak if parantezinin icine yazmamiz gerekir. Bu da ciddi bir matematik bilgisi gerektirir
        ve yazacagimiz kodu cok uzatir.
        Ama try catch te java ilgili Exception ile alakali olusabilecek tum problemleri yakalar
     */

    public static void main(String[] args) {

        System.out.println(divide1(12,3));
        System.out.println(divide1(6,0));

        System.out.println(divide2(12,3));
        System.out.println(divide2(6,0));

    }

    //1.Way: Exception'i handle etmede tavsiye edilmez
    public static int divide1(int a, int b){
        if(b==0){
            return 0;
        }else{
            return a/b;
        }
    }

    //2.Way: Exception'i handle etmede harika yol
    public static int divide2(int a, int b){
        int result = 0;

        try{
            result = a/b;
            System.out.println("I am here");
        }catch(ArithmeticException e){//"ArithmeticException" matematik ile ilgili herhangi bir kural ihlali yapildiginda atilir.
            System.out.println("There is an issue in division");
        }
        return result;
    }
}

/*

    NOT: ArithmeticException: Olusan exception cinsi
    NOT: by zero: Hatayi anlatan teknik mesaj
 */

/*MH
 public static void main(String[] args) {
        divide(12, 6);
        divide(12, 0);

        divide2(3,0);


    }

    //tavsiye edilmez
    public static void divide(int a, int b) {
        if (b==0){
            System.out.println("sayi sifira bolunemez");
        }else{
            System.out.println(a / b);
            System.out.println("divide methodu ici");
        }
    }

    public static void divide2(int a, int b){
       try{
        // ArithmeticException yazdıgınızda code da matematiksel islem kullanıyor iseniz alınabilecek bir exception'dır.
           System.out.println(a / b);
           System.out.println("try-catch blok ici");

       }catch (ArithmeticException e){

           System.out.println("Sayi sifira bolunemez");

       }
        System.out.println("try catch ile handle edildi");


    }
 */