import java.util.Scanner;

public class Fibonacci {
    
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in); 
        System.out.print("Entrer un nombre pour afficher tout les nombre premier qui inferieure a ce nombre :");
        int nbrIn = sc.nextInt();
        for(int i=2;i<=nbrIn;i++){
        int PP= 0;
            for(int h=2;h<i;h++){
                if(i%h == 0)
                    PP++;
            }
            if(PP == 0){
                System.out.print(i+" .");
            }
        }
        System.out.print(" sont des nombres premier \n");
    sc.close();
    }  
}
