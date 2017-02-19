import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class candles {
    
    public static void candle() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int count = a;
        int b = Integer.parseInt(input[1]);
        while (a>=b){
            count = count + a/b;
            a = a/b + a%b;
        }
        System.out.println(count);
    }
    public static void main(String[] args) throws IOException{
        candle();
    }
    
}
