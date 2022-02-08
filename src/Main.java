import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, turkce, kimya, fizik, müzik;
        Scanner input = new Scanner(System.in);


        System.out.print("Matematik notunuzu giriniz:");
        mat=input.nextInt();

        System.out.print("Fizik notunuzu giriniz:");
        fizik=input.nextInt();

        System.out.print("Türkçe notunuzu giriniz:");
        turkce=input.nextInt();

        System.out.print("Kimya notunuzu giriniz:");
        kimya=input.nextInt();

        System.out.print("Müzik notunuzu giriniz:");
        müzik=input.nextInt();

        double avarage=(mat+fizik+turkce+kimya+müzik)/5;
        if (avarage<=55){
            System.out.print("Sınıfta Kaldınız!");
        }
        else {
            System.out.print("Tebrikler , sınıfı geçtiniz!");
        }
        System.out.print("Ortalamanız:"+avarage);
    }
}

