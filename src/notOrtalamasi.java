import java.util.Scanner;
public class notOrtalamasi {
     public static void main(String[] args) {
    int tarih,matematik,muzik,turkce,fizik,kimya,biyoloji;
    Scanner inp = new Scanner(System.in);
    System.out.print("matematik notunuz =");
         matematik = inp.nextInt();

         System.out.print("Tarih notunuz =");
         tarih = inp.nextInt();
         System.out.print("Muzik notunuz =");
         muzik = inp.nextInt();
         System.out.print("Türkçe notunuz =");
         turkce = inp.nextInt();
         System.out.print("Kimya notunuz =");
         kimya = inp.nextInt();
         System.out.print("Biyoloji notunuz =");
         biyoloji = inp.nextInt();
         System.out.print("Fizik notunuz = ");
         fizik = inp.nextInt();
         double sonuc = (matematik + tarih + muzik + turkce + kimya + biyoloji + fizik) / 7.0;
         System.out.println("Not ortalamanız :" + sonuc);
         if (sonuc > 60){
             System.out.println("tebrikler geçtiniz");
         }
        else {
             System.out.println("geçmis olsun");
         }
        inp.close();

     }
}
