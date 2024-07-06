import java.util.Scanner;

public class basitHesapMakinesi {
    public static void main(String[] args) {
        int n1,n2,select;
        Scanner option = new Scanner(System.in);
        System.out.print("ilk sayıyı yazın: ");
        n1 = option.nextInt();
        System.out.print("ikinci sayıyı yazın:");
        n2 = option.nextInt();
        System.out.print("yapılacak işlem tipi için numara giriniz : ");
        select = option.nextInt();

        switch (select){
            case 1 :
                System.out.println(n1 + n2);
                break;
            case 2:
                System.out.println(n1 - n2);
                break;
            case 3 :
                System.out.println(n1 * n2);
                break;
            case 4:
                System.out.println(n1 / n2);
                break;
            default:
                System.out.println("lütfen geçerli bir select yaz");
        }

    }
}
