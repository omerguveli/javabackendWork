import java.util.Scanner;

public class primeNumbersProject {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int asal;
        do {
            System.out.print("Bir Sayı Giriniz (1-100 arası): ");
            asal = inp.nextInt();
            if (asal < 1 || asal > 100) {
                System.out.println("Lütfen 1 ile 100 arasında bir değer giriniz.");
            }
        } while (asal < 1 || asal > 100);

        boolean asalMi = true;

        for (int i = 2; i < asal; i++) {
            if (asal % i == 0) {
                asalMi = false;
                break;
            }
        }

        if (asalMi && asal > 1) {
            System.out.println(asal + " sayısı asal bir sayıdır.");
        } else {
            System.out.println(asal + " sayısı asal bir sayı değildir.");
        }

    }
}
