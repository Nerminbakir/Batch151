package javaders.day35exceptions;

public class E05 { // StringIndexOutOfBoundsException
    public static void main(String[] args) {
        String s = "Java";
        getCharFromString(s,2);//v
        getCharFromString(s,4);

       //  StringIndexOutOfBoundsException; String'lerde olmayan index kullanıldıgında atar.

    }

    // Example : Bir String'deki character'i index kullanarak alan bir method olusturunuz.
    public static void getCharFromString(String s, int idx){
        try{
            char ch= s.charAt(idx); // return s.charAt(idx);==> bu da kullanılabilir.
            System.out.println(ch);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Olmayan index kullandiniz ==> "+e.getMessage());
            System.out.println(e.getCause());//null
            e.printStackTrace();
        }
        System.out.println("try catch method gorev tamamlandi");

    }

}
