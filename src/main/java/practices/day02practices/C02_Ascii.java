package practices.day02practices;

public class C02_Ascii {
    public static void main(String[] args) {

        // Rakam kullanmadan 65, 66, 67, 68, 69, 70 sayilarinin toplamını bulunuz

        System.out.println((int) 'A'+ (int) 'B'+(int) 'C'+(int) 'D'+(int) 'E'+(int) 'F'); //405

        //A, B, C, D, E ve F harflerini type casting ile int'e dönusturduk
        //Type casting'e dönüstürmeden toplasaydık yukarıdaki harflerin Ascii degerlerini toplamıs olurduk ama bizden sayı olarak toplamı isteniyor.

    }//main
}//class
