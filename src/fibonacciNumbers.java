import java.util.Scanner;

public class fibonacciNumbers {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int deger = inp.nextInt();

        int firstValue = 0, secondValue = 1;
        System.out.print("Fibonacci Serisi: " + firstValue + " " + secondValue);

        for (int i = 2; i < deger; i++) {
            int nextValue = firstValue + secondValue;
            System.out.print(" " + nextValue);
            firstValue = secondValue;
            secondValue = nextValue;
        }

        while (true) {
            System.out.print("\nSeriyi devam ettirmek için bir sayı giriniz (bitirmek için 0 giriniz): ");
            int nextDeger = inp.nextInt();
            if (nextDeger == 0) {
                break;
            }
            for (int i = 0; i < nextDeger; i++) {
                int nextValue = firstValue + secondValue;
                System.out.print(" " + nextValue);
                firstValue = secondValue;
                secondValue = nextValue;
            }
        }

    }
}