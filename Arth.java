//Arthmetic Operation
public class Arth {
    public static void main(String arg[])
    {
        int num1 = 7;
        int num2 = 10;
        int num = 25;
        int nuum = 25;
        int numm = 25;

        int add = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        int div = num1/num2;     //In result we get quotient
        int div2 = num1 % num2;  //In result we get reminder
        int res = num++;     //In result we will get post-increment value of given input. Fetch the value and then increment
        int ress = ++nuum;     //In result we will get pre-increment value of given input. In this first increment and then fetch the value
        int rees = numm--;     //In result we will get decrement value of given input
        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(div2);
        System.out.println(res);
        System.out.println(ress);
        System.out.println(rees);
    }  
}
