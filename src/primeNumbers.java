import java.util.Scanner;

public class primeNumbers {
    static boolean isPrime(int number,int divisior){
        if (number<=2){
          return (number==2);
        }
        if (number % divisior == 0){
            return false;
        }
        if (divisior *divisior >number ){
            return true;
        }
        return isPrime(number, divisior + 1);
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("numara giriniz:");
        int number = inp.nextInt();
    if (isPrime(number,2)){
    System.out.print( number+ "Bu bir asal sayıdır." );
}
    else {
        System.out.println("Bu bir asal sayı değildir.");
    }
    }
}
