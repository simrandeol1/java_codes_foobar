import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class aloo {
    
    
    public static void alo() throws IOException
    { BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String input = reader.readLine();
    String[] ints = input.split(" ");
    int int1 ,int2,max=0;
    int1 = Integer.parseInt(ints[0]);
    int2 = Integer.parseInt(ints[1]);
    int[] cases = new int[int1];
    int j=0;
    while ( j < int1){
    cases[j] = Integer.parseInt(reader.readLine());
     j=j+1;}
    int k = int2;
   
    while (k <= int1){
         int l =0;
    while (l<int1-k+1)
        
    {
        int sum = 0;
        for (int a = 0; a<k;a++){
          sum = sum + cases[l+a];}
          if (sum>max){max = sum;}
    
    
    
    
   l=l+1; }
    
    k=k+1;}
    System.out.println(max);
    
    
    
    }
    public static void main(String[] args) throws IOException{
    alo();
    
}
}