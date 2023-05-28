package practices.day05practices;

public class ButceRunner {

    public static void main(String[] args) {


    Butce baba = new Butce();
    System.out.println("Maas öncesi Butce " + Butce.butce);//0
    baba.maasAl(30000);
    System.out.println("Maas sonrası Butce " + Butce.butce);//30000
    baba.harclikAl(100);
    baba.harcliktanHarca(80);
    System.out.println("Harcama sonrası Butce " + Butce.butce);//29900
    System.out.println(baba.harclik); //20

    Butce anne = new Butce();
    System.out.println("Maas öncesi Butce " + Butce.butce);//29900
    anne.maasAl(50000);
    System.out.println("Maas sonrası Butce " + Butce.butce);//79900
    anne.harclikAl(500);
    anne.harcliktanHarca(500);
    System.out.println("Harcama sonrası Butce " + Butce.butce);//79400
    System.out.println(anne.harclik); //0

    Butce cocuk = new Butce();
    cocuk.harclikAl(200);
    cocuk.harcliktanHarca(180);
    System.out.println("Harcama sonrası Butce " + Butce.butce);//79200
    System.out.println(cocuk.harclik); //20


    }
}
