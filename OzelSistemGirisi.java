import java.util.Scanner;
public class OzelSistemGirisi {
    public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         String kullanicisifresi = "emreemre",sifre;

         do{  
            System.out.print("Lütfen şifrenizi giriniz:");
            sifre = input.nextLine();
            if(sifre.equals(kullanicisifresi)){
                System.out.println("Başarıyla giriş yaptınız.");
            }else{
                 System.out.println("Girdiğiniz şifre yanlıştır.Sistem kendinini korumaya aldı.30 dk sonra tekrar deneyiniz.");
            }

         }while(false);
        



    }

    
}
