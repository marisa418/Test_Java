import java.util.Arrays;
import java.util.Scanner; 
public class test8 {

    public static void main(String[] args){
        System.out.println("Test 8");
        Scanner number = new Scanner(System.in); 
        System.out.print("Input Price : ");
        int price= number.nextInt();
        System.out.println("Change amount "+(1000-price)+" baht");
        
        String[] ArrChange = Change1(price);

        for(int i=0;; i++){
            
            
                System.out.println(ArrChange[i]);
            
        }




    }

    public static String[] Change1  (int price) {
        String[] a = new String[6];
        int change = 1000 - price;
        int total_change = 0;
        int i = 0;
        if (change > 500){
            a[i] = ("500 = "+change/500 + " piece");
            total_change = change - ((change/500)*500);
            i++;
        }
        if (total_change < 500 ){
            a[i] = ("100 = "+total_change/100 + " piece");
            total_change = total_change - ((total_change/100)*100);
            i++;
        }
        if (total_change < 100 && total_change >= 50){
            a[i] = (" 50 = "+total_change/50 + " piece");
            total_change = total_change - ((total_change/50)*50);
            i++;
        }
        if (total_change < 100 && total_change < 50){
            a[i] = (" 10 = "+total_change/10 + " coin");
            total_change = total_change - ((total_change/10)*10);
            i++;
        }
        if ( (total_change < 10) && (total_change >= 5)){
            a[i] = ("  5 = "+total_change/5+ " coin");
            total_change = total_change - ((total_change/5)*5);
            i++;
        }
        if ((total_change < 10 )& (total_change < 5)){
            a[i] = ("  1 = "+total_change+ " coin");
        }
            return a;
        }
}
