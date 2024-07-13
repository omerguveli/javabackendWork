import java.util.Scanner;

public class sinifGecmeHesaplamaProgrami {
    public static void main(String[] args) {
        int mat,fizik,tarih,turkce,muzik;
        int toplam=0,count = 0;

        Scanner hesaplama = new Scanner(System.in);
        System.out.print("Matematik notunuz : ");
        mat = hesaplama.nextInt();
        System.out.print("Fizik notunuz :");
        fizik = hesaplama.nextInt();
        System.out.print("Tarih notunuz :");
        tarih = hesaplama.nextInt();
        System.out.print("Türkçe notunuz :");
        turkce = hesaplama.nextInt();
        System.out.print("MÜzik notunuz :");
        muzik = hesaplama.nextInt();
        if (mat >= 0 && mat <= 100) {
            toplam += mat;
            count++;
        }

        if (turkce >= 0 && turkce <= 100) {
            toplam += turkce;
            count++;
        }
        if (tarih >= 0 && tarih <= 100) {
            toplam += tarih;
            count++;

        }
        if (fizik >= 0 && fizik <= 100) {
            toplam += fizik;
            count++;

        }
        if (muzik >= 0 && muzik <= 100) {
            toplam += muzik;
            count++;
        }
        System.out.println("ortalama = " + (toplam/count));
    }
}
