//Printing Natural number using user input
import java.util.*;
public class Sntrn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting number");
        int n = sc.nextInt();
        System.out.println("Enter the Last number");
        int l = sc.nextInt();
        
        int totalSum = 0; // Initialize a variable to store the cumulative sum
        
        for(int i=n; i<=l; i++){
            System.out.println("" + i);
            totalSum += i; // Add the current number to the cumulative sum
        }
        
        System.out.println("The sum of numbers from " + n + " to " + l + " is: " + totalSum);
        sc.close();
    }
}