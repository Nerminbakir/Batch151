package practices.day18practices;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class C02_Iterator {
     /*
       Bir Set olusturunuz icerisine int elemanlar ekleyiniz.
       set'deki cift elemanları iterator ile siliniz
     */

    public static void main(String[] args) {

        Set<Integer> st = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5)); // HashSet de yazabiliriz.

        System.out.println(st); // [1, 2, 3, 4, 5]

        Iterator itr = st.iterator(); // Setlerde index yapısı yoktur. Bu sebeple Iterator kullanılır.
                                      // List hariç hiçbir Collections üyesinde index yapısı yoktur.

        while (itr.hasNext()){ // iterator yanında eleman var mı kontrol ediyorum. Varsa true, yoksa false döndürecek
                               // true oldugu sürece while döngüsü devam edecek

        Object sayi = itr.next();

        if((Integer) sayi%2==0){
            itr.remove();
           }
        }
        System.out.println(st); // [1, 3, 5]


    }
}
/*
Bir list disindaki collection uyelerinde islem yapacaksak Iterator kullanabiliriz. Yani index yapisi olmayan collection uyelerinde kullanilabilir.

Bir Set olusturunuz icerisine int elemanlar ekleyiniz. Set'deki cift elemanları iterator ile siliniz.
Setlerde index yapisi yoktur ve dolayisiyla Iterator kullanabiliriz. Set bir interfacedir. Data turu olan Set constructor kismi tarafindan override edilmeli. Bu yuzden Set olustururken new sonrasinda dogrudan Set degil override islemi yapacak childlari secilir. Ornegin HashSet ya da TreeSet secmeliyiz.

Once bir Set olusturduk; Set<Integer> st=new TreeSet<>(Arrays.asList(1,2,3,4,5);
st isimli Set'imizi sout icinde st olarak yazinca ekranda Set'in elemanlari 1,2,3,4,5'i gorduk.

Daha sonra Iterator object'ini olusturduk;
Iterator itr=st.iterator(); Listler haric hicbir collections uyesinde index yapisi yoktur.
Sorumuzda Set yerine List denseydi Iterator kullanmaz for loop kullanirdik. Cunku List'de index yapisi
var.

Iterator object'ini olusturduktan sonra tum elemanlari kontrol edebilmemiz icin bir while loop kullanacagiz.
while icinde Iterator objectimizin ismi itr.hasNext() yazdik. Bu sekilde tum elemanlar kontrol edilecek.Iterator yaninda eleman oldugu surece while loop devam edecek sekilde bir sart yazdik while parantezi icine.
Iterator'a assign edilen Set;imiz icine bakilacak. En basa gelinir ve onunde bir eleman var mi diye bakilir, varsa true verir ve true oldugu surece while dongusu devam edecek. Ilk eleman 1, ve sonraki
elemanlara bakilacak. Bunu yapabilmesi yani bir adim daha ileri gidebilmesi icin itr.next(); yazdik. next ile bir sonraki elemanin onune gelinir. itr.next();'i once bir int variable'ina assign ettik ancak kizarma olunca Object'e assign edince sorun cozuldu. Object sayi=its.next();

Sonraki kisimda bir if statement kullandik. Cift sayilari bulabilmek ve silme icin if statement'i kullandik.
Object sayi icinde toplanan sayilari if statement icinde Integer yazarak, sayilari Integer'a cast ettik.
if((Integer) sayi%2==0){
itr.remove();  remove metodu, sayi cift oldugunda o sayiyi sildi. Cift degilse silmedi.
} ve sonra sout icine st yazdik. Kodu calistirinca bize sadece tek sayilari verdi.
 */