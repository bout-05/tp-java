import java.util.Scanner;
public class IMC {
    
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);  
        System.out.print("Saisez votre taille en (m) :");
        double taille = sc.nextDouble();
        System.out.print("lsiasez votre masse en (Kg) :");
        double masse = sc.nextDouble();
        double res1 = masse/(taille*taille);
        System.out.printf("Votre IMC est : %.2f", res1);

        sc.close();
    }      
}
