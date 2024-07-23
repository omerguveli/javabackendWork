import java.util.Scanner;

public class atmProject {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int right = 3;
        int balance =1500;
        int select;

        while (right > 0){
            System.out.print("kullanıcı adını giriniz :");
            String userName = inp.nextLine();
            System.out.print("şifreyi giriniz : ");
            String Password = inp.nextLine();
            if (userName.equals("patika") && Password.equals("dev123")){
                System.out.println("başarılı giriş yaptınız");
                do {
                    System.out.println("lütfen yapacağınız işlemi seçin:\n" +
                            "1:para çekme\n" +"2:para yatırma\n"+"3:bakiye sorgulama\n" + "4:çıkış\n");
                    select = inp.nextInt();
                    switch (select){
                        case (1):
                            System.out.println("para miktarı");
                            int price = inp.nextInt();
                            if (price >balance){
                                System.out.println("para miktarı yetersiz");
                            }
                            else {
                                balance -=price;
                            }
                        case(2):
                            System.out.println("Yatırılacak para miktarı: " + balance);
                             price = inp.nextInt();
                            balance +=price;
                        case(3):
                            System.out.println("bakiyeniz : "+balance);
                    }
                }while (select!=4);
                System.out.println("tekrar görüşmek üzere");
                break;

            }
            else {
                System.out.println("hatalı giriş yaptınız ");
                right--;
                System.out.println("kalan hakkınız : " +right);
                if (right == 0){
                    System.out.println("hesabınız bloke olmuştur.");
                }
                else {
                    System.out.println("please try again.");
                }
            }
        }
    }
}
