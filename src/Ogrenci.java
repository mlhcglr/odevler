public class Ogrenci {
    private String ad;
    private String bolum;
    private int girisYili;
    private double gano;
    private int ogrenciNumarasi;
    private static int ogrenciSirasi = 0;
    private int bolumKodu;

    public Ogrenci(String ad, String bolum, int girisYili, double gano, int bolumKodu) {
        this.ad = ad;
        this.bolum = bolum;
        this.girisYili = girisYili;
        this.gano = gano;
        this.bolumKodu = bolumKodu;
        hesaplaOgrenciNumarasi();
    }
    public String getAd() {
        return ad;
    }
    public String getBolum() {
        return bolum;
    }
    public int getGirisYili() {
        return girisYili;
    }
    public double getYilSonuOrtalamasi() {
        return gano;
    }
    public int getOgrenciNumarasi() {
        return ogrenciNumarasi;
    }
    public double harcHesapla() {
        int fark = 2024 - girisYili;
        int ekYil = Math.max(fark - 4, 0);
        return ekYil * 2000;
    }
    private void hesaplaOgrenciNumarasi() {
        this.ogrenciNumarasi = girisYili * 1000000 + bolumKodu * 1000 + ++ogrenciSirasi;
    }

}

