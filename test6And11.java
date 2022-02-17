import java.util.Arrays;
public class test6And11 {

    public static void main(String[] args){
        int[] numbers = new int[] {1, 2, 9, -7, 5, 8, 7, -15, 3, 10 };
        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Sorted by Descending : " + Arrays.toString(SortDescending(numbers)));
        System.out.println("Sorted by Ascending : " + Arrays.toString(SortAscending(numbers)));

        


    }


    public static int[] SortDescending (int[] arr) {
        int lenght = lenght(arr);
        for (int i = 0; i < lenght ; i++)   
        {  
            for (int j = i + 1; j < lenght ; j++)   
            {     
                int tmp = 0;  
                if (arr[i] < arr[j])   
                {  
                    tmp = arr[i];  
                    arr[i] = arr[j]; 
                    arr[j] = tmp;  
                }  
            }  
            
       }  
        return arr;
    }
    public static int[] SortAscending  (int[] arr) {
        int lenght = lenght(arr);
        for (int i = 0; i < lenght ; i++)   
        {  
            for (int j = i + 1; j < lenght ; j++)   
            {     
                int tmp = 0;  
                if (arr[i] > arr[j])   
                {  
                    tmp = arr[i];  
                    arr[i] = arr[j]; 
                    arr[j] = tmp;  
                }  
            }  
            
       }  
        return arr;
    }

    public static int lenght  (int[] num) {
        int lenght=0;
        for(int i : num){
            lenght++;
        }
        return lenght;
    }

}
