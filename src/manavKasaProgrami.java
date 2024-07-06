import java.util.Scanner;

public class manavKasaProgrami {
    public static void main(String[] args) {
        double armut,muz,elma,domates,patlican;
            Scanner miktar = new Scanner(System.in);
                System.out.print("Alınan Armut Kilogramı: ");
                armut = miktar.nextDouble();
                double armutFiyat = armut * 2.14;
                 System.out.println("Toplam Armut tutarı: " + armutFiyat);
                      System.out.print("Alınan Muz Kilogramı: ");
                      muz = miktar.nextDouble();
                      double muzFiyat = muz * 0.95;
                      System.out.println("Toplam Muz tutarı: " + muzFiyat);
                          System.out.print("Alınan ELma Kilogramı: ");
                          elma = miktar.nextDouble();
                          double elmaFiyat = elma * 3.67;
                          System.out.println("Toplam elma tutarı: " + elmaFiyat);
                                System.out.print("Alınan Domates Kilogramı: ");
                                domates = miktar.nextDouble();
                                double domatesFiyat = domates * 1.11;
                                System.out.println("Toplam domates tutarı: " + domatesFiyat);
                                    System.out.print("Alınan Patlıcan Kilogramı: ");
                                    patlican = miktar.nextDouble();
                                    double patlicanFiyat = patlican * 5.00;
                                    System.out.println("Toplam patlıcan tutarı: " + patlicanFiyat);
                                            double toplamTutar = patlicanFiyat + domatesFiyat + elmaFiyat + muzFiyat +  armutFiyat;
                                            System.out.println("müşterinin ödemesi gereken toplam tutar: " + toplamTutar);

    }
}
