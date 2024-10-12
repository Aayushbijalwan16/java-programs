//Printing Natural number using user input
import java.util.*;
public class Ntr{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting number");
        int n = sc.nextInt();
        System.out.println("Enter the Last number");
        int l = sc.nextInt();
        for(int i=n; i<=l; i++){
            System.out.println(i);
        }
        sc.close();
    }
}