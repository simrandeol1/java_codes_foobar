import java.util.Scanner;

public class alienwar {
    
    public static void alien(){
    Scanner t  = new Scanner(System.in);
    int num = t.nextInt();
    while (num>0){
        long aln=1;
        long man=1;
        int count1=0;
        int count2=0;
    int a = t.nextInt();
    int b = t.nextInt();
    int c = t.nextInt();
    int d = t.nextInt();
     while (a>1){
     a=a/2;
     count1=count1 + 1;}
     aln = b * count1;
     while (c>1){
     c=c/2;
     count2=count2 + 1;}
     man = d * count2;
      if (aln > man){
    System.out.println("Alien");}
    else 
    {System.out.println("Warrior");}
    
    num =num-1;
    }
    }
    
    
    public static void main(String[] args){
        alien();
    }
    
}
