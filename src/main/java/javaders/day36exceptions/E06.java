package javaders.day36exceptions;

import java.io.FileInputStream;

import java.io.FileInputStream; // io == input-output
import java.io.FileNotFoundException;
import java.io.IOException;
public class E06 {

    /*
        1) FileNotFoundException ve IOException Compile Time Exceptionlardır. Yani kodu yazarken hata alırız.
        2) FileNotFoundException path'in dogrulugu ve dosyanın varlıgı ile ilgilidir.
           IOException tum input ve output islemleri ile ilgilidir.
        3) IOException Class, FileNotFoundException Class'ın parent'ıdır.
        4) İstenirse FileNotFoundException yerine IOException da kullanılabilir.
        5) IOException Class ve FileNotFoundException beraber kullanılacaksa child olan FileNotFoundException üstte parent olan
           IOException altta kullanılmalıdır.
     */
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("src/main/java/day36exceptions/file.txtp");
            int k=0;
            while ((k=fis.read())!=-1){
                System.out.print((char) k);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Path is wrong or the file does not exist");
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
 /* SH
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
     */