package javaders.day20methodoverloadingarraylist;

public class MethodOverLoading01 {
    public static void main(String[] args) {

        String s = "Java";

        //1) Method Overloading ne demek?
        // Ayni isimde farkli isler yapabilen methodlar olusturmak demek
        //2) Ne icin var?
        // Daha derli toplu bir yapi olsun diye, her parametreye gore yeni method olusturmamak adina var
        //ORNEK substring methodu a) tek parametre  b) iki parametre

        add (3,5);  // main methodun içine yazdıgımız her sey static olmalıdır. Asagıda önce public void add (int a, int b)
        //olarak yazdık . Daha sonra add methodunu main methodun içine yazdıgımızda hata verdigi için asagıdaki methodların hepsine
        //static kelimesini ekledik.
        //add (3,5); asagıdaki methodlar arasinda en az is yapani secer

        /*
        1) Method Overloading yaparken method ismi degiştirilmez.
        2) Method Overloading yaparken parametreler degiştirilir.
            a) Parametre degiştirirken, parametrelerin data type'ları degistirilebilir.
            b) Parametre degiştirirken, parametrelerin data type'ları farklı ise yerleri degistirilebilir.
            c) Parametre degiştirirken, parametrelerin sayısı degistirilebilir.
        3) Java için ismi ve parametreleri aynı olan iki method tamamıyla aynıdır.
           Bu yuzden ismi ve parametre  ==> "method signature" olarak adlandırılır.
        4) Method Overloading olustururken return type'ı degiştirmenin hiç bir etkisi yoktur.
           Method Overloading olustururken access modifier'ı degiştirmenin hiç bir etkisi yoktur
           Method Overloading olustururken methodu static ya da non static yapmanın hiç bir etkisi yoktur
           Method Overloading olustururken method body' i degiştirmenin hiç bir etkisi yoktur
        5) "private" mrthodlar overload edilebilir. Cunku method overloading sadece bir classın içinde olur.
            "private" olmak ise baska classlara gidildiginde problem olusturur.
        6) "static" methodlar overload edilebilirler.

         */
    }

    public static void add (int a, int b){ // void oldugu için return kullanmadık
        System.out.println(a+b);

    }//add methodu olusturduk

    public static void add (double a, double b){
        System.out.println(a+b);

    }
    public static void add (double a, int b){
        System.out.println(a+b);

    }

    public static void add (int a, double b){
        System.out.println(a+b);

    }
    public static void add (int a, int b,int c){
        System.out.println(a+b);

    }





}
