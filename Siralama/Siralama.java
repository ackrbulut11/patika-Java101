import java.util.InputMismatchException;
import java.util.Scanner;

public class Siralama {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Birinci sayi: ");
                int a = input.nextInt();
                System.out.print("İkinci sayi: ");
                int b = input.nextInt();
                System.out.print("Ucuncu sayi: ");
                int c = input.nextInt();

                if (a > b && a > c) {
                    if (b > c) {
                        System.out.println(a + ">" + b + ">" + c);
                    } else if (c > b) {
                        System.out.println(a + ">" + c + ">" + b);
                    } else {
                        System.out.println("Lütfen farkli değerler girin.");
                    }

                } else if (b > a && c > a) {
                    if (b > c) {
                        System.out.println(b + ">" + c + ">" + a);
                    } else if (c > b) {
                        System.out.println(c + ">" + b + ">" + a);
                    } else {
                        System.out.println("Lütfen farkli değerler girin.");
                    }

                } else if (a > b && c > a) {
                    System.out.println(c + ">" + a + ">" + b);
                } else if (b > a && a > c) {
                    System.out.println(b + ">" + a + ">" + c);
                } else {
                    System.out.println("Lütfen farkli değerler girin.");
                }
                
            } catch (InputMismatchException e) {
                System.out.println("Lütfen sadece sayi girin.");
                input.nextLine(); // Buffer temizler
            }
        }
    }
}
