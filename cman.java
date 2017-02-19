import java.util.Scanner;

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
    
    public static void anti(){
    Scanner t = new Scanner(System.in);
    int num = t.nextInt();
      t.nextLine();
    for (int i =0; i<num;i++){
        String str3="";
        String str1= t.nextLine();
        String str2 = t.nextLine();
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
        
    }
            
            
            }
    public static void main(String[] args){
    anti();}
    
    
    
}
