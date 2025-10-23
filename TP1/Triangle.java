import java.util.Scanner;
public class Triangle {
    
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrer a :");
        double a = sc.nextDouble();
        System.out.print("Entrer b :");
        double b = sc.nextDouble();
        System.out.print("Entrer c :");
        double c = sc.nextDouble();
        if(a==b && b==c)
            System.out.print("le triangle est equilateral.\n");
        else if(a==b || b==c || c==a)
            System.out.print("le triangle est isocele.\n");
        else
            System.out.print("le triangle est scalene.\n");
        sc.close();
    }   
}
