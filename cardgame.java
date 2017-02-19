import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class cardgame {
    public static void calc() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(reader.readLine());
        int i=0;
        while(i<input){
            String[] nums = reader.readLine().split(" ");
            long m = Long.parseLong(nums[0]);
            long n = Long.parseLong(nums[1]);
            long q = Long.parseLong(reader.readLine());
            long j=0;
            
            while(j<q){
                long size = Long.parseLong(reader.readLine());
                if(size<=m && size<=m){
                double cards = Math.ceil((double)m/size) * Math.ceil((double)n/size);
                System.out.println((long)cards%1000000007);}
                else
                {System.out.println(0);}
                j++;
            }
            i++;
        }
        
        
        
        
    }
    public static void main(String[] args) throws IOException{
        calc();
    }
    
}
