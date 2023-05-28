package javaders.day18constructorsstatickeyword;


public class StudentRunner {

    public static void main(String[] args) {

        // static olan "numOfRegisteredStd" variable'ini cagirmak için sadece class ismini kullandık, object olusturmadık.

        System.out.println(Student.numOfRegisteredStd); // 0

        // static olmayan "num" variable'ini cagirmak için object olusturduk.
        Student s1 = new Student();
        System.out.println(s1.num); //

        // static olan "numOfRegisteredStd" variable'ina object uzerinden de ulasabilirsiniz ama bu hatadır.
        System.out.println(s1.numOfRegisteredStd);




    }
}
