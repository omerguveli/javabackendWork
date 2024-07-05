import java.util.Scanner;

public class vucutKitleIndexHesaplama {
    public static void main(String[] args) {
        double kilonuz,boyunuz;
        Scanner index = new Scanner(System.in);
        System.out.println("kilonuz: " );
        kilonuz = index.nextDouble();
        System.out.println("boyunuz: " );
        boyunuz = index.nextDouble();;
        double vucutIndex = kilonuz / (boyunuz * boyunuz) ;
        System.out.println("indexiniz : " + vucutIndex);
        if (vucutIndex < 18.5){
            System.out.println("underweight");} else if (vucutIndex>18.5 && vucutIndex<+24.9) {
            System.out.println("Normal weight");
        } else if (vucutIndex>25.0 && vucutIndex<29.9) {
            System.out.println("overweight");

        } else if (vucutIndex>30.0 && vucutIndex<39.9) {
            System.out.println("obesity");
        } else   {
            System.out.println("you are very heavy");
        }
    }
}
