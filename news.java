import java.util.Scanner;


public class news {
    
    public static void newsq(){
    Scanner t = new Scanner(System.in);
    String text = t.nextLine();
    int num = t.nextInt();
    for (int i =0; i<num;i=i+1){
        int count = 0;
    int length = t.nextInt();
    t.nextLine();
    String sub = t.nextLine();
    String word1 = text;
    while (word1.contains(sub)){
    int index = word1.indexOf(sub);
    word1 = word1.substring(0, index) + word1.substring(index + length);
    count = count + 1;}
    System.out.println(count);
    }
    }
    
    public static void main(String[] args){
    newsq();}
    
}
