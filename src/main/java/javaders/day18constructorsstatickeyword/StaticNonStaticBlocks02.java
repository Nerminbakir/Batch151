package javaders.day18constructorsstatickeyword;

public class StaticNonStaticBlocks02 {

    public StaticNonStaticBlocks02 (){
       System.out.println("Costructor 1");

    }

    public StaticNonStaticBlocks02 (int price){
        System.out.println("Costructor 2");
    }

    public StaticNonStaticBlocks02 (String name){
        System.out.println("Costructor 3");

    }

    public StaticNonStaticBlocks02 (boolean isOld){
        System.out.println("Costructor 4");

    }
    // non-static block constructorlarda calıstırılması gereken ortak kodları içerir.
    // non-static block içine yazılan kodlar her constructor için calıstırılır.
    // Birden fazla non-static block varsa ustteki önce calısır.
    {
        System.out.println("I am constructor - ilk");
    }
    {
        System.out.println("I am constructor - ikinci");
    }

    public static void main(String[] args) {
        StaticNonStaticBlocks02 obj1 = new StaticNonStaticBlocks02();
        StaticNonStaticBlocks02 obj2 = new StaticNonStaticBlocks02(12);
        StaticNonStaticBlocks02 obj3 = new StaticNonStaticBlocks02("Shirt");
        StaticNonStaticBlocks02 obj4 = new StaticNonStaticBlocks02(false);

    }

}
