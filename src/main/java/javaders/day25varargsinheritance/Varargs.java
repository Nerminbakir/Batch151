package javaders.day25varargsinheritance;

public class Varargs {
    public static void main(String[] args) {

        System.out.println(add(3,6));
        System.out.println(add(5, 2, 7));

        getInitials("Ali Can", "Veli Han");

    }
        /*
        1) Bir method parantezinde birden fazla Varargs kullanılamaz.
        2) Bir method parantezinde birden fazla parametre kullanılacaksa Varargs en sonda olmalıdır.
        */
    public static int add (int... a){
        int sum = 0;
        for (int w: a) {
            sum = sum + w;
        }
        return sum;
    }
   // public static int add (int... a, int... b){} ==>int... b ==>unused code; asla kullanılmayan koddur.

    /*
        Asagıdaki gibi farklı methodları olusturarak dinamik cözüm uretemeyiz.
        Cünkü kullanıca farklı sayıdaki sayıları toplamak isteyebilir.
        Her ihtimal için bir method olusturmak mumkun degildir.
        Java farklı sayıdaki parametrelerin hepsini kabul eden bir yapı olusturdu.
        Bu yapıya "Varargs" denir.
        Varargs arka planda Array yapısını kullanır.
     */
    public static int add(int a, int b){
        return a+b;
    }
    public static int add(int a, int b, int c){
        return a+b+c;
    }
    public static int add(int a, int b, int c, int d){
        return a+b+c+d;
    }

    // Example : Verilen isimlerin ilk harflerini console'a yazdiran method'u olusturunuz.
    //           Ali Can ==> AC    Kemal Han ==> KH

    public static void getInitials (String ...s){
        String initials = "";

        for (String w:s) {
            initials = initials + w.charAt(0) + w.split(" ")[1].charAt(0);
            System.out.println(initials);
            initials = "";
        }
    }












}
