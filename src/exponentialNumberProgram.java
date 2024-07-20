

import java.util.Scanner;

public class exponentialNumberProgram {
    public static void main(String[] args) {
        int n,k;
        int total = 1;
        Scanner inp = new Scanner(System.in);
        System.out.print("üssü alınacak sayı :");
        n = inp.nextInt();
        System.out.print("üs alınacak sayi:");
        k = inp.nextInt();
        for(int i =1; i<=k; i++){
            total*=n;
        }
        System.out.println("cevap :" + total);
    }
}
