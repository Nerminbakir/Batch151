package javaders.day13incrementdecrementloops;

public class IncrementDecrement {
    public static void main(String[] args) {

        //Increment

        int a = 5;
        System.out.println(a);//5
        a = a +2;
        System.out.println(a);//7

        a+=2;

        // Ex = Bir tane int variable olusturun ve onu iki sekilde 5 arttırın.

        int b = 8;
        System.out.println(b);//8
        b = b +5;
        System.out.println(b);//13

        b+=5;
        System.out.println(b);//18

        //Decrement

        int c = 8;
        c = c-3;
        System.out.println(c);//5

        c-=3;
        System.out.println(c);//2

        //Increment 2;

        int d = 6;
        System.out.println(d);//6
        d = d*2;
        System.out.println(d);//12
        d*=2;
        System.out.println(d);//24

        //Decrement 2;

        int e = 24;
        System.out.println(e);//24

        e=e/2;
        System.out.println(e);//12

        e/=2;
        System.out.println(e);//6


        //"1" ile Increment

        int f = 12;
        f=f+1;
        f+=1;
        f++;//best practies

        // "1" ile Decrement

        int h =10;
        h=h-1;
        h-=1;
        h--;//best practies

        // post-increment ve pre increment

        int i= 10;
        int k = i++;    //i ==>variable     ++==>increment      ==> post increment
        System.out.println(k);//10 == i arttılmadan k sepetine konuldugu için k=10 olur.
        System.out.println(i);//11 == i satır sonında arttıldıgı için i=11 olur.

        int m = 15;
        int n = ++m;   //++==>increment    m==>variable        ==> pre increment
        System.out.println(m); //16 == m satır sonunda arttıldıgı için m=16 olur.
        System.out.println(n); //16 == m arttıldıktan sonra n sepetine konuldugu için n=16 olur.

        //post increment = variable isminden sonra increment işlemi yapıldı.
        //pre increment = variable isminden önce increment işlemi yapıldı.

        // Ex =

        int p =17;
        int r= p--;
        System.out.println(p);//16
        System.out.println(r);//17

        // Ex =

        int s = 20;
        int t = --s;
        System.out.println(s);//19
        System.out.println(t);//19

        /*
        1) Increment = arttırmak demektir. Decrement = azaltmak demektir.
        2) Increment toplama ve carpma ile Decrement cıkarma ya da bölme ile yapılabilir.
        3) Increment ve Decrement 3 yolla yapılabilir.

                a) int i = 12; ==> i = i+5;
                b) int i = 12; ==> i+=5;
                c) int i = 12; ==> i++;
                Note = 3. yol sadece 1 arttırmak için kullanılabilir.

                a) int i = 12; ==> i = i-5;
                b) int i = 12; ==> i-=5;
                c) int i = 12; ==> i--;
                Note = 3. yol sadece 1 azaltmak için kullanılabilir.
         */



    }//m
}//c
