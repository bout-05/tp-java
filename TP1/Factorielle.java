import java.util.Scanner;
public class Factorielle {
    
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in); 
        System.out.print("Entrer un nombre pour aficher sa factorielle :");
        int nbrF = sc.nextInt();
        int resF = 1;
        for(int i=1;i<=nbrF;i++){
            resF *= i;
        }
        System.out.print("Le factorielle de "+nbrF+" est :"+resF+".\n");
        sc.close();
    }   
}
