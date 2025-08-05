import java.util.Scanner;
public class KullaniciGirisSenaryosu {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String kullanicisifresi = "emreemre",sifre;
        boolean kosul= true;

        while(kosul){
            System.out.print("Lütfen şifrenizi giriniz:");
            sifre = input.nextLine();

            if(sifre.equals(kullanicisifresi)){
                System.out.print("Başarılı giriş yaptınız.");
                kosul =false;
            }else{
                System.out.println("Hatalı giriş yaptınız lütfen tekrar deneyiniz");
            }

        }
    }
    
}
