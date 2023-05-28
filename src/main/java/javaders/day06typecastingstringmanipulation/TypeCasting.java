package javaders.day06typecastingstringmanipulation;

public class TypeCasting {

    public static void main(String[] args) {

        //************* EXPLİCİT NARROWİNG ****************

        /*
        Explicit Narrowing yaparken dikkat edilmeli .
        Cunku cok ciddi data kaybi hatta datanin degismesine neden olabilir.
        Eger sayimiz donusturmeye calistirdigimiz variable'nin sınırları dısında ise
        java sayıyı mod işlemine alır ve kalanı yazdırır.
        Kalan bölenin yarısından fazlaysa kalan sayıyı java kucultmek ister ve bölümü
        bir buyuterek kalanı - işaretli olacak sekilde yazdirir.

         */

        // short data type'inda bir variable olusturup byte data type'ini ceviren kodu yaziniz.

        short num = 260;
        byte numByte = (byte) num;
        System.out.println("numByte = " + numByte);//4

        // --- byte -128... 0 ... +127 araliginda old icin 128+127+1
        // (bu bir 0'ın degeri) =256  --- 260/256==>kalan 4 tur.

        short num2= 1023;
        byte numByte2 = (byte) num2;
        System.out.println("numByte1 = " + numByte2);//-1

        short num3= 1000;
        byte numByte3 = (byte) num3;
        System.out.println("numByte3 = " + numByte3);//-24
        
        int intSayi = 8880;
        short shortSayi = (short) intSayi; //  -32768 ...0...32678
        System.out.println("shortSayi = " + shortSayi);//8880




    }//main
}//class
