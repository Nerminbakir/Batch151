package javaders.day40lambda;

public class Universite {   // POJO (Plain Old Java Object), Java'nın Özel Olmayan Nesneleri anlamına gelir.
    // Diğer sınıflardan veya frameworklerden herhangi bir özel bağımlılığı veya
    // mirası olmayan Java sınıfını ifade eder.
    // POJO, özel alanlara, getter ve setter yöntemlerine sahip basit bir Java nesnesidir.

    private String name;
    private String bolumAdi;
    private int ogrenciSayisi;
    private int notOrtalamasi;

    public Universite() { //parametresiz cons.
    }

    public Universite(String name, String bolumAdi, int ogrenciSayisi, int notOrtalamasi) {
        this.name = name;
        this.bolumAdi = bolumAdi;
        this.ogrenciSayisi = ogrenciSayisi;
        this.notOrtalamasi = notOrtalamasi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBolumAdi() {
        return bolumAdi;
    }

    public void setBolumAdi(String bolumAdi) {
        this.bolumAdi = bolumAdi;
    }

    public int getOgrenciSayisi() {
        return ogrenciSayisi;
    }

    public void setOgrenciSayisi(int ogrenciSayisi) {
        this.ogrenciSayisi = ogrenciSayisi;
    }

    public int getNotOrtalamasi() {
        return notOrtalamasi;
    }

    public void setNotOrtalamasi(int notOrtalamasi) {
        this.notOrtalamasi = notOrtalamasi;
    }

    @Override
    public String toString() {
        return "Universite{" +
                "name='" + name + '\'' +
                ", bolumAdi='" + bolumAdi + '\'' +
                ", ogrenciSayisi=" + ogrenciSayisi +
                ", notOrtalamasi=" + notOrtalamasi +
                '}';
    }
}
