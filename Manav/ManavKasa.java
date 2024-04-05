
import java.util.Scanner;

public class ManavKasa {
    @SuppressWarnings("resource")
    public static void main(String[] args){

        double toplam = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ürünlerimiz: \n \n Armut 2,14 \n Domates 1,11\n Elma 3,67 \n Muz 0,95\n Patlican 5,00 \n");

        boolean loop = true;
        
        while (loop){

            System.out.print("Almak istediğiniz ürünün baş harfini girin (cikmak için 'q'): ");
            String mal = input.nextLine().toLowerCase(); // Küçük harfe dönüştür
            if (mal.equals("q")) {
                loop = false;
                continue; // Döngünün geri kalanını atla
            }
            System.out.print("Kaç adet/kilo: ");
            int miktar = input.nextInt(); 
            input.nextLine(); // Boş satırı oku

            switch(mal){
                case "a":
                    toplam += miktar * 2.14;
                    break;

                case "d":
                    toplam += miktar * 1.11;
                    break;

                case "e":
                    toplam += miktar * 3.67;
                    break;

                case "m":
                    toplam += miktar * 0.95;
                    break;

                case "p":
                    toplam += miktar * 5;
                    break;  

                default:
                    System.out.println("Geçersiz bir ürün girdiniz!");
            }  
        
            System.out.println("Toplam Tutar: " + toplam);
        }

        System.out.println("Ödenecek tutar: " + toplam);
    }    
}
