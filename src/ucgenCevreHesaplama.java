import java.util.Scanner;

public class ucgenCevreHesaplama {
    public static void main(String[] args) {
        int a,b,c;
        Scanner value = new Scanner(System.in);
        System.out.print("a kenarı : ");
        a= value.nextInt();
        System.out.print("b kenarı : ");
        b= value.nextInt();
        System.out.println("c kenarı : ");
        c = value.nextInt();
        int u = (a+b+c)/2;
        System.out.println("u : " + u);
        int cevre = 2*u;
        System.out.println("cevre" + cevre);
        int alan = u*(u-a)*(u-b)*(u-c);
        System.out.println("alan"+alan);


    }
}
