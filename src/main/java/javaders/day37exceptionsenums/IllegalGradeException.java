package javaders.day37exceptionsenums;

public class IllegalGradeException extends Exception{

    /*
        1) Custom Exception Class olusturmak için extend etmeliyiz.
           Exception Class'a extend ederek olusturdugunuz Custom Exception "Compile Time Exception" olur.

        2) Custom Exception Class olustururken constructor olusturmalısınız.
           Bu constructor parent'taki constructor'ı cagırmalıdır.
           Bu constructor mesaj verecek ya da vermeyecek sekilde olusturulabilir.

        3) Custom Exception Class olusturdugunuzda ismin sonunda "Exception" kelimesini kullanmalısınız.
           IllegalGradeException oldugu gibi.
     */

    public IllegalGradeException(String message) {
        super(message);
    }

    public IllegalGradeException() {
        super();
    }


}
