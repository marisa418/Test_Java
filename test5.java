import java.util.Scanner; 

public class test5 {
    public static void main(String[] args) {
        System.out.println("Test 5");
        Scanner number = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Input Number: ");
        int n = number.nextInt();
        int m[] = {1,2,3,4,5,6,7,8,9,0};
        int y = 0;
          for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++)
             System.out.print(" ");
            for (int k = 0; k < (i + 1); k++){         
                if(y <= 9){
                    System.out.print(m[y]+" ");
                    y= y+1;
                }
                else if(y > 9){
                    y= 0;
                    System.out.print(m[y]+" ");
                    y= y+1;

                }
            }
             
            System.out.println();
           }
         
}
 }