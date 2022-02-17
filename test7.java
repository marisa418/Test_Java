import java.util.Scanner; 
public class test7 {
    public static void main(String[] args) {
        System.out.println("Test 7");
        Scanner Time= new Scanner(System.in);
        System.out.print("Input Time (S): ");
        int time = Time.nextInt();
        int s = 0;
        int m = 0;
        int h = 0;
        if (time < 60){
            s = time;
        }   
        if(time >= 60 && time < 3600){
            if(m <= 60 ){
                m = time/60;
                s = time - (m * 60);
            }
        }
        if(time > 60 && time >= 3600){
            h=time/3600;
            m=(time-(h*3600))/60;
            s=(time-(h*3600)-(m*60));
        }

        System.out.print(String.format("%02d:", h));
        System.out.print(String.format("%02d:", m));
        System.out.print(String.format("%02d", s));
}
}
