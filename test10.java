import java.util.Scanner; 
public class test10 {
    public static void main(String[] args) {
        System.out.println("Test 10");
        Scanner number = new Scanner(System.in);
        System.out.print("Input Number: ");
        int n = number.nextInt();
          for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++)
             System.out.print(" ");
            for (int k = 0; k < ((2 * i) + 1); k++)
             System.out.print("*");
            System.out.println();
           }
         
}
}
