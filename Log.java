//Logical Operation
public class Log {
    public static void main(String[] arg)
    {
      int x = 10;
      int y = 15;
      int a = 20;
      int b = 25;

      boolean result = x > y && a > b;  //AND Operator
      boolean result1 = x > y || a < b; //OR Operator
      System.out.println(result);
      System.out.println(result1);
      System.out.println(!result1);  // NOT Operator
    }
}
