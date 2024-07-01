import java.util.Scanner;

public class degerAlma {
    public static void main(String[] args) {
        int a;
        System.out.print("Bir değer giriniz =");
        Scanner test = new Scanner(System.in);
        a = test.nextInt();
        System.out.println("Your result = " + a);

    String b,c;
        Scanner testStr = new Scanner(System.in);
        System.out.print("ifade:");
        b = testStr.nextLine();
        c = testStr.nextLine();
        System.out.println(b.length() + c.length());
    }
}
