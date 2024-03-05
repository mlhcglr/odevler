import java.util.*;
public class Maraton {
    public static void main(String[] args) {
        String[] ogrenciIsimleri = {"Kadir","Gökhan","Hakan","Suzan","Pınar","Mehmet","Fırat","James","Jale","Ersin","Deniz","Gözde","Anıl","Burak"};
        int[] ogrencisureleri = {341,273,274,329,445,270,243,334,412,393,299,343,317,265};
        for (int i = 0; i < ogrencisureleri.length - 1; i++) {
            for (int j = 0; j < ogrencisureleri.length - i - 1; j++) {
                if (ogrencisureleri[j] > ogrencisureleri[j + 1]) {
                    int sure = ogrencisureleri[j];
                    ogrencisureleri[j] = ogrencisureleri[j + 1];
                    ogrencisureleri[j + 1] =sure;
                    String Isim = ogrenciIsimleri[j];
                    ogrenciIsimleri[j] = ogrenciIsimleri[j + 1];
                    ogrenciIsimleri[j + 1] = Isim;
                }
            }
        }
        System.out.println("Derece yapan öğrenciler:");
        for (int i = 0; i < 3; i++) {
            System.out.println(ogrenciIsimleri[i] + ": " + ogrencisureleri[i]+"'");
        }
       
        Map<Character, Integer> sinifsayisi = ogrencisınıfı(ogrencisureleri);
        System.out.println("\nSınıflandırma:");
        for (char key : sinifsayisi.keySet()) {
            System.out.println(key + " sınıfı: " + sinifsayisi.get(key));
        }
    }
    public static Map<Character, Integer> ogrencisınıfı(int[] sureler) {
        Map<Character, Integer> sinifsayisi = new HashMap<>();
        sinifsayisi.put('A', 0);
        sinifsayisi.put('B', 0);
        sinifsayisi.put('C', 0);
        for (int sure : sureler) {
            if (sure >= 200 && sure <=299) {
                sinifsayisi.put('A', sinifsayisi.get('A') + 1);
            } else if (sure >= 300 && sure <= 399) {
                sinifsayisi.put('B', sinifsayisi.get('B')+ 1);
            } else if (sure>=400) {
                sinifsayisi.put('C', sinifsayisi.get('C') + 1);
            }
        }
        return sinifsayisi;
    }
}
