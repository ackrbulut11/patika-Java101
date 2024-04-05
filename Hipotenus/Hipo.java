

import java.util.Scanner;

public class Hipo{

    void Hesaplama(int a, int b){
        double akare = Math.pow(a, 2);
        double bkare = Math.pow(b, 2);
        double hipokare = akare + bkare;
        double hipo = Math.sqrt(hipokare);
        System.out.println("Hipotenüs: " + hipo);
    }

    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci kenar: ");
        int a = input.nextInt();
        System.out.print("İkinci kenar: ");
        int b = input.nextInt();

        Hipo hipoHesaplama = new Hipo();
        hipoHesaplama.Hesaplama(a,b);
    }

 }
