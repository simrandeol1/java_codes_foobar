import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class game {
    public static void games() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(reader.readLine());
        int i=0;
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        while(i<input){
            int[] num = new int[26];
            String k = reader.readLine();
            for(int j=0;j<k.length();j++){
                char x = k.charAt(j);
                int index = alpha.indexOf(x);
                num[index]++;
            }
            int max=0;
            int mindex=0;
            int count =0;
            int e;
            for (e=0;e<26;e++){
               if(max < num[e]){
                   max = num[e];
                   mindex = e;
               } 
               count = count + num[e];
            }
            if((count-max)<max){
                System.out.println(alpha.charAt(mindex));
            }
            else{
                System.out.println(-1);
            }
            
            
            i++;
        }
    }
    public static void main(String[] args) throws IOException{
        games();
    }
    
}
