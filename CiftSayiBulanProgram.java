import java.util.Scanner;

public class CiftSayiBulanProgram {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Hangi sayıya kadar olan çift sayıları bulmak istersin:");
        int sayi = input.nextInt();

        for(int i=0;i<=sayi;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        
        /*int j = 0;
        while(j<=sayi){
            System.out.println(j);
            j = j+2;                 
        }*/
    
    }
    
}
