package javaders.day36exceptions;

import java.io.FileInputStream; // io == input-output
import java.io.FileNotFoundException;
import java.io.IOException;

public class E05 {
    public static void main(String[] args) throws IOException { // Exception'ı method signature'a ekledik.

        FileInputStream fis = new FileInputStream("src/main/java/javaders/day36exceptions/file.txt");
        int k = 0;
        while ((k = fis.read())!=-1){ // okunacak bir sey kalmadıgında -1 yazdırır.
            System.out.print((char) k);
        }

    }
}


 /*
        1)Run Button'una bastiktan sonra console'da alinan Exception'lara "Runtime Exception" denir.
          ArithmeticException, NullPointerException, NumberFormatException, ArrayIndexOutOfBoundsException, StringIndexOutOfBoundsException
          "Runtime Exception" a ornektir.
          "Runtime Exception" lara "Unchecked Exception" da denir.

        2)Code yazarken kirmizi alt cizgi seklinde alinan Exception'lar da vardir, bunlara "Compile Time Exception" denir.
          FileNotFoundException, IOException "Compile Time Exception" a ornektir.
          "Compile Time Exception" lara "Checked Exception" da denir.

        3)FileNotFoundException: Java'ya bir dosyayi bul dedigimizde, Java "dosyanin adresi" ve "dosyanin varligi" konusunda
                                 hata olusursa ne yapmasi gerektigini soylemenizi ister.

        4)IOException: "IO" Input Output demektir.
                       Note: IOException, FileNotFoundException'in parent'idir.

        5)Java da hata'lar temelde 2 ye ayrilir.
            i)Exception'lar   ii)Error'lar: a)StackOverflow Error b)Out Of Memory Error  c)Virtual Machine Error


public static void main(String[] args) throws IOException {

        //1.Way: Exception'i mathod signature satirina ekledik
        FileInputStream fis = new FileInputStream("src/main/java/day36exceptions/TextFile");

        int i = 0;

        while((i = fis.read())!=-1){
        System.out.print((char)i);
        }

        }
 */
