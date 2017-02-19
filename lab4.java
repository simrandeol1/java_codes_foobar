import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author HP
 */
public class Node {
    
    public String data ;
    public Node link;
    public  Node(){
        //Constructor type 1
        data = "";
        link = null;
        
    }
    public Node(String s){
        //Constructor type 2
        data = s;
        link = null;
        
    }
    public  Node(String s , Node n){
        //Constructor type 3
        data = s;
        link = n;
        
    }
    public void setLink(Node n){
        //sets the link of the given node and stores in the variable n
        this.link = n;
    }
    public static int counter(Node n){
        //This function is used to count the number of elements in the given linked list
        int countr=1;
        while (n.link!=null){
            //this loop will run until the node points towards null.
            countr++;
            n=n.link;
        }
        return countr;
    }
    public static Node insert(Node n , int q , String s){
        //used to insert the node at a particular position
        Node nptr = new Node(s);
        //stores the new node in the variable nptr
        Node ptr = n;
        if (q==1){
            //if the element is to be added in the beginning 
            nptr.link = n;
            n = nptr;
            return n;
        }
        if (q==counter(n)+1){
            //if element is to be added in the end
           while (ptr.link!=null){
               // traverses to the last node of the linked list
               ptr = ptr.link;
           }
           ptr.link = nptr;
           //connects last node to the new node 
           return n;
        }
        
        q=q-1;
        for (int i =1; i<counter(n);i++){
            //for inserting at any arbitary position other than 1st and last
            if (i==q){
                //when we get to the node where the new node is to be inserted
                Node temp = ptr.link;
                ptr.link=nptr;
                nptr.link = temp ;
                
                break;
            }
            ptr = ptr.link;
        }
        return n;
        
        
        
    }
    public static Node delete(Node n , int q){
        // function for deleting the node at the specified location
        Node current = n;
        Node next = n.link;
        if (q==1){
            // if the first node is to be deleted. 
            n=n.link;
            return n;
        }
        for (int i =1; i < q; i++){
            // for deletion of any random mode. 
            // gets the node which is next to the node needed to be connected.
            next = next.link;
        }
        for (int j = 1;j<q-1;j++){
            // gives us the node before the one which needs to be deleted. 
            n=n.link;
        }
        n.link = next;
        // sets the link between the previous element and the next element. 
        return current;
    }
    public static void node() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        // reads the first line and splits it with space as the delimiter. 
        int number = Integer.parseInt(input[0]);
        int query = Integer.parseInt(input[1]);
        // used to take the input list .
        String[] list = reader.readLine().split(" ");
        Node front = new Node(list[0]);
       Node count = front;
       // making the initial linked list . 
        for (int i = 1 ; i<number;i++){
            while(count.link !=null){
                // basically insertion at the last node 
                count = count.link;
            }
            
            Node nptr = new Node(list[i]);
            
            count.link = nptr;
        }
        int j = 0;
        while (j<query){
            //used to take the different queries fro the user. 
            String[] cases = reader.readLine().split(" ");
            if (Integer.parseInt(cases[0]) == 1){
                //case of insertion 
                front = insert(front,Integer.parseInt(cases[2]),cases[1]);
                number= number+1;
                // incrementing the count of number by 1.
                           }
            else if (Integer.parseInt(cases[0])==2){
                //case of deletion. 
                front = delete(front,Integer.parseInt(cases[1]));
                number = number-1;
                //decrementing number by one 
            }
            else if (Integer.parseInt(cases[0])==3){
                // case of display
            Node y = front;
            for (int k =1;k<=number;k++){
            System.out.print(y.data + " ");
            
            y = y.link;
                    
        }
            System.out.println();}
            else { 
                // case of comparing two lists 

                Node r = front;
                  if (Integer.parseInt(cases[1])!= number){
                      System.out.println("0");
                  }
                  else{
                      int a;
                      for ( a =1;a<=number;a++){
                          if(!cases[a+1].equals(r.data )){
                              System.out.println("0");
                              break;
                          }
                          r=r.link;
                          
                      }
                      if (a==number+1)
                      {System.out.println("1");}
                  }
                    }
                    
        

            j++;
        }
        
            
           
        
    }
    public static void main(String[] args) throws IOException{
        node();
    }
}
