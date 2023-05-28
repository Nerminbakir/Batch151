package javaders.day41lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(8);
        nums.add(9);
        nums.add(7);
        nums.add(-4);
        nums.add(9);
        nums.add(2);
        nums.add(4);
        nums.add(6);
        nums.add(15);

        System.out.println(getTheSumOfSquareOfOdds1(nums));
        System.out.println(getTheSumOfSquareOfOdds2(nums));
        System.out.println(getTheSumOfSquareOfOdds3(nums));

        System.out.println(getMultiplicationOfSquareOfEvens(nums));
        System.out.println(getTheSumOfEvenMaxAndOddMin(nums));//15

        System.out.println(getTheSumOfEvenLessThanSevenMaxAndOddMinGreaterThanEight(nums));//6+9=15

    }

    //Example 1: Verilen bir list'teki tek sayi olan elemanlarin kareleri toplamini hesaplayan method olusturunuz.
    public static int getTheSumOfSquareOfOdds1(List<Integer> nums) {
        return nums.
                stream().
                filter(t -> t % 2 != 0).
                map(t -> t * t).
                reduce(0, (t, u) -> t + u); // toplama isleminde 0 kullandıgımız icin identity (etkisiz eleman) = 0 yazdı
    } // reduce == azaltmak, indirgemek demek. Listteki tek olan 4 sayıyı karelerini alıp topladıktan sonra sonuca yani bir sayıya indirgedi.
      // reduce () methodu ile cıkarma, carpma, min ve max bulma da yapılabilir.
    public static int getTheSumOfSquareOfOdds2(List<Integer> nums) {
        return nums.
                stream().
                filter(Utils::isOdd).
                map(Utils::getSquare).// Ihtiyaciniz olan method Java Class'larinda yoksa Utils Class olusturup icinde
                //ihtiyaciniz olan method'u olusturunuz ve method reference kullaniniz.
                reduce(0, Math::addExact);//Class Ismi :: Method Ismi ==> Method Reference
    }

    public static int getTheSumOfSquareOfOdds3(List<Integer> nums) {
        return nums.
                stream().
                filter(Utils::isOdd).
                map(Utils::getSquare).
                reduce(Math::addExact).
                get();// get() method'u Optional<Integer> i Integer'a cevirir.
    }

    //Example 2: Verilen bir list'teki cift sayi olan elemanlarin tekrarsiz olarak kareleri carpimini hesaplayan method olusturunuz.
    public static int getMultiplicationOfSquareOfEvens (List<Integer> nums) {
        return nums.
                stream().
                filter(t -> t % 2 == 0).
                map(t -> t * t).
                distinct(). // kareler tekrarsız olmalı dedigi için kareleri aldıktan sonra kullandık.
                reduce(1, (t, u) -> t * u); //147456

    }
      //Example 3: Verilen bir list'teki cift sayi olan elemanlarin maximum degeri ile tek sayi olan elemanlarin minimum degerinin
     //           toplamini hesaplayan method'u olusturunuz.
    public static int getTheSumOfEvenMaxAndOddMin(List<Integer> nums) {
        int maxEven = nums.stream().distinct().filter(t -> t % 2 == 0).reduce((t, u) -> t > u ? t : u).get();
        int minOdd = nums.stream().distinct().filter(t -> t % 2 != 0).reduce((t, u) -> t < u ? t : u).get();
        return maxEven + minOdd;
    } // reduce() methodunu etkisiz eleman olmadan kullanınca CTE verdi. Çözüm için Optional data type'ında olması gerekiyor ama biz kullanmadık. get() method'u Optional<Integer> i Integer'a cevirir.

    //Example 4: Verilen bir list'teki cift sayi olan elemanlarin 7 den kucuk maximum degeri ile tek sayi olan elemanlarin
    //           8 den buyuk minimum degerinin toplamini hesaplayan method'u olusturunuz.
    public static int getTheSumOfEvenLessThanSevenMaxAndOddMinGreaterThanEight(List<Integer> nums) {
        int max = nums.stream().distinct().filter(t -> t % 2 == 0 && t < 7).reduce((t, u) -> t > u ? t : u).get();
        int min = nums.stream().distinct().filter(t -> t % 2 != 0 && t > 8).reduce((t, u) -> t < u ? t : u).get();
        return max + min;
    }
}

