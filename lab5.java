import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class circulargame {
    
    public static class Node {
    Node link ; 
    int data ; 
    
    Node(int number , Node connect){
        data = number ;
        link = connect ;
        
    }
    Node(int number){
        data = number;
    }
    Node(){
        
        link = null ; 
        
    }
    
}

    public static void game() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(reader.readLine());
        int i = 0;
        while (i<input){
            Node y =new  Node(1);
            Node front =y;
            int number = Integer.parseInt(reader.readLine());
            for (int j=2 ; j<=number ; j++){
              Node  x =new Node(j);
              y.link = x;
              y =x;
              }
            y.link = front;
            
            Node z  = front; 
            while((z.link).link != z){
                Node h = z.link;
                z.link = h.link;
                z = z.link;
            }
            System.out.println(z.data);
            i++;
        }
    }
    
    public static void main(String[] args) throws IOException{
        game();
    }
    
}
