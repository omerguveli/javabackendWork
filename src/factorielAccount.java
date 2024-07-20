import java.util.Scanner;

public class factorielAccount {
    public static void main(String[] args) {
        int n;
        int total = 1;
        Scanner inp = new Scanner(System.in);
        System.out.print("sayı giriniz :");
        n = inp.nextInt();
        for (int i = 1; i<=n; i++){
            total*=i;
            System.out.println(i+ " yeni sayı " + total);
        }
    }
}
