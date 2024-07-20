import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class findingExponentialNumber {
    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);
        System.out.print("sayıyı giriniz : ");
        n = inp.nextInt();

        for(int i = 1; i <= n; i*=4) {
            System.out.println(i);
        }
        for (int i = 1; i < n; i*= 5) {
            System.out.println(i);
        }

    }
}



