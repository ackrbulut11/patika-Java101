import java.util.Scanner;

public class OrtalamaHesaplama {
    public static void main(String[] args) {
        double inf102, inf104, inf110, mat, tur, ing, alm; // 2. dönem dersleri

        try (Scanner input = new Scanner(System.in)) { // try kullanmadıgında da çalışır fakat sızıntı uyarısı veriyor.
            System.out.print("inf102: ");
            inf102 = input.nextDouble();

            System.out.print("inf104: ");
            inf104 = input.nextDouble();

            System.out.print("inf110: ");
            inf110 = input.nextDouble();

            System.out.print("mat: ");
            mat = input.nextDouble();

            System.out.print("tur: ");
            tur = input.nextDouble();

            System.out.print("ing: ");
            ing = input.nextDouble();

            System.out.print("alm: ");
            alm = input.nextDouble();

            double ortalama = ((inf102 + inf104 + inf110 + mat) * 6 + (tur + ing + alm) * 2) / 30; //ağırlıklarına göre hesaplandı.
            System.out.println("Ortalama: " + ortalama);
            
            if (ortalama >= 60){
                System.out.println("Sinifta kaldin.");
            }else{
                System.out.println("Tebrikler gectin.");
            }

        }
    }
}
