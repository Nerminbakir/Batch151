package javaders.day28interface;

        /*
            1) Child  Parents
               Class     --> Class     : extends
               interface --> interface : extends
               Class     --> interface : implements
               interface --> Class     : Olamaz...
               Aynı ise "extends", farklı ise "implements" kullan.
               "interface"i Class'ın child'i yapma

               abstract class ile interface arasındaki farklar
           1) Abstract Class'lar hem abstract hemde "concrete method"lar içerebilir.
              Fakat interface'ler sadece "abstract" method içerir.
              Ama interface'lerde istersek "default" ve "static" keyword'lerini kullanarak concrete method" uretebiliriz.
           2) Abstract Class'lar multiple inheritance'i desteklemez ama interface'ler destekler.
           3) Abstract Class'lar içinde her turlu variable olusturulabilir, interface'ler icindeki variable'lara public, static ve final olmak zorundadır.
           4) "interface" Class'ın child'i olamaz ama "abstract class" class'in child'i olabilir.
           5)  Abstract Class'larda constructor vardır ama object uretemez, interface'lerde constructor yoktur bu yuzden object uretilemez.





         */
public interface Mammal extends Animal{

        String feedBaby = "Milk";
        int age = 6;
}
