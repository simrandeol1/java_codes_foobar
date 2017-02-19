import java.util.Scanner;


public class clone {
    
    public static void clones(){
    Scanner t = new Scanner(System.in);
    int n = t.nextInt();
    int num = t.nextInt();
    while (num >0){
    int number = t.nextInt();
    if (number == n){
    System.out.println("-1");}
    else{
    int display = n - number;
    int i = display;
    while(i > 0){
    
    System.out.println(number);
    i=i-1;}}
    
    
    
    num = num -1;}
    }
    
    public static void main(String[] args){
    clones();}
    
}
