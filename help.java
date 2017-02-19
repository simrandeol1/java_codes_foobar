
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class help {
    public static void karla() throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(reader.readLine());
        int i=0;
        while(i<input)
        {
            int k = Integer.parseInt(reader.readLine());
            double sqrt = Math.sqrt(k);
            int x = (int) sqrt;
            if(Math.pow(sqrt,2) == Math.pow(x,2))
                System.out.println(1);
            else 
                System.out.println(0);

            i++;
        }
        
    }
    public static void main(String[] args) throws IOException
    {
        karla();
    }
}
