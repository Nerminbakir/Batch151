package nerminwork.cesitli;



public class ValueOf {
    public static void main(String[] args) {

        // Integer.valueOf() rakamlarla olusturulan String'leri sayiya donusturur. Boylece rakamlarla olusturulan
        // Stringlerle matematiksel islemler yapabilmemizi saglar.

        //valueOf() hem Integer wrapper classinin icinde hem de String'in icinde var. Integer wrapper classinin icinde
        //olan valueOf() methdou String'i integer'a cevirir. String'in icindeki valueOf() methodu integer'i String'e cevirir.

        String paraErkek = "1900";
        String paraKadin = "2000";

        //Bu ailenin toplam gelirini bulunuz.

        int toplamGelir = Integer.valueOf(paraErkek) + Integer.valueOf(paraKadin);
        System.out.println("toplamGelir : " + toplamGelir);


        int maasErkek = 1900;
        int maasKadin = 2000;

        //maasErkek ve maasKadin sayilarini String'e donusturun ve concatenation yapin

        String mErkek = String.valueOf(maasErkek);
        String mKadin = String.valueOf(maasKadin);
        System.out.println("CONCAT" + mErkek + mKadin);



        String girilenKelime = "65";
        int girilenSayi=65;

        // kelimenin -> sayiya cevrilmesi
        int girilenKelimeninSayiHali = Integer.parseInt(girilenKelime); // donusecek tipe uygun donusum
        short shortDeger = Short.parseShort(girilenKelime);
        double oran = Double.parseDouble(girilenKelime);


        // Soru : Short olarak atadığınız değeri stringe çevirerek ekrana yazdırınız.

        short deger = 65;
        String deger1 = String.valueOf(deger);
        System.out.println("Short olarak atadığınız değeri stringe çevir : " + deger1);



        //toString() methodu;
        short sayi=345;
        String sayi1 = String.valueOf(sayi);
        System.out.println(sayi1.toString());


        //Soru:  String olarak verilen 2 adet bagis parasının toplamini yazdiriniz.

        String bagis1="500";
        String bagis2="1500";

        System.out.println("bagıs parası : " + (Integer.valueOf(bagis1) + Integer.valueOf(bagis2)));



        // Soru :String olarak verilen karenin 1 kenar uzunluğundan karenin çevresinin uzunluğunu bulunuz.

        String kenar="8";
        int kareninKenari = Integer.valueOf(kenar);

        System.out.println("Karenin Cevresi : " + kareninKenari*4);


    }
}


