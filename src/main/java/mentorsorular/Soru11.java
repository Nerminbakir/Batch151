package mentorsorular;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Soru11 {
    public static void main(String[] args) {

        // Soru-11:Kullanıcının yasadıgı güne  göre 100 gün sonra hangi gün olduğunuz yazdırınız.(pazartesi hafta başlangıcı)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pazartesi: 1\nSalı : 2\nÇarşamba: 3\nPerşembe: 4\nCuma: 5\nCumartesi: " +
                "6\nPazar: 7\n Haftanın kaçıncı gününde olduğunu giriniz : ");

        int kacıncıGun = scanner.nextInt();
        if (kacıncıGun <= 0 || kacıncıGun > 7) {
            System.out.println("hatalı veri girdiniz");
        } else {

            System.out.print("kac gun sonrasını öğrenmek istiyorsunuz : ");
            int kacGunSonrasi = scanner.nextInt();
            int bulunanGun = (kacGunSonrasi + kacıncıGun) % 7;
            switch (bulunanGun) {
                case 1:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden PAZARTESİ");
                    break;
                case 2:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden SALI");
                    break;
                case 3:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden CARSAMBA");
                    break;
                case 4:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden PERSEMBE");
                    break;
                case 5:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden CUMA");
                    break;
                case 6:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden CUMARTESİ");
                    break;
                case 0:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden PAZAR");
                    break;
                default:
                    System.out.println("agam niddin!!!  hafta 7 gun :-( ");
            }
        }

//        System.out.print("Lütfen tarihi (yyyy-MM-dd formatında) giriniz: ");
//        String inputDate = scanner.nextLine();
//
//        // Tarih formatını ayarla
//        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//
//        // Kullanıcının girdiği tarihi parse et ve LocalDate nesnesi oluştur
//        LocalDate date = LocalDate.parse(inputDate, dateFormat);
//
//        // 100 gün sonrasındaki tarihi hesapla
//        LocalDate futureDate = date.plusDays(100);
//
//        // Haftanın gününü al ve büyük harfle yazdır
//        String dayOfWeek = futureDate.getDayOfWeek().toString().toUpperCase();
//
//        // Sonucu yazdır
//        System.out.println("100 gün sonra " + dayOfWeek + " olacak.");



    }
}
