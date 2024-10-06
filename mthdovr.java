//Method Overloading
import java.util.*;
class Calci
{
    public int add(int a, int b)
    {
        return a + b;
    }
    public int add(int a, int b, int c){ // Creating new method with same name but different paramrter 
        return a + b + c;
    }
    public double add(double a, int b){
        return a + b;
    }
}

public class mthdovr {
    public static void main(String arg[])
    {
        Calci obj = new Calci();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();
        int r1 = obj.add(a,b);
        System.out.println("The result is: " + r1);
    }
}
