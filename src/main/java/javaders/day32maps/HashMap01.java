package javaders.day32maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

        /*
            MY NOTES:
                Map'lerde sozluklerdeki gibi kelime ve manasi seklinde bir kullanim vardir.
                "key" kismi tekrarsiz, "value" tekrarli olabilir.
                Map'ler "key" ve "value" structure'ini (yapısını) kullanir.
                Map'lerdeki elemanlara "Entry" denir. (Teknik isim)
                Elemanlarin tamanina ise "EntrySet" denilir.
                "key"ler tekrarsız oldugu için her "entry" birbirinden farklıdır.
                "Entry"ler tekrarsiz oldugu icin "EntrySet" denilir. Java tekrarsız elemanları setlerin içine koyar.
                "Key" ve "Value" lar ayri ayri data type'larinda olabilirler.
                "Map"'ler Collection degildir, farkli bir yapidir.

                HashMap'ler "entry"leri rastgele siralar, bu yuzden en hizli map'dir.
                Bazen sadece key'lerle calısmak isteriz bu yuzden keySet() methodunu kullanırız.
                Bazen sadece value'larla calısmak isteriz bu yuzden values() methodunu kullanırız.
                Bazen Map'i loop içinde kullanmak isteriz bu yuzden entryset() methodunu kullanırız.

                Map'ler 3 e ayrılır. HashMap, HashTable, TreeMap
         */

public class HashMap01 {

    public static void main(String[] args) {

        //Map nasil olusturulur?
        HashMap<String, Integer> countryPopulation = new HashMap<>();

        //Map'e entry nasil eklenir?
        countryPopulation.put("Germany", 83000000);
        countryPopulation.put("Albania", 3000000);
        countryPopulation.put("USA", 400000000);
        countryPopulation.put("Turkiye", 83000000);
        countryPopulation.put("Netherland", 18000000);
        System.out.println(countryPopulation);//{Turkiye=83000000, Netherland=18000000, USA=400000000, Germany=83000000, Albania=3000000}

        // get() methodu "key" ile calisir ve "value" kismini verir
        int usaPopulation = countryPopulation.get("USA");
        System.out.println(usaPopulation);//400000000

        //Butun "key"leri nasil alabiliriz?
        Set<String> keys = countryPopulation.keySet(); // keySet(); methodunun üzerine tıklayıp içine girince hangi data type'ı ile calısmamız gerektigini bize verir.
                                                       // public Set<K> keySet() ==> Set(K==> yerine kullandıgımız data type yazdık)
        System.out.println(keys);// [Turkiye, Netherland, USA, Germany, Albania]

        //Butun "value"lari nasil alabilirim?
        Collection<Integer> values = countryPopulation.values(); // values() methodu bize Collection verir.
        System.out.println(values);// [83000000, 18000000, 400000000, 83000000, 3000000]

        //Example 1: countryPopulation map'indeki ulkelerin nufuslarinin ortalamasi nedir?
        Collection<Integer> value = countryPopulation.values();
        int sum = 0;
        for (Integer w : value) {
            sum = sum + w;
        }
        System.out.println(sum / value.size());//117400000

        //entrySet() "entry"leri kalip halinde alip bize "Set"in icine koyarak verir
        //Loop'lar map'ler ile kullanilamaz. Sadece entry'ler arasinda gezmek istedigimizde loop kullanabiliriz.

        Set<Map.Entry<String, Integer>> entries = countryPopulation.entrySet();
        System.out.println(entries);// [Turkiye=83000000, Netherland=18000000, USA=400000000, Germany=83000000, Albania=3000000]

        //Example 2: countryPopulation Map'indeki ulkelerin isimlerinin character sayisi ile nufuslarinin toplamini bulunuz.
        int toplam = 0;

        for (Map.Entry<String, Integer> w : entries) {
            toplam = toplam + w.getKey().length() + w.getValue();
        }
        System.out.println(toplam);//587000034
    }
}