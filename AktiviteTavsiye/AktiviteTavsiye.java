import java.util.Random;
import java.util.Scanner;

public class AktiviteTavsiye {
    @SuppressWarnings("resource")
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Hava sicakligi: ");
        int sicaklik = input.nextInt();

        if (sicaklik < 0){
            System.out.println("Kayak yapmaya gidebilirsin.");
        } else if (sicaklik >= 0 && sicaklik < 25){
            if (sicaklik < 5){
                System.out.println("Evde film izleyebilirsin.");
            } else if (sicaklik < 10){
                Random rand = new Random();
                int rand1 = rand.nextInt(2) + 1; // 0 ile 1 arasında bir değer döndürür. (+1 vererek 1 ve 2 arasında hale getirdim.)
                switch (rand1){
                    case 1:
                        System.out.println("Evde film izleyebilirsin.");
                        break;

                    case 2:
                        System.out.println("Sinemaya veya tiyatroya gidebilirsin.");
                        break;
                }
            }

        } else if(sicaklik >= 10 && sicaklik < 15){
            System.out.println("Sinemaya veya tiyatroya gidebilirsin.");
            
        } else if (sicaklik >= 15 && sicaklik < 25){
            System.out.println("Piknik yapmaya gidebilirsin.");
                
        } else if (sicaklik >= 25 && sicaklik < 35){
            System.out.println("Yüzmeye gidebilirsin.");

        } else {
            System.out.println("Haca cok sicak, evde kal!");

        }
    }
}

