package javaders.day18constructorsstatickeyword;
         /*
            1) Constructor nasıl olusturulur?
                Access Modifier + Class İsmi + () + { }
            2) Method ile Constructor arasındaki farklar nelerdir ?
                i) "Method"larda return type olur. "Constructor"larda olmaz.
                ii) "Method"lar yaptıkları ise göre isimlendirilirler. "Constructor"lar ise her zaman "Class" ismiyle isimlendirilirler.
                iii) "Method"lar bir aksiyon yapmak için olusturulur. "Constructor"lar ise object olusturmak içindir.
                iiii) "Method" isimleri kucuk harfle baslar. "Constructor" isimleri class ismiyle aynı oldugu için buyuk harfle baslar.
            3) Parametreli Constructor olusturarak aynı classtan farklı ozelliklere sahip object'ler olusturabiliriz.

        */
public class Car {

    String make = "Honda";
    String model = "Accord";
    int year = 2021;
    int price = 18000;

    // ************   Default Constructor   *************
    // Default Constructor'lar parametre kullanmazlar.
    // Default Constructor'ların bodysi bostur.
    // Java kıskanctır. Siz default constructor'ı elle yazdıgınızda Java Object constructor'ı kullandırtmaz.

    public Car (){


    }
    // Custom Constructor
             public Car(String make, String model, int year, int price) {
                 this.make = make;
                 this.model = model;
                 this.year = year;
                 this.price = price;
    }

        // Custom Constructor


             public Car(String make) {
                 this.make = make;
             }

             public Car(String make, int price) {
                 this.make = make;
                 this.price = price;
             }//Constructor olusturduk

             public Car(String make, String model) {
                 this.make = make;
                 this.model = model;
             }//Constructor olusturduk

         }

