package javaders.day38enumsiterators;

public class EnumRunner {
    public static void main(String[] args) {

        String capitalOfIllionis = UsStatesEnum.ILLINOIS.getCapital();
        System.out.println(capitalOfIllionis); // Springfield

        String abbreviationOfFlorida = UsStatesEnum.FLORIDA.getAbbreviation();
        System.out.println(abbreviationOfFlorida); // FL

        UsStatesEnum state = UsStatesEnum.ALASKA;
        System.out.println(state); // ALASKA normalde Alaska String gibi duruyor ancak onu String yapinca kizardi. Variable tipini degistirme uyarisini sectik
        // ve duzeldi. String yerine enum'in ismi yazildi. Ornek: UsStatesEnum state=UsStatesEnum.Alaska

        String stateName = UsStatesEnum.getStateNameByUsingAbbreviation("AK");
        System.out.println(stateName);

        String abbreviationOfAlaska = UsStatesEnum.getAbbreviationForStateName("Alaska");
        System.out.println(abbreviationOfAlaska);

    }
}
/*
Ya da state ismi verip baskentini alacagimiz bir method da olusturabiliriz.
Enum'i olusturduk ve onu kullanmak icin ayni package icinde Enum Runner Class'i olusturduk.
Bir statetin baskentine ihtiyac duydugumuzda, UsStatesEnum yanina nokta koyunca statesleri sirali halde
gorebildik. Ornegin ILLINOIS'i sectik UsStatesEnum.ILLINOIS.getCapital() yazdik ve bunu bir Stringconteynerina assign ettik.
Sonra assign ettigimiz String'in ismini sout icine yazinca baskenti alabildik.
 */