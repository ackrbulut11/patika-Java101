
import java.util.Scanner;

public class Taksimetre {

    double sonfiyat; 

    
    @SuppressWarnings("resource")
    void fiyatHesapla(){
        double kmbasi = 2.20;
        int acilis = 10, min = 20, km;

        Scanner input = new Scanner(System.in);
        System.out.print("Gidilecek mesafe kaç km? ");
        km = input.nextInt();
        

        sonfiyat = km * kmbasi + acilis;  
        
        if(sonfiyat < 20){
            sonfiyat = min;
        }

        System.out.println(sonfiyat);

    }
    public static void main(String[] args){
        Taksimetre taksi = new Taksimetre();  
        taksi.fiyatHesapla();      

    }
    public double getSonfiyat() {
        return sonfiyat;
    }
    public void setSonfiyat(double sonfiyat) {
        this.sonfiyat = sonfiyat;
    }
}
