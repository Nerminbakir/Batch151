package javaders.day36exceptions;

public class E01 {
    public static void main(String[] args) {

        /*
          * try kısmında birden fazla Exceptions olusturma ihtimali olan kod varsa coklu catch kulanabilirsiniz.
          * coklu catch kullandıgınızda Exceptions Class'lar arasında parent-child ilişkisi yoksa
            catch'lerin sırası önemli degildir. Ama koddaki sıralamaya uymak tavsiye edilir.
          * coklu catch kullandıgınızda Exceptions Class'lar arasında parent-child ilişkisi varsa
            catch'lerin sırasına dikkat etmeliyiz. child class üstte olmalıdır.
          * Exceptions class'lar arasında parent-child ilişkisi varsa
                ==> ya child class'ı üstte yazarak child ve parent için özellestirilmis kodlar yazarsınız
                ==> ya da child'ı hic kullanmaz sadece parent ile exceptions'ları handle etmeye calısırsınız.
          * "try + 1 catch" olur - "try + coklu catch" olur - "try" tek basına kullanılamaz.
          * "try" catch block olmadan kullanılabilir mi?
          * try + finally olabilir.

         */

        int a = 12;
        int b = 1;
        String s = "My Java";
        getCharFronString (s,a,b); // J

    }

    public static void getCharFronString (String s, int a, int b){
        try{
            int idx = a/b;
            char ch = s.charAt(idx);
            System.out.println(ch);
        }catch (ArithmeticException e){
            System.out.println("Do not divide by zero");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("olmayan index kullandınız");
        }

    }
}
