package nerminwork.loops;

public class WhileLoop04SH {
    public static void main(String[] args) {

        /*
        3 basamaklı 4 ve 6 ya tam bölünebilen tamsayıları buyukten kucuge ekrana yazınız.
        Bu sayıların kac tane oldugunu da ekrana yazdırınız.
        */
        int i = 999;

        int counter = 0; //flag denir.

        while (i>=100){
            if (i%4==0 && i%6==00){
                System.out.print(i + " ");
                counter++;
            }
            i--;
        }
        System.out.println();
        System.out.println("4 ve 6 ya bölünen 3 basamaklı " + counter + " tane sayı var");





    }
}
