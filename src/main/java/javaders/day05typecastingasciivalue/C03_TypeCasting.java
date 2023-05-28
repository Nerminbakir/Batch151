package javaders.day05typecastingasciivalue;

public class C03_TypeCasting {

    public static void main(String[] args) {

    /*
        Nümeric data type'larinin birbirine dönüstürülmesine TYPE CASTİNG denir.
        Nümeric data type'lari byte, short, int, long, float ve double
        Kucuk data type'larinin buyuk data type'larina donusturulmesine AUTO WiDENİNG (otomatik genisletme) denir.
        Kucuk kutunun buyuk kutu icerisine yerlestirilmesi.

         Buyuk kutunun kucuk kutuya donusturulmesinde java sorumluluk kabul etmez.
         Data kaybi olabilecegi icin code'u yazanlara birakir. Buna EXPLiCiT NARROWiNG denir. (Aciktan Daraltma)


     */
        byte age =13;
        int ageInt =age;//Auto widening

       // long data type'ini short data type'ina cevirelim.

        long population = 1234;
        short populationShort = (short) population;//explicit Narrowing

        //int data type'ini float data type'ina ceviriniz.

        int boy = 170;
        float boyFloat = boy;

        //short data type'ini byte data type'ina ceviriniz.

        short number = 115;
        byte numberByte = (byte) number;


    }//main
}//class

