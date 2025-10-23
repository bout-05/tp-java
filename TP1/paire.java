import java.util.Scanner;
public class paire {
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);  
        System.out.print("Entrer un nombre :");
        int nbr1 = sc.nextInt();
        int res1 = (nbr1 % 2 == 0) ? 1 : 0;
        if(res1 ==1 )
            System.out.print("le nombre "+nbr1+" est paire");
        else
            System.out.print("le nombre "+nbr1+" est impaire \n");
        sc.close();
    }   
}
