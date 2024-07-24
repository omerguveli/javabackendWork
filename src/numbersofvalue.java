import java.util.Scanner;

public class numbersofvalue {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı adedini yazınız :");
        int n =inp.nextInt();

        int max = 0;
        int min =0;

        for(int i =1; i<=n; i++){
            System.out.print(i + ". sayıyı giriniz :");
            int num = inp.nextInt();
            if (num>max){
                max = num;
            }
            if (num<min || num ==0){
                min = num;
            }
        }
        System.out.println("en küçük sayı : " + min);
        System.out.println("en büyük sayı :" + max);
    }
}
