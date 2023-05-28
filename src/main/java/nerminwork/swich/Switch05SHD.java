package nerminwork.swich;

import java.util.Scanner;

public class Switch05SHD {
    public static void main(String[] args) {

        /*
        Kullanicidan aldiginiz character'in sesli harf olup olmadigini kontrol eden kodu yaziniz
        Sesli Harfler: a - e - i - o - u
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a letter");
        char letter = scan.next().charAt(0);


        //1.Yol
        switch (letter){
            case 'a' :
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A' :
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(letter + " is a vowel");
                break;
            default:
                System.out.println(letter + " is not a vowel");

        }


        //2.Yol
        System.out.println("Please enter a letter");
        String letter2 = scan.next().substring(0,1).toLowerCase();
        switch (letter2){
            case "a" :
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("It is a vowel");
                break;
            default:
                System.out.println("It is not a vowel");

        }
        //3.Yol

        System.out.println("Please enter a letter");
        String letter3 = scan.next().substring(0,1);
        switch (letter3){
            case "a" :
            case "e":
            case "i":
            case "o":
            case "u":
            case "A" :
            case "E":
            case "I":
            case "O":
            case "U":
                System.out.println(letter3 + " is a vowel");
                break;
            default:
                System.out.println(letter3 + " is not a vowel");

        }


    }//m
}//c
