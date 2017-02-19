 import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class bit {
   
	public static void alo() throws IOException{ 
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(reader.readLine());
		int i=0;
		while(i<input){
                        int count=0;
			long number = Long.parseLong(reader.readLine());
			long num = number;
                        while(num>0){
                            if(num%2==1){
                                count++;}
                            num=num/2;
                        }
                        System.out.println(count);
                        

			i++;
		}
}
        public static void main(String[] args) throws IOException{
            alo();
        
        }
}
