import java.util.Scanner;


public class PerfectNumberproject {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int n = inp.nextInt();
        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        if (sum == n) {
            System.out.println(n + " bir mükemmel sayıdır.");
        } else {
            System.out.println(n + " bir mükemmel sayı değildir.");
        }
    }
}