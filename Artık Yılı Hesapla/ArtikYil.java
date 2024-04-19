import java.util.Scanner;

public class ArtikYil {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int yil;

        System.out.print("Sene girin: ");
        yil = input.nextInt();

        if (yil % 100 == 0){
            if (yil % 400 == 0){
                System.out.println(yil + " bir artik yildir.");
            }else {
                System.out.println(yil + " bir artik yil degildir.");
            }
        } else {
            if (yil % 4 == 0){
                System.out.println(yil + " bir artik yildir.");
            } else {
                System.out.println(yil + " bir artik yil degildir.");
            }
        }
    }
}