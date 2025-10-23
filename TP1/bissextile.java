import java.util.Scanner;
public class bissextile {
    
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrer l'Annee :");
        int annee = sc.nextInt();
        if(annee%4==0 && annee%400==0)
            System.out.print("L'annee "+annee+" est bissextile. \n");
        System.out.print("L'annee "+annee+" n'est pas bissextile. \n");
        sc.close();
    }   
}
