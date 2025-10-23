import java.util.Scanner;

public class Somme{
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);  
        System.out.print("Entrer le premiere nombre :");
        int nbr1 = sc.nextInt();
        System.out.print("Entrer la deuxiemme nombre :");
        int nbr2 = sc.nextInt();
        System.out.print("la somme de "+nbr1+" + "+nbr2+" = "+(nbr1+nbr2));
        System.out.println();
        sc.close();
    }   
}
