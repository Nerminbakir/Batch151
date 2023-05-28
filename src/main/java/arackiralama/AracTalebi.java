package arackiralama;

public class AracTalebi {  // POJO (Plain Old Java Object), Java'nın Özel Olmayan Nesneleri anlamına gelir.
    // Diğer sınıflardan veya frameworklerden herhangi bir özel bağımlılığı veya
    // mirası olmayan Java sınıfını ifade eder.
    // POJO, özel alanlara, getter ve setter yöntemlerine sahip basit bir Java nesnesidir.

    /*
                    Bir araç kiralama projesi hazırlayınız.
        Arac Talebi adında bir POJO class oluşturunuz. +++
        -	alınacaksehir, alınacakgun, alıssaati, teslimGunu, teslimSaati (kiralama ile ilgili bilgiler)+++
        -	marka, model, yakitTipi, vites ve gunlukUcret (araç ile ilgili bilgiler).+++
        -	Kiralama ile ilgili variable’ları içeren parametreli bir constructor oluşturun.+++
        -	Araç ile ilgili variable’ları içeren parametreli bir constructor oluşturun.+++
        -	Tum variable’lar için Getter ve Setter method’ları oluşturun (Encapsulation).+++
        MusteriveAracBilgileri adında method’ları içeren bir class oluşturunuz.
        -	aracTalep() adında bir method oluşturunuz.
        Bu method’da alinacak sehir, teslim edilecek sehir, alinacak gun ve teslim edilecek gun ve teslim saati bilgilerini aliniz.
        Odenecek toplam gun sayisini yazdırın.
        -	Dikkat: Teslim gunu, alis gününden daha once olamaz.
        -	arabalar() create ederek, tüm araç modellerini bir list’e atınız.
        (parametre olarak araç ile bilgileri alan <marka, model, yakıt tipi, vites, gunlukUcret> objeleri list’e atınız.)
        Bu list’i göstererek bir aracı kiralamasını sağlayın.
        -	getAraba() metodu ile seçmiş olduğu aracı gösterin. Odeyeceği toplam miktari yazdirin.
        Onaylar ise, müşteri bilgilerini almak için devam edin.
        -	musteriBilgileri() metodu ile müşteri ile ilgili bilgileri aliniz. AdSoyad, ID, yaş ve telefon.
        -	OdemeBilgieri() metodu ile odeme bilgilerini alacaginiz bir method create ediniz.
        Kart numarası uzunluğu 12 olmalıdır, kontrol ediniz.
     */

    // kiralama ile ilgili bilgiler
    private String alinacakSehir;
    private String alinacakGun;
    private String alisSaati;
    private String teslimGunu;
    private String teslimSaati;

    public AracTalebi(String alinacakSehir, String alinacakGun, String alisSaati, String teslimGunu, String teslimSaati) {
        this.alinacakSehir = alinacakSehir;
        this.alinacakGun = alinacakGun;
        this.alisSaati = alisSaati;
        this.teslimGunu = teslimGunu;
        this.teslimSaati = teslimSaati;
    }

    // araç ile ilgili bilgiler
    private String marka;

    private String model;
    private String yakitTipi;
    private String vites;
    private double gunlukUcret;

    public AracTalebi (){

    }

    public AracTalebi(String marka, String model, String yakitTipi, String vites, int gunlukUcret) {
        this.marka = marka;
        this.model = model;
        this.yakitTipi = yakitTipi;
        this.vites = vites;
        this.gunlukUcret = gunlukUcret;
    }

    public String getAlinacakSehir() {
        return alinacakSehir;
    }

    public void setAlinacakSehir(String alinacakSehir) {
        this.alinacakSehir = alinacakSehir;
    }

    public String getAlinacakGun() {
        return alinacakGun;
    }

    public void setAlinacakGun(String alinacakGun) {
        this.alinacakGun = alinacakGun;
    }

    public String getAlisSaati() {
        return alisSaati;
    }

    public void setAlisSaati(String alisSaati) {
        this.alisSaati = alisSaati;
    }

    public String getTeslimGunu() {
        return teslimGunu;
    }

    public void setTeslimGunu(String teslimGunu) {
        this.teslimGunu = teslimGunu;
    }

    public String getTeslimSaati() {
        return teslimSaati;
    }

    public void setTeslimSaati(String teslimSaati) {
        this.teslimSaati = teslimSaati;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYakitTipi() {
        return yakitTipi;
    }

    public void setYakitTipi(String yakitTipi) {
        this.yakitTipi = yakitTipi;
    }

    public String getVites() {
        return vites;
    }

    public void setVites(String vites) {
        this.vites = vites;
    }

    public double getGunlukUcret() {
        return gunlukUcret;
    }

    public void setGunlukUcret(int gunlukUcret) {
        this.gunlukUcret = gunlukUcret;
    }

    @Override
    public String toString() {
        return "AracTalebi{" +
                "alinacakSehir='" + alinacakSehir + '\'' +
                ", alinacakGun='" + alinacakGun + '\'' +
                ", alisSaati='" + alisSaati + '\'' +
                ", teslimGunu='" + teslimGunu + '\'' +
                ", teslimSaati='" + teslimSaati + '\'' +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yakitTipi='" + yakitTipi + '\'' +
                ", vites='" + vites + '\'' +
                ", gunlukUcret=" + gunlukUcret +
                '}';
    }
}
