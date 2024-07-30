import java.util.Scanner;

public class advancedCalculated {
     static void sum(){
Scanner scan = new Scanner(System.in);
int result = 0; int number, i =1;
while (true){
    System.out.print(i++ + ". sayı :");
    number = scan.nextInt();
    if (number == 0){
        break;
    }
    result += number;
}
         System.out.print("sonuç:" + result);

    }
    static void minus() {
        Scanner scan = new Scanner(System.in);
        int result = 0;
        int number;
        int count;
        System.out.print("sayı giriniz:");
        number = scan.nextInt();
        System.out.print("2.sayıyı giriniz:");
        count = scan.nextInt();
        for (int i = 1; i <= number; i++) {

                result = number - count;
        }
        System.out.println ( "çıkan sonuç :" + result);
    }
    static void multiplication() {
        Scanner scan = new Scanner(System.in);
        int result = 1;
        int number;
        System.out.print("Kaç sayı çarpmak istediğinizi giriniz: ");
        int count = scan.nextInt();
        for (int i =1; i<=count; i++){
            System.out.print(i + ". sayıyı giriniz: ");
            number = scan.nextInt();
            result *= number;
        }
        System.out.println("sonuç:" +result);
    }
    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);
    }
    static void mode(){
         Scanner scan = new Scanner(System.in);
         double number, result=0;
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        for (int i =1; i<=counter; i++){
            System.out.print(i +".modunu alacağınız sayı :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result %=number;
        }
        System.out.println("çıkan sonuç:" +result);

    }
    static void rectangulaarea(){
         Scanner scan = new Scanner(System.in);
         int number, result =1;
        System.out.println("kaç adet kenarın alan hesabı var:");
         int count = scan.nextInt();
         for (int i =1; i<=count; i++){
             System.out.println(i +".kenarı giriniz");
             number = scan.nextInt();
             result *=number;

         }
        System.out.println("alanın sonucu:" + result);
    }
    public static void main(String[] args) {
        System.out.println("lütfen hangi işlemi yapacağınızı seçin: \n" + "1:Toplama\n"
                + "2:Çıkarma\n" +
                "3:çarpma" + "" +
                "4:Bölme" +
                "5:Mod" +
                "6:Dikdörtgen Alan " +
                "0:çıkış");
        int select;
        do {
            System.out.print("işlem seçeneğini yazınız:");
            Scanner inp = new Scanner(System.in);
            select = inp.nextInt();
            switch (select) {
                case 1: sum();
                break;
                case 2 : minus();
                break;
                case 3 : multiplication();
                break;
                case 4 :divided();
                break;
                case 5:mode();
                break;
                case 6:rectangulaarea();
                break;
            }

        }
        while (select != 0);
        System.out.println("goodbye:)");
    }
}
