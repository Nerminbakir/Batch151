package javaders.day36exceptions;

public class E02 {
    public static void main(String[] args) {

        String s = "Java";
        getNumberOfChars(s); // 4

        String t = "";
        getNumberOfChars(t); // 0

        String u = null;
        getNumberOfChars(u); // NullPointerException
    }

    // String'in degeri "null" oldugunda string class daki bazı methodları kullanmaya calısırsanız java NullPointerException atar.
    public static void getNumberOfChars (String s){
        try{
            int numOfChars = s.length();
            System.out.println(numOfChars);
        }catch (NullPointerException e) {
            System.out.println("null degeri için bazı methodlar kullanılamaz");

        }
    }
}
