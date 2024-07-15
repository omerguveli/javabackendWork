import java.util.Scanner;
public class sicaklikOnerisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int wheather;
        System.out.print("sıcaklık değerini giriniz :");
        wheather = input.nextInt();
        if (wheather < 5){
            System.out.println("kayak yapmaya giebilirsin");
        }else if (wheather>= 5 && wheather<=15){
            System.out.println("sinemaya gidebilirsiniz");
        }
       else if (wheather>=15 && wheather<=25){
            System.out.println("pikniğe gidebilirsiniz");
        }
       else if (wheather>25){
            System.out.println("Yüzmeye gidebilirisiniz");
        }
       else {
            System.out.println("lütfen düzgün bir değer giriniz");
        }
    }
}
