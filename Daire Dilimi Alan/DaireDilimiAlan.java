import java.util.Scanner;

public class DaireDilimiAlan{

    public static double alanHesapla(){
        float pi = 3.14f;
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.print("Yaricapi girin: ");
        int r = input.nextInt();
        System.out.print("Alfa acisini girin: ");
        int alfa = input.nextInt();
        double alan = pi * (r*r) * alfa / 360;
        return alan;

    }
    public static void main(String[] args){

        System.out.println(DaireDilimiAlan.alanHesapla());

    }
}