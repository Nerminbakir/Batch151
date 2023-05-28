package javaders.day09stringmanipulationsifstatement;

public class C01_StringManipulations {

    public static void main(String[] args) {

        // Ex = Bir Stringin hic karakter icerip icermedigini kontrol eden kodu yaziniz

        String str = "";//hiclik


        //1. yol

        boolean result1 = str.length()==0;//javaya 2 islem yaptirdim. 1. lenght () kullandim. 2. ==0 kullandim
        System.out.println("String bos mu = "+ result1);//true


        //2. yol

        //*************** isEmpty Methodu **********

        // isEmpty Methodu String datanin icerisinde hic bir sey yoksa TRUE dondurur.
        // Javada space'de bir karakter old icin space varsa FALSE dondurur.

        boolean result2 =str.isEmpty();//javaya tek islem yaptirdim isEmpty () kullandik
        System.out.println("String Bos Mu = "+ result2); //String Bos Mu = true


        // Ex = Bir String datanin space haric hicbir karakter icerip icermedigini gosteren kodu yaziniz.

        String t = " ";
        //1..Yol

        boolean result3 = t.replace(" ", "").length()==0; //Javaya 3 işlem yaptırdık
        System.out.println("result3 t = " + result3);  //true

        // 2.Yol

        boolean result4 = t.replace(" ", "").isEmpty(); //Javaya 2 işlem yaptırdık
        System.out.println("result4 = " + result4); //result4 = true


        // 3.Yol

        //*************** isBlank Methodu   **********

        /*isBlank () == space + hiclik ise True dondurur.
                String bir datanin bos mu dolu mu olduguna bakar.
                isEmpty'den farki space varsa yine true dondurur.
         */

        boolean result5 =t.isBlank();// javaya 1 islem yaptirdik
        System.out.println("result5 = " + result5);//result5 = true


        //*************** indexOf () Methodu   **********

       /*Verilen karakter veya karakterlerin ilk gorunumun indexini verir.
       int bir deger dondurur.
       Coklu data icin kullanildiginda ilk gordugu datanin ilk karakterinin indexini verir.
       Olmayan bir karakterin indexi sorulursa bize -1 dondurur.
        */


        // Ex = Bir String'de a,i,e karakterlerinin ilk gorunumunun indexleri toplamini ekrana yazdiriniz.

        String s = "Java is easy to learn"; //1+5+8=14
        int aIdx = s.indexOf('a');
        System.out.println("aIdx = " + aIdx);//aIdx= 1

        int iIdx = s.indexOf('i');
        System.out.println("iIdx = " + iIdx);//5

        int eIdx = s.indexOf('e');
        System.out.println("eIdx = " + eIdx);//8
        System.out.println("indexler Toplami = " + (aIdx + iIdx+ eIdx));//14

        int pIndx = s.indexOf('p');
        System.out.println("pIndx = " + pIndx);//-1

        String s2 = "Java is easy to learn to easy to";
        int idx = s2.indexOf("to");
        System.out.println("idx = " + idx);//13
        
        //Ex = Bir stringde "java" kelimesinin ilk olarak kacinci Idx de oldugunu gosteren kodu yaziniz.
        
        String cumle = "Ah Java vah Java sen ne guzel seysin Java";
        
        int indexJava = cumle.indexOf("Java");
        System.out.println("indexJava = " + indexJava);//3

        int indexQYX = cumle.indexOf("QYX");
        System.out.println("indexQYX = " + indexQYX);//-1

        //***************** lastIndex ()Methodu *********

        /*
        Verilen String bir datada istenilen degerin son gorunumunun indexini verir.
        Olmayan bir karakter sorgulanirsa -1 dondurur.
         */

        //Ex = Bir String'de a,i,e karakterlerinin son gorunumunun indexleri toplamini ekrana yazdiriniz

        String c = "Java is easy to learn";

        int aLast = c.lastIndexOf('a');
        System.out.println("aLast = " + aLast);//18

        int iLast  = c.lastIndexOf('i');
        System.out.println("iLast = " + iLast);//5

        int eLast = c.lastIndexOf('e');
        System.out.println("eLast = " + eLast);//17
        System.out.println("Toplam index = " + (aLast + iLast+ eLast));//40





    }//main



}//class
