import java.util.Scanner; 
public class test1 {
    public static void main(String[] args) {
        int[] num= new int[] {1 ,2, 3, 4, 5};
        int sum = 5;
        int lenght = lenght(num);
        for (int i = 0; i < lenght; i++) 
        {
            for (int j = i+1; j < lenght; j++) 
            {
                if(num[i]+num[j]==sum){
                    System.out.println(num[i]+","+num[j]); 
                }
            }           
        }
        

    }

    public static int lenght  (int[] num) {
        int lenght=0;
        for(int i : num){
            lenght++;
        }
        return lenght;
    }
}

