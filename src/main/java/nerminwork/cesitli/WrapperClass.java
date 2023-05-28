package nerminwork.cesitli;
//WRAPPER CLASS
public class WrapperClass {

    public static void main(String[] args) {

        //byte, short ve int'in maximum ve minimum degerlerini bulunuz.

        byte minValue =Byte.MIN_VALUE;
        System.out.println(minValue);
        byte maxValue = Byte.MAX_VALUE;
        System.out.println(maxValue);

        short minValue1 =Short.MIN_VALUE;
        System.out.println(minValue1);
        short maxValue1 = Short.MAX_VALUE;
        System.out.println(maxValue1);

        int minValue2 = Integer.MIN_VALUE;
        System.out.println(minValue2);
        int maxValue2 = Integer.MAX_VALUE;
        System.out.println(maxValue2);


        //long, float ve double'ın max ve min degerlerini bulunuz.

        long minLong = Long.MIN_VALUE;
        System.out.println(minLong);
        long maxLong = Long.MAX_VALUE;
        System.out.println(maxLong);

        float minFloat = Float.MIN_VALUE;
        System.out.println(minFloat);
        float maxFloat = Float.MAX_VALUE;
        System.out.println(maxFloat);

        double minDouble = Double.MIN_VALUE;
        System.out.println(minDouble);
        double maxDouble = Double.MAX_VALUE;
        System.out.println(maxDouble);

        String name = "Ali Can";
        name.toUpperCase();
        System.out.println(name.toUpperCase());
        //toUpperCase : BÜYÜK HARFE ÇEVİRDİ.

        name.toLowerCase();
        System.out.println(name.toLowerCase());
        //toLowerCase : KÜÇÜK HARFE ÇEVİRDİ.
    }
}
