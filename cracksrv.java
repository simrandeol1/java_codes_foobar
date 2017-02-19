import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class crack {
    public static void crack() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(reader.readLine());
        int i=0;
        while (i<input){
            int m = Integer.parseInt(reader.readLine());
            String k = reader.readLine();
            String str="";
             String find ="01";
             int count =0;
            if(m==0){
                find = "0";
            }
            else if (m==1){
                find="01";
            }
            
            else{
                int t1 = 0;
                int t2 =1;
                int t3;
               
                for (int j=2;j<=m;j++){
                    find = find + Integer.toString(t1 + t2);
                    t3=t1;
                    t1=t2;
                    t2 = t2+t3;
                    }}
                
                while (find.indexOf(k)!=-1){
                    int t = find.indexOf(k);
                    find = find.substring(t+1);
                    count=count+1;
                    
                }
                System.out.println(count);
            
            i++;
        }
    }
    public static void main(String[] args) throws IOException{
        crack();
    }
    
}
