import java.util.Scanner;
public class Sommede1aN {
    
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in); 
        System.out.print("Entrer un nombre :");
        int nbrN = sc.nextInt();
        int resNf = 0;
        for(int i=1;i<=nbrN;i++){
            resNf += i;
        }
        // int j=0;
        // int resNw = 0;
        // while(j<= nbrN){
        //     resNw += j;
        //     j++;
        // }
        System.out.print("la somme de 1..."+nbrN+" est :"+resNf+"\n");
        sc.close();
    }   
}
