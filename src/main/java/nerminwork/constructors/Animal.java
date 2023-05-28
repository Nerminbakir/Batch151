package nerminwork.constructors;

public class Animal {

    int age ;
    String name;
    int numOfLegs;
    boolean isMamel;

    public Animal (){
        System.out.println("Parametresiz");
    }//constructor olusturduk

    public Animal (String name){
        this();//
        System.out.println("Name Parametreli");
    }//constructor olusturduk

    public Animal (int age){
        System.out.println("Age Parametreli");
    }//constructor olusturduk

    public Animal (String name, int age){
        System.out.println("Name ve Age Parametreli");
    }//constructor olusturduk





    public static void main(String[] args) {

        Animal a1 = new Animal("Cat");// run ==> ekranda "parametresiz" -- "name parametreli" yazılarını görürüz.
        // Sebebi name:Cat yukarıdaki constructorlardan uygun olan 2. constructor oldugu için önce this ()  sonra  System.out.println("Name Parametreli")'i yazdırır.
        // this () == ilk constructor ==> public Animal (){System.out.println("Parametresiz") oldugu için
        // this () ==> constructorları birbiriyle içiçe kullanmaya yarar. zincir olusturur.

            }//obje olusturduk



}
