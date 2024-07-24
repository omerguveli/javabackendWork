import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("1.sayıyı giriniz: ");
        int n1 = inp.nextInt();
        System.out.println("2.sayıyı girniz: ");
        int n2 = inp.nextInt();
        int ekok = 1;
        int ebob = 1;
        for (int i = 1; i<=n1 * n2; i++){
            if (i % n1==0 && i % n2==0){
                ekok = i;

            }
        }
        System.out.println("ekok:"+ ekok);
        for (int i = 1; i<=n1;  i++){
            if (n1%i==0 && n2%i ==0){
                ebob =i;

            }
        }
        System.out.println("ebob:"+ ebob);
    }
}
