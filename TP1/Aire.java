import java.util.Scanner;
public class Aire {
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);  
        System.out.print("Entrer le rayyon de cercle C :");
        double rayyon = sc.nextDouble();
        System.out.print("Aire de cercle C est :"+ (Math.PI * rayyon * rayyon));
        System.out.println();

        sc.close();
    }   
}
