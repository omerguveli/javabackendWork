import java.util.Scanner;

public class kdvHesap {
     public static void main(String[] args) {
    double sayi,b,c;
         Scanner input = new Scanner(System.in);
         System.out.print("sayiyi giriniz:");
         sayi = input.nextDouble();
         if (sayi >= 0 && sayi <= 1000) {
             b = sayi * 0.18;
             System.out.println("Mevcut Kdvli Fiyat: " + b);
             System.out.println("total cost" + (b + sayi));
         } else if (sayi > 1000) {
              c = sayi * 0.08;
             System.out.println("büyük fiyatta kdv : " + c);
             System.out.println("total cost: " + (c +sayi));
         }

     }
}
