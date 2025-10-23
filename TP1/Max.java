import java.util.Scanner;
public class Max {
    
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrer le premiere nombre :");
        int nbr11 = sc.nextInt();
        System.out.print("Entrer la deuximme nombre :");
        int nbr12 = sc.nextInt();
        System.out.print("Entrer la troisiemme nombre :");
        int nbr13 = sc.nextInt();
        int max = nbr11;
        if(nbr12 > max){
            max = nbr12;
            if(nbr13 > max){
                max = nbr13;
            }
        }else if(nbr13 > max){
            max = nbr13;
        }
        System.out.print("Le nombre maximale entre cest trois nombres "+nbr11+", "+nbr12+" et "+nbr13+" est :"+max+"\n");
        sc.close();
    }   
}
