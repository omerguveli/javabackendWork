import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sort = new Scanner(System.in);
        System.out.print("ilk sayıyı giriniz :");
        a = sort.nextInt();
        System.out.print("2.sayıyı giriniz");
        b = sort.nextInt();
        System.out.print("son sayıyı giriniz");
        c = sort.nextInt();
        if (a >b && a>c){
            if (b>c){
                System.out.print(c + "<" + b + "<" + a);
            }
        }else  if (a >b && a>c){
            if (c>b){
                System.out.print(b + "<" + c + "<" + a);
            }
        } else if (b>a && b>c) {
            if (a>c){
                System.out.println(c + "<" + a + "<" + b);
            }
        }else if (b>a && b>c) {
            if (c>a){
                System.out.println(a + "<" + c + "<" + b);
            }
        } else if (c>a && c>b) {
            if (b>a){
                System.out.println(a + "<" + b + "<" + c);
            }
            
        } else if (c>a && c>b) {
            if (a>b){
                System.out.println(b + "<" + a + "<" + c);
            }

        }
    }
}
