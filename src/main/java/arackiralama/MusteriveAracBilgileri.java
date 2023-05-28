//package arackiralama;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class MusteriveAracBilgileri {
//    /*
//
//        -	arabalar() create ederek, tüm araç modellerini bir list’e atınız.
//        (parametre olarak araç ile bilgileri alan <marka, model, yakıt tipi, vites, gunlukUcret> objeleri list’e atınız.)
//        Bu list’i göstererek bir aracı kiralamasını sağlayın.
//        -	getAraba() metodu ile seçmiş olduğu aracı gösterin. Odeyeceği toplam miktari yazdirin.
//        Onaylar ise, müşteri bilgilerini almak için devam edin.
//        -	musteriBilgileri() metodu ile müşteri ile ilgili bilgileri aliniz. AdSoyad, ID, yaş ve telefon.
//        -	OdemeBilgieri() metodu ile odeme bilgilerini alacaginiz bir method create ediniz.
//        Kart numarası uzunluğu 12 olmalıdır, kontrol ediniz.
//     */
//}
//
//        private List<Araba> arabalar = new ArrayList<>();
//        private Araba seciliAraba;
//        private Musteri musteri;
//        private Odeme odeme;
//        private Scanner scan = new Scanner(System.in);
//
//        public void aracTalep() {
//            System.out.print("Alınacak şehir: ");
//            String alinanSehir = scan.nextLine();
//            System.out.print("Teslim edilecek şehir: ");
//            String teslimSehri = scan.nextLine();
//            System.out.print("Alınacak gün: ");
//            int alinanGun = scan.nextInt();
//            System.out.print("Teslim edilecek gün: ");
//            int teslimGun = scan.nextInt();
//            System.out.print("Teslim saati: ");
//            int teslimSaati = scan.nextInt();
//
//            if (teslimGun < alinanGun) {
//                System.out.println("HATA: Teslim günü, alınacak günden önce olamaz!");
//                return;
//            }
//            int toplamGunSayisi = teslimGun - alinanGun;
//            System.out.println("Ödenecek toplam gün sayısı: " + toplamGunSayisi);
//
//            arabalar();
//
//            arabalar.add(new Araba("Audi", "A3", "Dizel", "Manuel", 250));
//            arabalar.add(new Araba("Mercedes", "C180", "Benzin", "Otomatik", 350));
//            arabalar.add(new Araba("BMW", "320i", "Benzin", "Manuel", 300));
//            arabalar.add(new Araba("Toyota", "Corolla", "Benzin", "Manuel", 200));
//            arabalar.add(new Araba("Ford", "Focus", "Benzin", "Otomatik", 180));
//
//            System.out.println("Araçlar:");
//            for (Araba araba : arabalar) {
//                System.out.println(araba.toString());
//            }
//
//            System.out.print("Hangi aracı kiralamak istiyorsunuz? (Sıra numarasını giriniz): ");
//            int secilenArabaNo = scan.nextInt();
//
//            if (secilenArabaNo < 1 || secilenArabaNo > arabalar.size()) {
//                System.out.println("HATA: Geçersiz sıra numarası!");
//                return;
//            }
//            seciliAraba = arabalar.get(secilenArabaNo - 1);
//            int toplamMiktar = toplamGunSayisi * seciliAraba.getGunlukUcret();
//            System.out.println("Seçili araç: " + seciliAraba.toString());
//            System.out.println("Ödenecek toplam miktar: " + toplamMiktar + " TL");
//
//            System.out.print("Onaylıyor musunuz? (E/H): ");
//            scan.nextLine(); // önceki nextInt() işleminden kalan boşluğu temizlemek için
//            String cevap = scan.nextLine();
//            if (!cevap.equalsIgnoreCase("E")) {
//                return;
//            }
//
//            musteriBilgileri();
//            odemeBilgileri();
//        }
//
//    private void arabalar() {
//    }
//
//    private void musteriBilgileri() {
//        System.out.print("Ad Soyad: ");
//        String adSoyad = scan.nextLine();


//}//class
