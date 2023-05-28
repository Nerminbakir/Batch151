package javaders.day32maps;

import java.util.HashMap;

public class HashMap02 {
    public static void main(String[] args) {
        /*
        Maplerde keyler tekrarsiz olmali, ama valueler tekrarli olabilir.
        Maplerde key ve valueler {} icine konulur.
        Eger key tekrarli kullanilirsa kod hata vermez,
        ancak tekrarli olarak yazilan key'in en son ekleneni alir,onu yazdirir.
        Key'in yeni degerini (value) alir. Ornek "Tom" 76 idi, ikinci eklemede "Tom" 83 oldu ve sonucta
        "Tom" 83 olarak yazildi. Bu yontem VALUE GUNCELLEME'de tavsiye edilmese de kullanilabilir.
         */

        HashMap<String, Integer> stdAges = new HashMap<>();

        stdAges.put("Ajda", 77);
        stdAges.put("Ezel", 38);
        stdAges.put("Tom", 76);
        stdAges.put("Brad", 58);
        stdAges.put("Angelina", 58);
        // "key"i tekrarlı kullandıgımızda hata vermez. en son verilen entry'nin degerini kabul eder.
        // Bu yöntem value güncellemede kullanılabilir. Buna "overwrite" (üstüne yazma) denir.
        stdAges.put("Tom", 83);

        // Hashmap'ler entry'leri rastgele sıralar. Bu yuzden cok hızlı calısır.
        // Map'ler entry'leri sıralarken key'lere bakarak sıralama yapar. Value'ları dikkate almaz.

        System.out.println(stdAges); // {Tom=83, Angelina=58, Ajda=77, Brad=58, Ezel=38}

        // replace() methodu "value"ları key'leri kullanarak update etmeye yarar.
        // value'ları degistirmek istedigimizde put() methodu yerine replace() methodu kullanırız.
        stdAges.replace("Ezel", 39);
        System.out.println(stdAges); // {Tom=83, Angelina=58, Ajda=77, Brad=58, Ezel=39}

        // replace("Angelina", 58, 61) methodu Map'in içinde "Angelina", 58 varsa 58'i 61'e dönüstürür. Yoksa dönüstürmez.
        stdAges.replace("Angelina",58,61);
        System.out.println(stdAges); // {Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39}

        // putIfAbsent("Ali", 60); methodu Map'de "Ali" key olarak yoksa Map'e "Ali=60"i ekler, "Ali" key olarak varsa eklemez.
        stdAges.putIfAbsent("Ali", 60);  // putIfAbsent == yoksa ekle
        System.out.println(stdAges); // {Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39, Ali=60}

        // getOrDefault("Ayse", 0) methodu Map'te var olan key'ler için get () methodu ile aynı cıktıyı verir.
        // getOrDefault("Ayse", 0) methodu Map'te var olmayan key'ler için ikinci parametreye koydugunuz degeri, "get() methodu" ise null verir.
        System.out.println(stdAges.get("Tom")); // 83
        System.out.println(stdAges.getOrDefault("Tom", 0)); // 83

        System.out.println(stdAges.get("Ayse")); // null
        System.out.println(stdAges.getOrDefault("Ayse", 0)); // 0

        //containsValue(77); methodu value'lari icerisinde 77'nin olup olmadigini kontrol eder.
        System.out.println(stdAges.containsValue(77)); // true
        System.out.println(stdAges.containsValue(99)); // false

        //containsKey("Ali"); methodu key'lerin icerisinde Ali'nin olup olmadigini kontrol eder.
        System.out.println(stdAges.containsKey("Ali")); // true

        // remove("Ali"); methodu "key" kullanarak "entry"i silmeye yarar.
        stdAges.remove("Ali");
        System.out.println(stdAges); // {Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39}

        // remove("Tom",81); methodu Map'te key'si "Tom", value'su 81 olan bir entry varsa onu siler, yoksa silmez.
        stdAges.remove("Tom",81);
        System.out.println(stdAges); // {Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39}

        HashMap<String, Integer> kidsAge = new HashMap<>();
        kidsAge.put("John", 12);
        kidsAge.put("Jim", 22);
        kidsAge.put("Jack", 32);


        // stdAges.putAll(kidsAge); methodu stdAges Map'ine kidsAge Map'ini ekler. Dolayısıyla stdAges Map'i degismis olur.
        // Ama kidsAge Map'i degismez.
        stdAges.putAll(kidsAge);
        System.out.println(stdAges); // {Tom=83, Angelina=61, John=12, Ajda=77, Brad=58, Jack=32, Ezel=39, Jim=22}
        System.out.println(kidsAge); // {John=12, Jack=32, Jim=22}


    }
}
