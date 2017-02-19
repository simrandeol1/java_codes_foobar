import java.io.BufferedReader;
import java.io.InputStreamReader;






public class Anticman {
    public static String sortstr(String mystr)
	{
      String mystr2=mystr;
		for (int  i =1;i<mystr2.length();i=i+1){
			for (int j = 0; j<i;j=j+1 ){
				if (mystr2.charAt(i)<=mystr2.charAt(j)){
					mystr2=mystr2.substring(0,j)+ mystr2.charAt(i)+mystr2.substring(j,i)+mystr2.substring(i+1);
		
				}
			}
		
		}
		return mystr2;
		
	}
    
    public static void anti() throws Exception  {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(reader.readLine());
   

    
    
     int i =0;
    while( i<num){
        String str3="";
        String str1= reader.readLine();
        String str2 = reader.readLine();
        /*char[] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int[] list1 = new int[26];
        int[] list2 = new int[26];
        for (int j=0;j<str1.length();j=j+1){
                 char a = str1.charAt(j);
        char b = str2.charAt(j);
               }*/
       int l = str1.length();
        for (int j =0 ; j<l ; j=j+1){
        char x = str1.charAt(j);
        if (str2.indexOf(x)!= -1){
            str3 = str3 + x;
        int y = str2.indexOf(x);
        str2= str2.substring(0,y) + str2.substring(y+1);}
        }
        
        str3 = sortstr(str3);
        System.out.println(str3);
        i=i+1;
    }
            
    
            }
    public static void main(String[] args) throws Exception{
    anti();}
    
    
    
}
