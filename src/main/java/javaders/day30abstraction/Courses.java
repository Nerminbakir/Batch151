package javaders.day30abstraction;

public abstract class Courses {

    public abstract void math();

     public void art(){
        System.out.println("Learn art");
    }


    /*
        1) Eger bir classtan object olusturulmasını istemiyorsak ve bu classı sadece
           child classların yapmak zorunda oldukları görevleri belirlemek için kullanıyorsak
           abstraction yaparız.
        2) Bazen parent classtaki methodun bodysi hic bir child tarafından kullanılmaz.
           Bu durumda parenttaki methoda body yazmak hic kullanılmadıgı için mantıklı degildir.
           Bizde o methoda body yazmayız.
        3) Bodysi yazılmayan methoda abstract method denir.
           Abstract vücutsuz ya da soyut anlamına gelir.
        4) Methodun bodysini yazmayınca java bize hata verir.
           Bizde abstract keywordunu kullanarak bu methodun bodysi olmayacak deriz.
        5) abstract keywordunu kullanınca elde ettigimiz abstract method normal classlara konulamaz.
           O yuzden classı da abstract yapmalıyız.
        6) Parenttaki method abstract ise butun child classlar o methodu override etmek zorundadır.
           Bu yuzden tum childlar için mecburi olmasını istedgimiz fonksiyonları abstract yapmak mantıklı bir secimdir.
        7) Bodysi olan methodlar (concrete method) abstract classların içine yazılabilir.
           abstract methodlar concrete classların içine yazılamazlar.
           Concrete Methodlar child classlar tarafından override edilmek zorunda degildir.
        8) abstract keyword ile method body bir methodda aynı anda kullanılamaz.
        9) final methodlar abstract olmazlar. final methodlar override edilemezler.
           Halbuki abstract methodlar override edilmek için olusturulurlar. Ve bu celişkidir.
           Bu yuzden java abstract mehodların final olmasına musaade etmez.
        10) abstract classların içinde abstract methodlar olur. Abstract methodlar bodysi olmadıgından
           eksik methodlar gibi düsünülebilir. Yani abstract class içinde eksik bir yapı barındırır.
           Siz abstract classtan object üretirseniz abstract class içindeki eksiklik objecte yansır.
           Java bunu istemez. Cunku eksik object eksik iş yapar. Bu da application'in yanlıs calısmasına sebep olur.
           Javada application'i korumak için abstract classlardan object üretilmeisni engellemistir.
       11) abstract classların constructorları vardır ama object olusturamazlar.
       12) abstract classların abstarct child'i veya concrete child'i olabilir.
       13) abstract methodlar private olamazlar. Cunku child classlar abstract methodları kullanırlar.
           private yapınca kullanıma kapalı olur. Bu celiskidir.
           Bu yuzden java abstract methodların private olmasına musaade etmez.

     */

}




