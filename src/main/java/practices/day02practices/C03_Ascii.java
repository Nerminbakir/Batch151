package practices.day02practices;

public class C03_Ascii {

    public static void main(String[] args) {

    // CEM isminin icerisinde bulunan harfleri kullanmadan yazdırınız

    /* ASCİİ

          B ==> 66           C ==> 67
          D ==> 68           E ==> 69
          L ==> 76           M ==> 77

        */

        char ilkKarakter = 'B'+1;//C
        char ikinciKarakter = 'D'+1;//E
        char sonKarakter = 'L'+1;//M

        System.out.println(ilkKarakter + "" + ikinciKarakter + "" +sonKarakter);//CEM
        System.out.println("" + ilkKarakter + ikinciKarakter +sonKarakter);//CEM



    }//main
}//class
