package nerminwork.ifelse;

import java.util.Scanner;

public class İfElseİf03SH {

    public static void main(String[] args) {
        /*
        Kullanıcıdan notunu alın ve asagidaki kurallara göre ekrana A, B, C veya D yazdırın.
        1) 50'den az - D                    3) 60 (dahil) 80 arası - B
        2) 50 (dahil) 60 arası - C         4) 80 (dahil) 100 arası - A
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        int not = scan.nextInt();

        if (not<0){
            System.out.println("notunuzu giriniz");
        }else if (not<50){
            System.out.println("D");
        } else if (not<60) {
            System.out.println("C");
        }else if (not<80) {
            System.out.println("B");
        }else if (not<=100) {
            System.out.println("A");
        }else{
            System.out.println("notunuzu girinnnn");
        }


    }//main
}//class
