import java.util.Scanner;

public class kullaniciGirisi {
    public static void main(String[] args) {
        String user,password;
            Scanner userName = new Scanner(System.in);
            System.out.print("kullanıcı adını giriniz: ");
            user = userName.nextLine();
            System.out.print("şifreyi giriniz: ");
            password = userName.nextLine();
            if (user.equals("patika") && password.equals("kodluyoruz123") ){
                System.out.println("başarılı giriş yaptınız");
            }
            else {
                System.out.println("Lütfen tekrar giriş yapınız");

            }

        System.out.println("şifrenimizi unuttunuz ?");
        String yesNO = userName.nextLine();
        if (yesNO.equals("yes")) {
            System.out.print("yeni şifrenizi girin");
            String newPassword = userName.nextLine();
            System.out.print("newPassword occured. Yeniden giriş yapınız" + newPassword);
        }
        else{
            System.out.println("O zaman tekrar giriş yapınız");
        }
    }

}
