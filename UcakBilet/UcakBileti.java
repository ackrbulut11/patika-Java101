import java.util.Scanner;

public class UcakBileti {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int mesafe ;
        int yon ;
        int yas ;

        try {
            System.out.print("Mesafe: ");
            mesafe = input.nextInt();
        } catch (Exception e) {
            System.out.println("Hatali deger girdiniz!");
            return; 
        }

        try {
            System.out.print("Yolculuk tipini secin: Gidis (1)/ Gidis-Donus (2) ");
            yon = input.nextInt();
        } catch (Exception e) {
            System.out.println("Hatali deger girdiniz!");
            return; 
        }

        try {
            System.out.print("Yasinizi girin: ");
            yas = input.nextInt();
        } catch (Exception e) {
            System.out.println("Hatali deger girdiniz!");
            return;
        }

        double bilet;

        if (yon == 1) {
            bilet = 0.10 * mesafe;
            bilet *= 1;
        } else if (yon == 2) {
            bilet = 0.10 * mesafe * 2;
            bilet *= 0.8;
        } else {
            System.out.println("Hatali yon bilgisi girdiniz!");
            return; 
        }

        if (yas < 12) {
            bilet /= 2;
        } else if (yas < 24) {
            bilet *= 0.9;
        } else if (yas >= 65) {
            bilet *= 0.7;
        }

        System.out.println("Toplam tutar: " + bilet + " USD");
    }
}
