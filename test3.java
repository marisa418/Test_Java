import java.util.Scanner; 

public class test3 {
    public static void main(String[] args) {
        System.out.println("Test 3");
        int n = 10;
        int m[] = {1 ,2 ,3 ,4 ,5 ,7 ,9 ,11 ,12 ,13};
        int y = 0;
        int z=0;
          for (int i = 0; i < n; i++) {
            if(i==0){
                System.out.print(m[y]);   
            }
            else if (i>0){
            int a = m[i-1];
            int b = m[i];
                if((b-a) == 1){
                    System.out.print("-"); 
                    z=i;
                }                
                if((b-a) != 1){                   
                    System.out.print(","+m[i]);  
                }
            }
              
           }
         System.out.print("*"+m[z]);
}
 }