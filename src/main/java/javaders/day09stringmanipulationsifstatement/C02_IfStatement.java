package javaders.day09stringmanipulationsifstatement;

public class C02_IfStatement {

    public static void main(String[] args) {

        /*

        If Statement ()  yapisinda bazen kodlarin calismasi belirli kosullara baglidir.
        Mesela cok calisirsam Java ogrenecegim. Java ogrenme eylemi cok calisma eylemine baglanmistir.
        1. Eylem gerceklesmeden ikinci eylem gerceklesmez.
        if (){}
        () parantez icine sart yazilir eger true dondururse {} body arasindaki kod calisir.
        Aksi halde if body disina cikar classtan sonraki kodlari okumaya devam eder.
         */



        //Interwiev Questions USA QA

        // String str = "abbccdc" tekrarsiz karakterleri ekrana yazdiriniz.

        String str = "aac";

        char ch =str.charAt(0);

        if(str.indexOf(ch) ==str.lastIndexOf(ch)){

            System.out.println("ch = " + ch);

        }//if body

        char ch1 =str.charAt(1);

        if(str.indexOf(ch1) ==str.lastIndexOf(ch1)){

            System.out.println("ch1 = " + ch1);
        }//if body

        char ch2 =str.charAt(2);

        if(str.indexOf(ch2) ==str.lastIndexOf(ch2)){

            System.out.println("ch2 = " + ch2);//ch2 = c
        }//if body



        //Ex = sayi pozitif ise ekrana pozitif sayi yazdiran kodu yaziniz.

        int num = 20;
        if(num>0){
            System.out.println("PozitifSayi");//PozitifSayi
        }

        int num1 = -20;
        if(num1>0){
            System.out.println("PozitifSayi");//Hiç birsey yazdırmaz. Alttaki kodlari calıstırır.************* gibi
        }

        System.out.println("*************");

         //Ex = Sayi -1 ile 10 arasinda ise ekrana yazdirin. 0 1 2 3 4 5 6 7 8 9 ==> Rakam

        int number = 8;// -1 ile 10 arasinda olmayan bir sayi girersek consolda bir sey yazdirmaz.

        if (number>-1 && number<10){
            System.out.println("Rakam");//Rakam
        }

        //Ex = Sayi 3 basamakli ise ekrana "Sayi 3 basamaklidir" yazdiriniz.

        int n = -234;

        /*
        Math classi onemli bir classtir. Icerisinde bir cok method barindirir.
        abs () methoduda icerisine arguman olarak verdiginiz sayinin mutlak degerini yani pozitif halini verir.

         */

        n = Math.abs(n);

        if (n>99 && n<1000){
            System.out.println("Sayi 3 basamaklidir");//Sayi 3 basamaklidir

        }



    }//main
}//class
