import java.util.Scanner;

public class calculatingTheNumberOfSteps {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Basamak Sayısını giriniz :" );
       int n = inp.nextInt();
        for (int i =1; i<=n; i++){
            int stars = 2 * (n - i) + 1;
            for (int j = 1; j <= stars; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
