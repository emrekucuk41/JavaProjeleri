import java.util.Scanner;
public class FaktoriyelHesaplama{
    public static void main(String[] args) {
        int sayi,sayac = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Faktoriyel değerinin hesaplanılması istenilen sayıyı giriniz:");
        sayi = input.nextInt();

        for(int i =1 ;i<=sayi;i++){
            sayac =sayac*i;
            System.out.println(i + "!=" + sayac);
        }
        System.out.print(sayi + "!=" + sayac);


        
    }


}