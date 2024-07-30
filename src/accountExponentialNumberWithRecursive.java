import java.util.Scanner;

public class accountExponentialNumberWithRecursive {
    static int type(int base, int power){
        if (power!= 0){
            return base *type(base,power-1);
        }
        else {
            return 1;
        }
    }
    public static void main(String[] args) {
    int base,power;
        Scanner inp = new Scanner(System.in);
        System.out.print("base değerini girin");
        base = inp.nextInt();

        System.out.print("power değerini girin");
        power = inp.nextInt();
        System.out.println("Sonuç: " + type(base, power));
    }
}
