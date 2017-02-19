import java.util.Scanner;


public class Foobar {
    public static void solve(){
    Scanner num = new Scanner(System.in);
    int cases = num.nextInt();
    while (cases > 0){
    int sum =0;
    int t = num.nextInt();
    while  (t > 0){
    int sock = num.nextInt();
    sum = sum + sock/3;
    t=t-1;}
    System.out.println(sum);
    cases = cases-1;}
    }
    
    

   
    public static void main(String[] args) {
        Foobar.solve();
        // TODO code application logic here
    }
    
}
