import java.io.BufferedReader;
import java.io.InputStreamReader;






public class Anticman {
    
    
    public static void anti() throws Exception  {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(reader.readLine());
   

    
    
     int i =0;
    while( i<num){
        String str1= reader.readLine();
        String str2 = reader.readLine();
        String alpha="abcdefghijklmnopqrstuvwxyz";
        int[] list1 = new int[26];
        int[] list2 = new int[26];
        
        for (int j=0;j<str1.length();j=j+1){
                 char a = str1.charAt(j);
        char b = str2.charAt(j);
        int inda = alpha.indexOf(a);
        list1[inda]=list1[inda]+1;
        int indb = alpha.indexOf(b);
        list2[indb]=list2[indb] + 1;}
        for (int e=0;e<26;e=e+1){
        int k = Math.min(list1[e],list2[e]); 
        for (int z=0;z<k;z++){
        System.out.print(alpha.charAt(e));}}
        
               
      i=i+1;
      System.out.println();
    }
            
    
            }
    public static void main(String[] args) throws Exception{
    anti();}
    
    
    
}
