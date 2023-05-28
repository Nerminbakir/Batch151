package nerminwork.constructors;

public class Insan {

    int age ;
    String name;
    int height;
    boolean isHonest;
    String job;
    String gender;

    /*
    1) Costructor içinden baska bir constructor cagirmak için "this()" kullanırsanız mutlaka ilk satıra yazmalısınız.
        Aksi takdirde CTE alırsınız.
   2) Bir constructor içinden sadece bir tane constructor cagrısı yapabilirsiniz. Cunku 2 tane cagrı
      yapasanız birisi ilk satırda olmayacaktır, bu da ilk kurala aykırıdır.

     */

    public Insan (){
        System.out.println("Parametresiz");
    }//constructor olusturduk

    public Insan (String name){
        this();
        System.out.println("Name Parametreli");
    }//constructor olusturduk

    public Insan (String job, String gender){
       this("Veli");
        System.out.println("Job ve Gender Parametreli");
    }//constructor olusturduk

    public static void main(String[] args) {

        Insan i1 = new Insan ("Doctor", "Bayan");

        // run ==> ekranda "parametresiz" -- "name parametreli" -- "Job ve Gender Parametreli" yazılarını görürüz.
        // Sebebi this name:"Veli" yukarıdaki constructorlardan uygun olan 2. constructor oldugu için önce this ()  sonra  System.out.println("Name Parametreli")'i yazdırır.
        // this () == ilk constructor ==> public Insan (){System.out.println("Parametresiz") oldugu için ekranda "parametresiz" görürüz.
        // Daha sonra this () den sonra System.out.println("Job ve Gender Parametreli"); old için ekrana "Job ve Gender Parametreli" yazdırır.




    }

}
