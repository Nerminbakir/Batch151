package nerminwork.loops;

public class Loops02SHD {
    public static void main(String[] args) {

        //Size verilen kucuk harfle yazilmis String'in index'i cift sayi olan character'lerini buyuk harfe donusturunuz
        //miami ==> MiAmI

        String s = "miami";// MiAmI

        for (int i = 0; i < s.length(); i++) {
            String ch = s.substring(i, i+1);
            if(i%2==0){
                System.out.print(ch.toUpperCase());
            }else{
                System.out.print(ch);
            }
        }

        System.out.println();

        //Verilen bir string'de ilk 'a' harfinden onceki tum characterleri console'a yazdiriniz
        //Hello Java ==> Hello J
        String s1 = "Hello Java";

        for (int i = 0; i < s1.length(); i++) {
          if(s1.charAt(i)=='a'){
              break;
          }
            System.out.print(s1.charAt(i));
        }

        System.out.println();

        //Verilen bir String de son 'a' dan sonraki tum characterleri ters sirada yazdiriniz
        //"Tokatci ==> ict
        String u = "Tokatci";

        for (int i = u.length()-1; i >=0 ; i--) {
            char ch= u.charAt(i);
            if (ch=='a'){
                break;
            }
            System.out.print(ch);
        }
        System.out.println();

        //Verilen bir String'de kucuk harfleri console'a yazmayiniz
        //"Pwd12?Ab" ==> P12?A
        String r = "Pwd12?Ab";

        for (int i = 0; i <r.length() ; i++) {
            char ch = r.charAt(i);

            if(ch>'a'&& ch<='z'){
            continue;
            }else{
                System.out.print(ch);
            }
        }
        System.out.println();

        //Bir String'i ters ceviren kodu yaziniz
        //"Java" ==> "avaJ

        //1.Way

        String t = "Java";
        String ters = "";

        for (int i = t.length()-1; i >=0; i--) {
            ters = ters + t.substring(i,i+1);

        }
        System.out.println(ters);

        //2.Way

        String m = "Java";
        String ters2 = "";

        for (int i = m.length()-1; i >=0; i--) {
            ters2 = ters2 + m.charAt(i);

        }
        System.out.println(ters2);

        //Bir tamsayinin rakamlarinin toplamini veren kodu yaziniz
        //578 ==>5+7+8=20
        int sum =0;

        int z= -578;
        z = Math.abs(z); //negatif sayılarda mutlak degere aldıktan sonra devam ederiz.

        for (int i = 578; i >0 ; i=i/10) {
           sum = sum + i%10;


        }

        System.out.println(sum);//20







    }//m
}//c
