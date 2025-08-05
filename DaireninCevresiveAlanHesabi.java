import java.util.Scanner;

public class DaireninCevresiveAlanHesabi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        final double PI = 3.14;
        double r;

        System.out.print("Dairenin yarıçapını giriniz:");
        r = input.nextDouble();

        System.out.println("Dairenin çevresi: "+ 2*PI*r);
        System.out.print("Dairenin alanı : " + PI*Math.pow(r,2));


    }
    
}
