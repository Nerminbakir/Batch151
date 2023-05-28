package nerminwork.constructors;

public class StaticKeyword02 {
    public static void main(String[] args) {

        // Static olanlara sadece class ismi kullanılarak ulasılabilir.

        System.out.println(StaticKeyword01.gender); // Erkek
        System.out.println(StaticKeyword01.k); // 0

        // Instance olanlara ulasmak için object uretmek zorundayız.

        StaticKeyword01 obj1 = new StaticKeyword01();
        System.out.println(obj1.i); // 0
        System.out.println(obj1.name); // Ali

        //Static olanlara object uzerinden ulasabilirsiniz ama tavsiye edilmez.

        System.out.println(obj1.gender);
        System.out.println(obj1.k);


    }
}


