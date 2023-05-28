package nerminwork.swich;

public class Switch04SHD {

    public static void main(String[] args) {

        /*
        Ay numarasi verildiginde numarasi verilen ay'in ismini
        ve December'a kadarki tum aylarin isimlerini console'a yazdiran kodu yaziniz.
         */

        int monthNumber =3;

        switch (monthNumber){
            case 1:
                System.out.println("January");
            case 2:
                System.out.println("February");
            case 3:
                System.out.println("March");
            case 4:
                System.out.println("April");
            case 5:
                System.out.println("May");
            case 6:
                System.out.println("June");
            case 7:
                System.out.println("July");
            case 8:
                System.out.println("August");
            case 9:
                System.out.println("September");
            case 10:
                System.out.println("October");
            case 11:
                System.out.println("November");
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month number");
        }

        /*
        Note: switch parentezi icinde "String", "int", "byte", "short" ve "char" kullanilabilir.
              "boolean", "float", "double", "long" kullanılmaz
         */




    }//m
}//c
