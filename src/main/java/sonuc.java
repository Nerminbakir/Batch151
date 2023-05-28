import java.util.Scanner;

public class sonuc {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Iki tamsayı giriniz");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int result = n1 > n2 ? n2 : n1;
        System.out.println(result);


        
        
        
    }



}




