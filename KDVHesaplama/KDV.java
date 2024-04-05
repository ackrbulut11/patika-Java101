import java.util.Scanner;

public class KDV {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {

        double fiyat;
        double vergi;

        System.out.print("Urunun fiyatini girin: ");
        Scanner input = new Scanner(System.in);
        fiyat = input.nextDouble();

        if (fiyat >= 1000){
            vergi = fiyat * 8/100;
            fiyat += vergi;
            System.out.printf("Urunun KDV tutari: %.2f\n", vergi);
            System.out.printf("Toplam tutar: %.2f\n", fiyat);

        } else {
            vergi = fiyat * 18/100;
            fiyat += vergi;
            System.out.printf("Urunun KDV tutari: %.2f\n", vergi);
            System.out.printf("Toplam tutar: %.2f\n", fiyat);
        }
    }
}
