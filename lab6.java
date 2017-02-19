import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author HP
 */
public class lab6 {
    
    
    
    
    

      
    private static int Precedence(String x){
        if (x.equals("(")){
            return 0;
        }
        else if(x.equals("-") || x.equals("/")){
            return 1;
        }
        else if (x.equals("+")|| x.equals("*")){
            return 2;
        }
        else return 3;
    }
    
    private static void convert() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(reader.readLine());
        String[] n = new String[input];
        int top = -1;
        String[] tokens = reader.readLine().split(" ");
        String num = "0123456789";
        for (int i=0;i<tokens.length;i++){
            if(num.contains(tokens[i])){
                System.out.print(tokens[i] + " ");
            }
            else {
                if (top==-1){
                    n[top+1]=tokens[i];
                    top =top+1;
                }
                else if (tokens[i].equals("(") && tokens[i+1].equals("/")){
                    n[top+1]="~";
                    top = top+1;
                    i=i+1;
                }
                else if (tokens[i].equals("(")){
                    n[top+1]="(";
                    top=top+1;
                }
                else if (tokens[i].equals(")") && n[top].equals("~")){
                    System.out.print(n[top] + " ");
                    top--;
                }
                else  if (tokens[i].equals(")")){
                    int y=top;
                    while(! n[y].equals("(")){
                        System.out.print(n[top]+ " ");
                        top--;
                        y--;
                    }
                    top--;
                }
                
                    else{
                    while (( top>=0  && Precedence(tokens[i])<= Precedence(n[top]))){
                        System.out.print(n[top]+ " ");
                        top--;
                    }
                    n[top+1]= tokens[i];
                    top++;
                }
               
            
            }
        }
        
        while (top>-1){
            System.out.print(n[top]+ " ");
            top--;
        }   
        System.out.println();
    
   
}

public static void main(String[] args) throws IOException{
    convert();
}

}
