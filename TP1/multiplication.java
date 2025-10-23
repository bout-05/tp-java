import java.util.Scanner;

public class multiplication {
    
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);  
        System.out.print("Entrer un nombre pour aficher sa table de multiplucation :");
        int nbrT = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.print(nbrT +" * "+i+" = "+(nbrT*i)+"\n");
        }
        sc.close();
    }   
}
