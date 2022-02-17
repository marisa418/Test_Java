import java.util.Scanner; 
public class test4 {
    public static void main(String[] args) {
        System.out.println("Test 4");
        Scanner number = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Input Number: ");
        int n = number.nextInt();
        int m = n;
          for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++)
             System.out.print(" ");
            for (int k = 0; k < ((2 * m) - 1); k++)
             System.out.print("*");
            System.out.println();
            m = m - 1;
           }
         
}
}
