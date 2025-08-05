
import java.util.Scanner;

public class IkininKuvvetleriniBulma {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sayi;
        
        

        System.out.print("Sayı giriniz:");
        sayi = input.nextInt();

        for(int i=1;i<=sayi;){
            i=i*2;
            System.out.println(i);
            
        }

    }
    
}