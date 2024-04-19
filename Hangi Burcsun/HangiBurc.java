import java.util.Scanner;

public class HangiBurc {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mon, day;
        String burc;

        while (true) {
            System.out.print("Kaçıncı ayda doğdunuz?: ");
            mon = input.nextInt();
            if (mon < 1 || mon > 12) {
                System.out.println("Geçerli bir ay giriniz! (1-12)");
                continue; 
            }

            System.out.print("Hangi gün doğdunuz?: ");
            day = input.nextInt();

            
            int maxDays;
            if (mon == 2) {
                maxDays = 29; // Şubat ayı
            } else if (mon == 4 || mon == 6 || mon == 9 || mon == 11) {
                maxDays = 30; // Nisan, Haziran, Eylül, Kasım ayları
            } else {
                maxDays = 31; 
            }

            if (day < 1 || day > maxDays) {
                System.out.println("Geçerli bir gün giriniz! (" + maxDays + " gün var)");
                continue; 
            }

            // Burç hesaplama
            if (mon == 3) {
                if (day >= 21) {
                    burc = "Koç";
                } else {
                    burc = "Balik";
                }
            } else if (mon == 4) {
                if (day >= 21) {
                    burc = "Boğa";
                } else {
                    burc = "Koç";
                }
            } else if (mon == 5) {
                if (day >= 22) {
                    burc = "İkizler";
                } else {
                    burc = "Boğa";
                }
            } else if (mon == 6) {
                if (day >= 22) {
                    burc = "Yengeç";
                } else {
                    burc = "İkizler";
                }
            } else if (mon == 7) {
                if (day >= 23) {
                    burc = "Aslan";
                } else {
                    burc = "Yengeç";
                }
            } else if (mon == 8) {
                if (day >= 23) {
                    burc = "Başak";
                } else {
                    burc = "Aslan";
                }
            } else if (mon == 9) {
                if (day >= 23) {
                    burc = "Terazi";
                } else {
                    burc = "Başak";
                }
            } else if (mon == 10) {
                if (day >= 23) {
                    burc = "Akrep";
                } else {
                    burc = "Terazi";
                }
            } else if (mon == 11) {
                if (day >= 22) {
                    burc = "Yay";
                } else {
                    burc = "Akrep";
                }
            } else if (mon == 12) {
                if (day >= 22) {
                    burc = "Oğlak";
                } else {
                    burc = "Yay";
                }
            } else if (mon == 1) {
                if (day >= 22) {
                    burc = "Kova";
                } else {
                    burc = "Oğlak";
                }
            } else { 
                if (day >= 20) {
                    burc = "Balik";
                } else {
                    burc = "Kova";
                }
            }

            System.out.println("Burcunuz: " + burc);
            break; 
        }
    }
}

