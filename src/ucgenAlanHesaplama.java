import java.util.Scanner;
public class ucgenAlanHesaplama {
     public static void main(String[] args) {

            int a,b;
         Scanner input = new Scanner(System.in);
         System.out.print("a sayisini giriniz : "  );
         a =input.nextInt() ;
         a = a * a;
         System.out.println("a sayisi :" + a );
         System.out.print("b sayisini giriniz : "  );
         b =input.nextInt() ;
         b = b * b;
         System.out.println("b sayisi :" + b);
         double c = Math.sqrt(a + b);
         System.out.print("üçgenin alanı :" + c);

    }
}
