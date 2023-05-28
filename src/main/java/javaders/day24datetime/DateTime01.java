package javaders.day24datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class DateTime01 {

    public static void main(String[] args) {

        // Icinde bulundugumuz zaman dilimindeki tarihi verir.
        LocalDate myCurrentDate = LocalDate.now(); // class uzerinden method cagırdıgımız icin statictir.
        System.out.println(myCurrentDate); // 2023-03-21

        // Tarihten istedigimiz bileseni nasıl alırız?
        int monthValue = myCurrentDate.getMonthValue();
        System.out.println(monthValue); // 3

        int yearValue = myCurrentDate.getYear();
        System.out.println(yearValue); // 2023

        int dayValue = myCurrentDate.getDayOfMonth();
        System.out.println(dayValue); // 21

        // month bir enum dır.
        // Enum, Javada sabit degerleri (Ay isimleri, sehir isimleri, ulkedeki sehir isimleri) depolamak icin kullanılır.
        Month monthName = myCurrentDate.getMonth();// obje uzerinden method cagırdıgımız icin non statictir.
        System.out.println(monthName); // MARCH

        DayOfWeek dayName = myCurrentDate.getDayOfWeek();
        System.out.println(dayName); // TUESDAY

        // İleriki tarihe nasıl gidilir?
        System.out.println(myCurrentDate.plusDays(13).plusMonths(1).plusYears(2)); // 2025-05-03

        // Gecmis tarihe nasıl gidilir?
        System.out.println(myCurrentDate.minusYears(2).minusMonths(1).minusDays(13)); // 2021-02-08

        // Specific bir tarih objesi nasıl olusturulur?
        LocalDate date1 = LocalDate.of(1980,8,10);
        LocalDate date2 = LocalDate.of(1985,7,19);

        // Bir tarihin baska bir tarihten sonra olup olmadıgını nasıl kontrol ederiz?
        boolean r1 = date1.isAfter(date2);
        System.out.println(r1); // false

        boolean r2 = date1.isBefore(date2);
        System.out.println(r2); // true

        boolean r3 = date1.isEqual(date2);
        System.out.println(r3); // false

        // Example 1 : Kullanıcıdan aldıgınız tarih gecmise ait ise "Gecersiz Tarih Girdiniz" mesajı veriniz.
        // Gelecege ait ise "Zamanı Girebilirsiniz" mesajı veriniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter year, month and day numbers in the given order");
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();

        LocalDate givenDate = LocalDate.of(year,month,day);

        if (givenDate.isBefore(LocalDate.now())){
            System.out.println(givenDate + " Invalid Date");
        }else{
            System.out.println("Enter time for the ticket");
        }

        System.out.println("givenDate.lengthOfMonth() = " + givenDate.lengthOfMonth());

        // Example 2 : Kullanıcının girdigi tarihin gun ismini bulan kodu yazınız.
        System.out.println("Please enter year, month and day numbers in the given order");
        int y = input.nextInt();
        int m = input.nextInt();
        int d = input.nextInt();

        LocalDate date = LocalDate.of(y,m,d);
        System.out.println(date.getDayOfWeek());

    }
}
