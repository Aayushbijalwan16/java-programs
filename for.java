// Ex of Loop statement for loop with nested for loop 
public class For {
    public static void main(String[] args) {
     
        for(int i=1; i<=7 ; i++){
            System.out.println("Day" + i);
            for(int j=1; j<=9; j++){
                System.out.println("" + (j+8) + " - " + (j+9));
            }
        }
    }
}