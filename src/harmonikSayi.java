import java.util.Scanner;

public class harmonikSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("A sayısını giriniz :");
        int a = input.nextInt();
        double results = 0.0;
        for (double i = 1; i <= a; i++){
            results += (1/i);

        }
        System.out.println("sonuç : " + results);

    }
}
