import java.util.Scanner;;
public class HipotenusHesaplama{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double a,b,hipo;

        System.out.println("Üçgenin kenar uzunluklarını giriniz:");
        a = input.nextDouble();
        b = input.nextDouble();

        hipo = Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs uzunluğu: "+ hipo);


    }
}