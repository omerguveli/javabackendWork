import java.util.Scanner;

public class daireDilimAlan {
    public static void main(String[] args) {
        double pi = 3.14;
        int r, a;
        Scanner input = new Scanner(System.in);
        r = input.nextInt();
        do {
            System.out.print("Lütfen 0 ile 360 derece arasında bir değer girin: ");
            a = input.nextInt();
            if (a < 0 || a > 360) {
                System.out.println("Geçersiz değer! Lütfen tekrar deneyin.");
            }
        } while (a < 0 || a > 360);

        System.out.println("Girilen değer: " + a);
    double alan = pi * r*r *a /360;
        System.out.println("alanı:"+alan);

    }
}
