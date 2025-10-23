import java.util.Scanner;
public class Bareme {
    
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Saiser votre note :");
        double note = sc.nextDouble();
        if (note > 0 && note <= 20) {
            if (note < 10) 
                System.out.print("Votre Note :F \n");
            else if(note >= 10 && note < 12)
                System.out.print("Votre Note :D \n");
            else if(note >= 12 && note < 14)
                System.out.print("Votre Note :C \n");
            else if(note >= 14 && note < 16)
                System.out.print("Votre Note :B \n");
            else
                System.out.print("Votre Note :A \n");
        }
        sc.close();
    }   
}
