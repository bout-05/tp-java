import java.util.Scanner;

public class Collatz {
    
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in); 
        System.out.print("Entrer un nombre supperieur a (1) pour Collatz :");
        int nbrC = sc.nextInt();
        if(nbrC > 1){
            int cont = 0;
            while (nbrC != 1) {
                if(nbrC % 2 == 0){
                    nbrC /= 2;
                    cont++;
                }else{
                    nbrC = (3*nbrC)+1;
                    cont++;
                }
            }
        System.out.print("le nombre des etapes est :"+cont);
        }else
            System.out.print("Entrer un nombre positif >1.\n");

        sc.close();
    }  
}
