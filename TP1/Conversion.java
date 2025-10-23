import java.util.Scanner;
public class Conversion {
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);  
        System.out.print("Entrer le degre en Celsuis :");
        int degre = sc.nextInt();
        double res = degre * 9/5 +32; 
        System.out.print("le degre "+degre +"C = "+res+" F.");
        System.out.println();

        sc.close();
    }   
}
