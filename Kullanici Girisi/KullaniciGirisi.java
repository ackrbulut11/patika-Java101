import java.util.*;

public class KullaniciGirisi {
    @SuppressWarnings("resource")
    public static void main(String[] args){

        HashMap<String, String> userDict =  new HashMap<>();
        userDict.put("ackrbulut11", "deneme123" );
        userDict.put("patika.dev", "patika123" );
        userDict.put("username", "password" );

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Kullanici adi: ");
            String userName = input.nextLine();
            System.out.print("Parola: ");
            String password = input.nextLine();

            if (userDict.containsKey(userName)) {
                if (userDict.get(userName).equals(password)) {
                    System.out.println("Giris basarili!");
                    break; 
                } else {
                    System.out.println("Parola yanlis! ");

                    System.out.print("Parolayi yenilemek ister misin? (e/h): ");
                    String soru = input.nextLine();

                    switch (soru.toLowerCase()) {
                        case "e":
                            System.out.print("Yeni parolayi girin: ");
                            String newPassword = input.nextLine();

                            if (!newPassword.equals(password)) {
                                userDict.put(userName, newPassword);
                                System.out.println("Parola basariyla degistirildi! ");
                            } else {
                                System.out.println("Yeni parola eskisiyle ayni olamaz! ");
                            } break;

                        case "h":
                            System.out.print("Tekrar parolayi girin: ");
                            password = input.nextLine(); 
                            if (userDict.get(userName).equals(password)) {
                                System.out.println("Giris basarili!");
                                break; 
                            } else {
                                System.out.println("Cok fazla hatali giris yaptiniz...");
                                break;
                            }

                        default:
                            System.out.println("Gecersiz giris! Lutfen 'e' veya 'h' girin.");
                            break;
                    }
                }
            } else {
                System.out.println("Kullanici adi yanlis!");
            }
        }
    }
}