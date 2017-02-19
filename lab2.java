import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class lab2_2 {
    
    
    public static int[] insert(int x, int[] num, int initial)
    {  
        int index=0;
        int temp1;
        int temp2=0;
        for (int i =0; i<num.length;i++)
        {
        if (x<num[i])
        {
        index=i;
        break;
        }
        else if(i == num.length-1) { 
            num[initial]=x;
           System.out.println(""+ initial+1 + " " + 0);
           return num;
        }
       
        
        }
           temp1=num[index];
        for (int j =index;j<=initial; j++){
           
            temp2 = num[j+1];
            if(j==index){
            num[j]=x;
            }
            num[j+1]= temp1;
            temp1=temp2;
        }
        System.out.println(""+(initial+1)+ " "+ (initial - index) );
        return num;
    }
    
    public static int[] delete(int x, int[] num,int initial){
        int index=0;
    for(int i=0;i<initial;i++){
    if (num[i]==x){
    index=i;
    break;}
    }
    for(int j=index;j<initial;j++){
    num[j]=num[j+1];}
    System.out.println("" + (initial-1 )+ " " + (initial-index-1));
    return num;
    }
    
    public static void solver() throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        String[] parts = input.split(" ");
        int max = Integer.parseInt(parts[0]);
        int initial = Integer.parseInt(parts[1]);
        int cases = Integer.parseInt(parts[2]);
        String arr = reader.readLine();
        String[] ar = arr.split(" ");
        int[] nums = new int[max];
        for (int i =0 ; i<initial;i++)
        {
           nums[i]= Integer.parseInt(ar[i]);
        }
        for(int j=0;j<cases;j++){
        String test = reader.readLine();
        String[] tests=test.split(" ");
        if (Integer.parseInt(tests[0])==1){
            if(initial!=max){
        nums = insert(Integer.parseInt(tests[1]),nums,initial);
        initial=initial+1;}
            else System.out.println("0 "+nums.length);}
        else if (Integer.parseInt(tests[0])==2){
          nums =  delete(Integer.parseInt(tests[1]),nums,initial);
          initial = initial -1;
        }
        else {
        for (int k=0;k<initial;k++)
        {
        System.out.print(nums[k]);
        System.out.print(" ");
        }
        System.out.println();}
            
        }

    }
    
    public static void main(String[] args) throws IOException{
    solver();}
    
}

