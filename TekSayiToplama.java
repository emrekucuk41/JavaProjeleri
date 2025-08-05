import java.util.Scanner;
public class TekSayiToplama {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sayi,toplam =0;
        System.out.print("Gireceğiniz sayıya kadar olan tüm tek sayıların toplamı bulunacaktır. \nSayı giriniz:");
        sayi = input.nextInt();

        for(int i=0;i<=sayi;i++){
            if(i%2 == 1){
               toplam += i;
            }
        }
        System.out.print("Girdiğiniz sayıya kadar olan tüm tek sayıların toplamı: "+toplam);

    }
    
}
