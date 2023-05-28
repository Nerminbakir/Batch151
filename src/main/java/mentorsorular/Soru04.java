package mentorsorular;

import java.util.Scanner;

public class Soru04 {
    public static void main(String[] args) {
        /*
            Soru-4: Kullanicidan IT alanini bilgisini alarak console'a  meslegi için;
	        qa ==> Quality Analyst
		    dev ==> Developer
			ba ==> Busines Analyst
			pm ==> Project Manager
		    seklinde bilgilerini yazdiriniz
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("IT alan bilginizi giriniz");
        String s = scan.next();

        if (s.equalsIgnoreCase("QA")) {
            System.out.println("Quality Analyst");
        } else if (s.equalsIgnoreCase("DEV")) {
            System.out.println("Developer");
        } else if (s.equalsIgnoreCase("BA")) {
            System.out.println("Business Analyst");
        } else if (s.equalsIgnoreCase("PM")) {
            System.out.println("Project Manager");
        }else {
            System.out.println("hatalı giris");
        }







    }
}