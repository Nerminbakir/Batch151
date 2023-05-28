package nerminwork.cesitli;

public class Concatination {

    public static void main(String[] args) {

        //Farkli data typelari ile matematiksel islemler yaparsak sonuc buyuk data type'inda verilir.
        int a =12;
        double b =4;
        float c = 4f;
        System.out.println(a/b);//3.0
        System.out.println(a+b);//16.0
        System.out.println(b/a);//0.3333333333333333
        System.out.println(c/a);//0.33333334

        //g, h ve i variable'lari kullanarak 61Java-1 yaziniz.

        int g = 2;
        int h = 3;
        String i = "Java";

        System.out.println(i + g + h);//Java23
        System.out.println(i + (g+h));//Java5
        System.out.println(g + h+ i);//5Java
        System.out.println((g*h) +""+ (h-g) + i + (g-h));//61Java-1

        int sayi1 = 5;
        int sayi2 = 2;
        double sonuc = sayi1 / sayi2;
        System.out.println(sonuc);

        int x = 12;
        int y = 15;
        x*=2;
        y/=3;           //12*2=24+5=29
        x++;
        y--;
        System.out.println(x + y);



        int num1 = 4;
        int num2 = 5;
        String str1 ="Ali";
        System.out.println(num1+num2+str1);//9Ali
        System.out.println(str1+num1+num2);//Ali45


    }

}
