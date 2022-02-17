import java.util.Scanner; 
public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        System.out.println("Enter the array element");
        //For reading the element
        for(int i=0;i<10;i++) {
            System.out.print("Arr["+i+"] : ");
            a[i] = sc.nextInt();
        }
        //For print the array element
    }
}

