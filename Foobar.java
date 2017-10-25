import java.util.Scanner;
//Scanner tatti tool hai buffered reader use kar. 

public class foobar {
    public static int occ(char charac , String word ){
    int x =0;
    int i=0;
    while (i<word.length()){
        if (word.charAt(i)== charac){
        x=x+1;}
        i=i+1;
         }
    return x;}
    
    public static void foo(){
        Scanner t = new Scanner(System.in);
        int num = t.nextInt();
        t.nextLine();
        int[] list = new int[5];
        for(int d=0;d<num;d=d+1){
        String word = t.nextLine();
        
        int f = occ('f',word);
       
        list[0]=f;
        int o = (occ('o',word));
         o = o/2;
        list[1]=o;
        int b = occ('b',word);
        list[2]=b;
        int a = occ('a',word);
        list[3]=a;
        int r = occ('r',word);
        list[4]=r;
        int min=list[0];
        for (int j=0;j<5;j=j+1){
            if (min > list[j]){
            min = list[j];}
           
        }
         System.out.println(min);
        
        }
        }
        
        
    

    
    
    public static void main(String[] args){
       foo(); 
    }
    

 
}
