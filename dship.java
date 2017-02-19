import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class dship {
    public static void calc() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(reader.readLine());
        int i=0;
        while(i<input){
            int[] char1 = new int[26];
            int[] char2 = new int[26];
            String str1 = reader.readLine();
            String str2 = reader.readLine();
            if (str1.length()!=str2.length()){
                System.out.println("Yes");
                i++;
                continue;
            }
            String alpha="abcdefghijklmnopqrstuvwxyz";
            int j=0;
            for(j=0;j<str1.length();j++){
                int index1 = alpha.indexOf(str1.charAt(j));
                int index2 = alpha.indexOf(str2.charAt(j));
                char1[index1] = char1[index1]+1;
                char2[index2] = char2[index2] + 1;
                
                }
            for(int e=0;e<26;e++){
                if(char1[e]!=char2[e]){
                    System.out.println("Yes");
                    break;
                }
                if (e==25){
                    System.out.println("No");
                }
            }
            i++;
        }
        }
    public static void main(String[] args) throws IOException{
        calc();
    }
    
    
}
