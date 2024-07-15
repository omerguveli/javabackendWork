import java.util.Scanner;

public class ticketAccountForAirplane {
    public static void main(String[] args) {
        int km,yas,yoltipi;
        double normalTutar,indirimliTutar;

        Scanner airplane = new Scanner(System.in);
        System.out.print("km bilgisini giriniz :");
        km = airplane.nextInt();
        System.out.print("yaşınızı giriniz :");
        yas = airplane.nextInt();
        System.out.print("yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş): ");
        yoltipi = airplane.nextInt();

        if (yoltipi != 1 && yoltipi != 2) {
            System.out.println("Lütfen geçerli bir yolculuk tipi giriniz.");
            return; // Geçersiz yolculuk tipi girildiyse programı sonlandır.
        }

        if (yoltipi == 2) {
            normalTutar = km * 0.10 * 2 * 0.8; // Gidiş dönüş için %20 indirim uygulandı
            System.out.println("normal tutarın fiyatı: " + normalTutar);
        } else {
            normalTutar = km * 0.10;
            System.out.println("normal tutarın fiyatı: " + normalTutar);
        }

        indirimliTutar = normalTutar;

        // Yaşa göre indirim hesaplama
        if (yas < 12) {
            indirimliTutar = normalTutar * 0.5; // %50 indirim
            System.out.println("hesaplanan yeni tutar : " + indirimliTutar);
        } else if (yas >= 12 && yas < 24) {
            indirimliTutar = normalTutar * 0.1; // %10 indirim
            System.out.println("hesaplanan yeni tutar : " + indirimliTutar);
        } else if (yas >= 65) {
            indirimliTutar = normalTutar * 0.3; // %30 indirim
            System.out.println("hesaplanan yeni tutar : " + indirimliTutar);
        }
    }
}
