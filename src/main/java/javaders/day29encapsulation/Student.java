package javaders.day29encapsulation;

public class Student {

    // Encapsulation ==> kelime anlamı kapsülleme demektir.
    // Encapsulation Data Hiding (Veri Saklama)
    // Data nasıl saklanır?
    // Access Modifier'larını private yaparak datayı diger classlardan görünmez hale getirerek datayı saklarız.

    private String stdId = "AC2023102t";
    public int age = 19;

    private double notOrt = 3.53;
    private boolean succesful = false;

    // Encapsulation yaptıgımız datayı istersek diger classlardan okuyabiliriz.
    // Nasıl okuruz ?
    // "get method" olusturarak Encapsulation edilmis datanın degerini okuyabiliriz.

    // "get method"lar public olur.
    // get methodun return type'i okudugu variable'in return type'i ile aynı olur.
    // get method bir boolean variable için olusturulduysa eger ismi "is" ile baslar.
    public String getStdId(){
        return stdId;
    }

    public double getNotOrt() {
        return notOrt;
    }

    public boolean isSuccesful() {
        return succesful;
    }
    /*
        Encapsulation yaptıgımız datayı istersek diger classlardan degistirebiliriz.
        Nasıl degistirebiliriz?
        "set method" olusturarak Encapsulate ettiğimiz datanın degerini degistirebiliriz.
            a) "set method"ları her zaman public olur.
            b) "set method"ların return type'i her zaman void olur.
            c) "set method" parametre kullanır, parametrenin data type'i variable ile aynı olmak zorundadır.

        set method kullanarak var olan object üzerinden degisiklikler yaparak o object'i sanki yeni bir
        objectmis gibi kullanabiliriz.

      get methodların diger adı "getter", set methodların diger adı "setter"dir.
     */

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setNotOrt(double notOrt) {
        this.notOrt = notOrt;
    }

    public void setSuccesful(boolean succesful) {
        this.succesful = succesful;
    }
}
