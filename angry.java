import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class prof {
    public static void angry() throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(reader.readLine());
        int i=0;
        while(i<input)
        {
            String[] cases  = reader.readLine().split(" ");
            int count=0;
            
            String[] y = reader.readLine().split(" ");
            for(int b=0;b<y.length;b++){
           int n=Integer.parseInt(y[b]);    
             if (n<=0){
            count++;}
             }
            if(Integer.bitCount(count)<Integer.parseInt(cases[1]))
                  System.out.println("YES");
            else 
                System.out.println("NO");
            
            i++;
        }
    }
    public static void main(String[] args) throws IOException{
    angry();}
    
}
