public class Main {
    public static void main(String[] args) {
        Ogrenci ogrenci1 = new Ogrenci("null", "null", 2020, 3.5, 110);
        Ogrenci ogrenci2 = new Ogrenci("Gökhan", "Bilgisayar Müh", 2019, 0.8, 212);
        Ogrenci ogrenci3 = new Ogrenci("Ayşe", "Makine Müh", 2023, 2.0, 266);
        Ogrenci ogrenci4 = new Ogrenci("Elif", "Elektrik-Elektronik Müh", 2024, 1.98, 386);

        System.out.println("OGR-1 " + ogrenci1.getAd() + " " + ogrenci1.getBolum() + " " + ogrenci1.getOgrenciNumarasi() + " " + ogrenci1.getYilSonuOrtalamasi());
        System.out.println("OGR-2 " + ogrenci2.getAd() + " " + ogrenci2.getBolum() + " " + ogrenci2.getOgrenciNumarasi() + " " + ogrenci2.getYilSonuOrtalamasi());
        System.out.println("OGR-3 " + ogrenci3.getAd() + " " + ogrenci3.getBolum() + " " + ogrenci3.getOgrenciNumarasi() + " " + ogrenci3.getYilSonuOrtalamasi());
        System.out.println("OGR-4 " + ogrenci4.getAd() + " " + ogrenci4.getBolum() + " " + ogrenci4.getOgrenciNumarasi() + " " + ogrenci4.getYilSonuOrtalamasi());

        double harc1 = ogrenci1.harcHesapla();
        double harc2 = ogrenci2.harcHesapla();
        double harc3 = ogrenci3.harcHesapla();
        double harc4 = ogrenci4.harcHesapla();

        System.out.println("1. Öğrencinin ödeyeceği harç : " + harc1);
        System.out.println("2. Öğrencinin ödeyeceği harç : " + harc2);
        System.out.println("3. Öğrencinin ödeyeceği harç : " + harc3);
        System.out.println("4. Öğrencinin ödeyeceği harç : " + harc4);
    }
}
