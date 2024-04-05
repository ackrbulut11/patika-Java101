
import java.util.Scanner;

public class BMI{
    
    @SuppressWarnings("resource")
    public static String bmiHesapla() {
        Scanner input = new Scanner(System.in);
    
        System.out.print("Kilonuzu girin (kg): ");
        int kg = input.nextInt();
        
        System.out.print("Boyunuzu girin (cm): ");
        int boy = input.nextInt();
        
        double bmiDeger = kg / (((double)boy / 100) * ((double)boy / 100));
        String bmi;
    
        if (bmiDeger <= 18.5){
            bmi = "Underweight";
        } else if(bmiDeger < 25){
            bmi = "Normal";
        } else if (bmiDeger < 30){
            bmi = "Overweight";
        } else if (bmiDeger < 35){
            bmi = "Obese";
        } else {
            bmi = "Extremely Obese";
        }
    
        return   "\n" + bmi + "\n" +  "Vücut kitle indeksi: " + String.format("%.2f",bmiDeger);
    }
    
    public static void main(String[] args){
        
        System.out.println( BMI.bmiHesapla());
        
    }
}
