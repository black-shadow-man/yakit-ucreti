
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        /*aracın kilomtre basına yaktıgı yakıt.yakıt*/
        System.out.println("araciniz 100 kmde kac litre yakit harciyor?");
        Scanner scanner = new Scanner(System.in);
        double yakit = scanner.nextDouble();
        double km_basi_yakit = yakit/100;
        
        /*arac kac km yol yapti*/
        System.out.println("araciniz kac km yol yapti ?");
        double yol = scanner.nextDouble();
        
        double yakit_ucreti = 47;
        double toplam_ucret = km_basi_yakit*yol*yakit_ucreti;
        System.out.println("toplam vermeniz gereken ucret: " + toplam_ucret +" tl");
        
    }
    
    
}
