import java.util.Scanner;
public class FatöoriyelHesaplama {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int faktoriyel,carpma=1;

        System.out.print("Hesaplamak istediğiniz faktoriyel sayısını giriniz:");
        faktoriyel = input.nextInt();

        for(int i=1;i<=faktoriyel;i++){
            carpma *=i;
        }
        System.out.print(carpma);
    }
    
}
