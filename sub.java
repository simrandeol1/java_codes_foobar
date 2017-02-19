import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class subtract {
    public static void sub() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(reader.readLine());
        int i=0;
        while(i<input){
            String[] nums = reader.readLine().split(" ");
            int num1 = Integer.parseInt(nums[0]);
            int num2 = Integer.parseInt(nums[1]);
            int count=0;
            while(num1>0 && num2>0){
                if(num1>=num2){
                    count++;
                    num1=num1 - num2;
                }
                else {
                    count++;
                    num2 = num2 - num1;
                }
            }
            System.out.println(count);
            i++;
        }
    }
    public static void main(String[] args) throws IOException{
        sub();
    }
    
}
