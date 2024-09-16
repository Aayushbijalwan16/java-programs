//Type casting
public class tpcst {

    public static void main(String arg[])
    {
        //byte b = 127;
        int a = 259;
        byte b = (byte) a;

        float f = 9.5f;
        int t = (int) f;
        System.out.println(t);

    }
}
// Type promotion
  class typrm{

    public static void main(String arg[])
    {
        byte a = 10;
        byte b = 30;

        int t = a * b;
        System.out.println(t);

    }
}