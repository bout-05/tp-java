import java.util.Scanner;

public class primalite {
    
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in); 
        System.out.print("Entrer un nombre :");
        int nbrP = sc.nextInt();
        int P = 0;
        for(int i=2;i<nbrP;i++){
            if(nbrP%i == 0)
                P++;
        }
        if(P == 0){
            System.out.print("Le nombre "+nbrP+" est premier.\n");
        }else
            System.out.print("Le nombre "+nbrP+" n'est pas premier.\n");
    sc.close();
    }   
}
