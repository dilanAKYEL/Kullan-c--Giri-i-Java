import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String usarName, password;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adını giriniz:");
        usarName = input.nextLine();

        System.out.print("Şifre giriniz:");
        password = input.nextLine();
        if (usarName.equals("patika") && password.equals("dlan")) {
            System.out.print("Başarıyla Giriş Yaptınız !!!");
        } else {
            System.out.print("Şifreniz Yanlış, Sıfırlamak için R'ye Çıkmak için Q'ya basın ! : ");

            String sifirlama = input.nextLine();
            if (sifirlama.equals("R") || sifirlama.equals("r")) {
                System.out.print("Yeni Şifrenizi Giriniz : ");
                password = input.nextLine();
                if (password.equals("dlandpa")) {
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.print("Şifre Oluşturuldu");
                }
            } else if (sifirlama.equals("Q") || sifirlama.equals("q")) {
                System.out.print("Çıkış Yapılıyor...");
            }
        }
    }
}

