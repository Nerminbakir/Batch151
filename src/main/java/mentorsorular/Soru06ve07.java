package mentorsorular;
import java.util.Scanner;
public class Soru06ve07 {
    public static void main(String[] args) {


       // Soru-6: Kullanıcıdan aldığınız koordinat noktasının hangi bölgede olduğunu yazdıran bir kod yazınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("X ve Y degerleriniz giriniz : ");
        int x = scan.nextInt();
        int y = scan.nextInt();

        if (x>0 && y>0){
            System.out.println("girdiginiz degerler 1. bölgeye ait");
        }else if (x<0 && y>0){
            System.out.println("girdiginiz degerler 2. bölgeye ait");
        }else if (x<0 && y<0){
            System.out.println("girdiginiz degerler 3. bölgeye ait");
        }else if (x>0 && y<0){
            System.out.println("girdiginiz degerler 4. bölgeye ait");
        }else if (x!=0 && y==0){
            System.out.println("girdiginiz degerler x ekseni uzerinde");
        }else if (x==0 && y!=0){
            System.out.println("girdiginiz degerler y ekseni uzerinde");
        }else System.out.println("girdiginiz degerler orjin'dedir");

         /*
        Soru-7: Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada hatali giris seklinde code create ediniz

         */


        System.out.println("Bir harf giriniz");
        char ch = scan.next().charAt(0);

        if (ch>='a' && ch<='z'){
            System.out.println("Kucuk Harf");
        } else if (ch>='A' && ch<='Z') {
            System.out.println("Buyuk Harf");
        }else{
            System.out.println("Harf degil");
        }

    }
}
