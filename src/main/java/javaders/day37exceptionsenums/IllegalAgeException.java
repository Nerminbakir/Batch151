package javaders.day37exceptionsenums;

public class IllegalAgeException extends RuntimeException {

    /*
       Eger RunTime Costum Exception üretmek isterseniz RuntimeException Class'a extend etmelisiniz.
       Eger Compile Time Costum Exception üretmek isterseniz Exception Class'a extend etmelisiniz.
     */

    public IllegalAgeException() {
        super();
    }
    public IllegalAgeException(String message) {
        super(message);
    }
}
