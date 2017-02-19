import java.util.Scanner;


public class avg {
    
    public static void average(){
    Scanner num = new Scanner(System.in);
    int n = num.nextInt();
    int sum=0;
    int count=0;
    int[] list = new int[n];
    for(int i =0;i<n;i=i+1){
    int height = num.nextInt();
    list[i] = height;
    sum=sum+height;}
    double avg = sum/(double)n;
    for(int j = 0; j<n;j=j+1){
    if(list[j]> avg){
    count = count +1;}
    }
    System.out.println(count);
    }
    
    
    
    
    
    
    public static void main(String[] args){
    average();
    }
    
}
