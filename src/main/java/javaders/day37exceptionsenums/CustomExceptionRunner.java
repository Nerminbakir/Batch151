package javaders.day37exceptionsenums;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomExceptionRunner {

    /*

        1) try kullandıgımızda her senaryo için calısmasını istedigimiz kodları "finally block" içine koyarız.
        2) "final", "finally", "finalize" acıklar mısınız?
            "finalize" : "Garbage Collector" memory'i temiz tutmak için surekli memory'i tarar ve silinmesi gerekenleri siler.
                         "Garbage Collector" silmeden önce silecegi dataları "finalize" eder sonra siler.


        finalize:  Memory'e lazim olanlari koymaliyiz. Ucuz televizyon bulduk diye 10 televizyon alip eve koymayiz.
        Java, memory'i temiz tutar. Surekli olarak memory'i tarar ve fazlalik bulursa onu siler. "Garbage Collector"
        bu isi yapar. Java silinmesi gerekenleri once bir posete koyar, onu baglar ve cope atar gibi bir islem yapar.
        Iste bu isleme finalise denir.
     */

    public static void main(String[] args) throws IllegalGradeException {

        // System.out.println(getGrades());

        try{
            printAge(-45);
        }catch (IllegalAgeException e){
            System.out.println(e.getMessage()); // bizim ekledigimiz message'yi yazdırır.
        }finally {
            System.out.println("I always work");
        } // try kullandigimizda, finally block, exception olsa da olmasa da calisir.
        // Her senaryo icin calismasini istedigimiz kodlari finally block kullanarak saglamis oluruz.
        // try catch'siz sadece finally ile kullanilabilir. Genelde try catch ve finally birlikte kullanilir.


    }
    //Example 1: Ogrenci notlarini bir List'e ekleyen method'u olusturunuz
    public static List<String> getGrades() throws IllegalGradeException {

        List<String> grades = new ArrayList<>();
        String grade = "";

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Please enter the grade. To stop entering press q.");
            grade = input.next();

            int intGrade = 0;

            if(!grade.equals("q")) {
                intGrade = Integer.valueOf(grade);
            }

            if(grade.equals("q")){
                break;
            } else if(intGrade>=0 && intGrade<=100){
                grades.add(grade);
            }else{
                throw new IllegalGradeException("Grades less than zero and greater than 100 are not valid.");
            }

        }while(!grade.equals("q"));

        return grades;
    }

    // Example 2 : Kullanıcının yasını console!a yazdıran methodu olusturunuz.

    public static void printAge(int age){
        if(age<0){
            throw  new IllegalAgeException("Ages cannot be negative");
        }
        System.out.println(age);
    }

}

/*      Example 1 :
            do{} icinde enter the grade mesajimizi kullanicidan String alacak sekilde aldık.
            Listlerimizi String yaptik. Boyle olunca if statement icini String'e uygun bir sekle cevirmemiz gerekti.
            Integer Wrapperclassina giderek valueOf () methodunu aldik ve grade'i Integer'a cevirmis olduk.
            Bu durumda if(intGrade>=&& intGrade<=100) olmasi sorun olmayacak.
            Kullanicinin girdigi 'q' degilse loop devam edecek.
            Do icindeki String grade="";'in kizardigini gorunce orada bir scope hatasi oldugunu anlayarak,
            String'imizi do loop'unun disina cikardik. Problemle karsilasinca cozmeye calisiriz.
            Baska bir problem olustu. If icinde intGrade'ler kizardi.
            Yine scope problemi oldugunu anlayarak int intGrade=0;'a cevirerek scope disina cikardik.
            Kodu calistirinca sirasiyla sayilar girdik.'q'ya varincaya kadar devam etti.
            'q'ya baisnca list icine 'q'yu dahil etti. Bunu engellemek icin kodumuzu gelistirdik.
            ilk if'imizi else kismina yerlestirdik. Ilk if icine !grade.equals("q")'yu yazdik.
            Bu sayede 'q'ya basinca onceki sayilari liste ekledi ancak artik 'q'yu listte gormedik.
 */