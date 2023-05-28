package javaders.day20methodoverloadingarraylist;


import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists01 {

    /*
       1)Ayni data type'indeki coklu data'lari depolamak icin Array kullaniriz.
       2)Array'lerin bir negatif yonu var; icine koyacaginiz eleman sayisini en basta belirlemek zorundasiniz.
       3)Array'ler eleman sayisinda esnek degildirler, bu yuzden Java "ArrayList" adli yeni bir yapi olusturdu,
         bu yapi eleman sayisinda esnektir. Hic eleman koymazsaniz eleman sayisini sifir olarak ayarlar, 1000
         eleman koyarsaniz eleman sayisini 1000 olarak ayarlar.
       4)"ArrayList" yerine sadece "List" de diyebiliriz.
       5)Java "ArrayList"leri olusturduktan sonra Array'leri iptal etmedi cunku;
           i)Array'ler super hizlidir.
           ii)Array'ler memory'de coook az yer kaplar.
       6)Array'ler "primitive data" type'lari ve "reference"lari depolayabilir ama "ArrayList" ler "non-primitive" data type'larini
         depolar bu yuzden "ArrayList" ler Array'lerden daha cok yer kaplar.
    */
    public static void main(String[] args) {

        // ArrayList nasıl olusturulur?

        //ArrayList<int> ages = new ArrayList<int>(); seklinde yazdıgımızda int CTE verdi.Diamond içerisine primitiveler yazılmaz.
        //WrapperClass'lar yazılır.

        ArrayList<Integer> ages = new ArrayList<Integer>();

        // ArrayList console'a nasıl yazdırılır?

        System.out.println(ages); // [ ]

        // ArrayList'lere eleman nasıl eklenir?

        // ArrayList'e eleman eklemek için add() methodunu kullanırız.
        // add() methodu sizin verdiğiniz sırada List'e ekler. (insertion order)

        ages.add(9);
        ages.add(12);
        ages.add(10);
        System.out.println(ages); // [9, 12, 10]
        ages.add(1,656);
        System.out.println(ages); // [9, 656, 12, 10]
        ages.add(3,777);
        System.out.println(ages); // [9, 656, 12, 777, 10]
        ages.add(888); // (insertion order)
        System.out.println(ages); // [9, 656, 12, 777, 10, 888]

        // List'e coklu eleman nasıl eklenir? veya baska bir List nasıl eklenir?

        ArrayList<Integer> newAges = new ArrayList<>();

        newAges.add(8);
        newAges.add(9);
        newAges.add(10);

        ages.addAll(newAges);// addAll methoduyla newAges'i ages'e ekledik
        System.out.println(ages); // [9, 656, 12, 777, 10, 888, 8, 9, 10]

        ages.addAll(2,newAges);
        System.out.println(ages); // [9, 656, 8, 9, 10, 12, 777, 10, 888, 8, 9, 10]

        // ArrayListte eleman sayısı nasıl bulunur?
        // size() method'u bir List'teki elemean sayisini verir.

        int numOfElement = ages.size();
        System.out.println(numOfElement); // 12

        // ArrayList'te specific bir eleman nasıl alınır?
        // "get() methodu" index kullanarak istediğimiz elemanı almaya yarar.

        int el1 = ages.get(1);
        System.out.println(el1);//656

        // ArrayListte specific bir eleman nasıl degiştirilir?

        ages.set(2,313);
        System.out.println(ages); // [9, 656, 313, 9, 10, 12, 777, 10, 888, 8, 9, 10]
        ages.set(4,353);
        System.out.println(ages); // [9, 656, 313, 9, 353, 12, 777, 10, 888, 8, 9, 10]

        // Bir Listteki tum elemanlar nasıl silinir?

        ages.clear();
        System.out.println(ages); //[]

        // ArrayListte specific bir elemanın olup olmadıgını nasıl anlarız?

        boolean r = ages.contains(656);
        System.out.println(r); // false ==> clear methodu ile sildik

        // Bir ArrayListin bos olup olmadıgını nasıl kontrol ederiz?
        //isEmpty() methodu ArrayList bos ise true, bos degilse false dondurur.

        boolean r2 = ages.isEmpty();
        System.out.println(r2); // true

        // Example = Bir listin bos olup olmadıgını kontrol eden kodu yazınız.

        ArrayList<String> names = new ArrayList<>();

        names.add("Pervin");
        names.add("Nermin");
        names.add("Nuran");
        names.add("Yaprak");

        // 1.Way -- burada 2 iş var

        if (names.size()==0){
            System.out.println("List is empty");
        }else {
            System.out.println("List has at least 1 element");
        }

        names.clear();

        // 2. Way (Recommended--tavsiye edilen)

        if (names.isEmpty()){
            System.out.println("List is empty");
        }else {
            System.out.println("List has at least 1 element");
        }

        // Bir listin baska bir list ile aynı olup olmadıgını nasıl kontrol ederiz.
        // İki listin esit olabilmesi için aynı indexde aynı elemanlar olmalıdır.
        ArrayList<String> names1 = new ArrayList<>();

        names1.add("Pervin");
        names1.add("Nermin");
        names1.add("Nuran");
        names1.add("Yaprak");

        ArrayList<String> names2 = new ArrayList<>();

        names2.add("Yaprak");
        names2.add("Nermin");
        names2.add("Nuran");
        names2.add("Pervin");

        boolean s = names1.equals(names2);
        System.out.println(s); // false

        // Verilen iki integer listte tamamıyla aynı elemanların olup olmadıgını kontrol eden kodu yazınız.

        ArrayList<Integer> nums1 = new ArrayList<>();

        nums1.add(8);
        nums1.add(10);
        nums1.add(9);

        ArrayList<Integer> nums2 = new ArrayList<>();

        nums2.add(8);
        nums2.add(9);
        nums2.add(10);

        Collections.sort(nums1);
        Collections.sort(nums2);

        System.out.println(nums1.equals(nums2)); // true


    }


}
