import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int Matematik,Fizik,Kimya,Turkce,Tarih,Muzik;

        System.out.print("Matematik notunuzu giriniz:");
        Matematik=input.nextInt();
        System.out.print("Fizik notunuzu giriniz:");
        Fizik=input.nextInt();
        System.out.print("Kimya notunuzu giriniz:");
        Kimya=input.nextInt();
        System.out.print("Turkce notunuzu giriniz:");
        Turkce=input.nextInt();
        System.out.print("Tarih notunuzu giriniz:");
        Tarih=input.nextInt();
        System.out.print("Muzik notunuzu giriniz:");
        Muzik=input.nextInt();

        int toplam= (Matematik+Fizik+Kimya+Tarih+Turkce+Muzik);
        double ort = toplam/6;

        String str = ort>60 ? "Sınıfı Gectiniz." : "Sınıfta Kaldınız.";
        System.out.print(str);


    }

}
