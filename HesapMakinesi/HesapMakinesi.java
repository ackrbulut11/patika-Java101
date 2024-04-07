import java.util.Scanner;

public class HesapMakinesi{
    @SuppressWarnings("resource")
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        System.out.print("Bir sayi girin: ");
        int n1 = input.nextInt();
        System.out.print("İkinci sayiyi girin: ");
        int n2 = input.nextInt();
        System.out.print("Yapacagin islemi sec (+, -, *, /): ");
        char islem = input.next().charAt(0);

        switch (islem){
            case '+':
                System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
                break;

            case '-':
                System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
                break;

            case '*':
                System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
                break;
                
            case '/':
                if (n2 != 0) {
                    System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
                } else {
                    System.out.println("Bir sayiyi 0'a bölemezsiniz.");   
                } break;

            default:
                System.out.println("Geçersiz işlem! Lütfen +, -, *, / karakterlerinden birini girin.");
                break;
        }
    }
}