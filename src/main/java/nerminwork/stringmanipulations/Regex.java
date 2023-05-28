package nerminwork.stringmanipulations;

public class Regex {
    public static void main(String[] args) {

        String b = "Java 1235 ?!@$_";

        // \\d ifadesi tum rakamlari(digit) temsil eder.

        System.out.println(b.replaceAll("\\d","*"));
        System.out.println(b);

        // ===>  \\D rakamlar disindaki her sey

        System.out.println(b.replaceAll("\\D","*"));

        //==> \\S space disindaki her sey

        System.out.println(b.replaceAll("\\S","*"));

        //==> \\s space ifadesidir.

        System.out.println(b.replaceAll("\\s","*"));

        // replace ile yapma
        System.out.println(b.replace(" ","*"));

        //==>  \\w ifadesi (word->kelime ve harf) a-z A-Z 0-9 _  bunlari kapsar

        System.out.println(b.replaceAll("\\w","*"));

        //==>  \\W ifadesi a-z A-Z 0-9 _ disindakileri kapsar

        System.out.println(b.replaceAll("\\W","*"));

    }
}
