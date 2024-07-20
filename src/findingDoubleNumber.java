import java.util.Scanner;

public class findingDoubleNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Girilen sayi: ");
        int sayi = input.nextInt();

        int count = 0;
        int toplam = 0;

        while (true) {
            if (sayi < 0 || sayi % 3 != 0 || sayi % 4 != 0) {
                break; // Negatif veya koşulları sağlamayan bir sayı girildiğinde döngüyü sonlandır
            }

            count++;
            toplam += sayi;
            sayi++; // Sayıyı bir artır
        }

        if (count > 0) {
            int ort = toplam / count;
            System.out.println("Ortalama: " + ort);
        } else {
            System.out.println("Geçerli bir sayı girilmedi.");
        }

        input.close();
    }
}