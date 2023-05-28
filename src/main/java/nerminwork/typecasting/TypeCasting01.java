package nerminwork.typecasting;

public class TypeCasting01 {

    public static void main(String[] args) {

        /*
        byte < short < int <long <float < double

         */

        byte b1= 12;
        short s1 = b1;
        int i1 = b1;
        float f1 = b1;

        //Buyuk data type'ini kucuk data type'ina cevirme işlemini java yapmaz.
        //Bu cevirmeyi biz asagidaki gibi yaparız. Buna Explicit Narrowing denir.

        short s2 = 121;
        byte b2 = (byte) s2;








    }//main

}//class
