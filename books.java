import java.util.Scanner;


public class books {
    
    public static void book(){
    Scanner t = new Scanner(System.in);
    int num = t.nextInt();
    String str="";
    int i =0;
    int x =num;
    int sum=0;
    while (true){
        if(x > 9*Math.pow(10,i)){
        x=x- (int)(9 * Math.pow(10,i));
        sum=sum+(int)(9*Math.pow(10, i));
        i=i+1;}
        else {
        sum = sum + (int)(x*Math.pow(2, i));
        break;}
    }
    System.out.println(sum);
        
    }
    public static void main(String[] args){
    book();}
    
}
