package javaders.day36exceptions;

public class E03 { // ClassCastException
    public static void main(String[] args) {

        Object obj = 13;

        try{
            String str = (String) obj;
            System.out.println(str);
        }catch (ClassCastException e){
            System.err.println("Her data type her data type'a cevrilmez"); // console'daki hata mesajını kırmızı renkte verir.
                                                                          // hataya dair mesajın okunabilirligini arttırmak için kullanılabilir.
                                                                         // Ayrıca Java error mesajlarını ayrı bir yerde depolanır. (Daha sonra kolayca ulasabilmek için)
        }

        // Birbirine dönüstürülemeyecek data type'larını dönüstürmekte ısrar ederseniz Java ClassCastException atar.


    }
}
