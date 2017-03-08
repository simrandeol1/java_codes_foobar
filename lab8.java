//Mehak Gupta
//2016163
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author HP
 */
public class lab8 {
    
    static class bnode {
        bnode left;
        bnode right;
        int data  ;
        static int top = -1;
        bnode(int x){
            left = null ;
            right = null;
            data = x;
        }
        bnode(){
            left =null;
            right = null;
            data =0;
        }
        void setright(bnode x){
            this.right = x;
        }
        void setleft(bnode x){
            this.left =x;
        }
        void setdata(int x){
            this.data = x;
        }
    }
    // static int[] levels  = new int[10000];
    //static int counter = -1;
    //function for inserting nodes into a bst
    static void insert(bnode root , int x){
        if(root.left==null && x<root.data){
            bnode next = new bnode(x);
            root.setleft(next);
        }
        else if (root.right==null && x>root.data){
            bnode next = new bnode(x);
            root.setright(next);
        }
        else{
            if(x<root.data){
                insert(root.left, x);
            }
            else if (x>root.data){
                insert(root.right,x);
            }
        }
    }
    //function for printing preorder traversal of the bst
    static void print(bnode root){
        if (root!=null){
            System.out.print(root.data);
            System.out.print(" ");
            print(root.left);
            print(root.right);
        }
    }
    //function for calculating the height of the tree
    static int height(bnode root){
        if (root == null)
            return 0;
        else
            return 1 + Math.max(height(root.right), height(root.left));
    }
    // function to make the tree
    static bnode make(int[] x){
        int length = x.length;
        bnode root = new bnode(x[0]);
        for (int i=1;i<length;i++){
            insert(root,x[i]);
        }
        return root;
    } 
    //function to find the min node on a bst
    static bnode minnode(bnode root){
        if(root.left == null){
            return root;
        }
        else {
            return minnode(root.left);
        }
    }
    //function to delete a node with data as x
    static bnode DeleteNode(int x , bnode root){
        if(root==null)
            return null;
        if(x<root.data){
            root.left = DeleteNode(x , root.left);
            }
        else if (x>root.data){
            root.right = DeleteNode(x , root.right);
        }
        else {
           if(root.right!=null && root.left!=null){
                bnode temp=root;
                bnode minright = minnode(temp.right);
                root.data=minright.data;
                root.right = DeleteNode(minright.data,root.right);
            }
            else if ( root.left!=null ){
                root = root.left ;
            }
            else if (root.right != null){
                root = root.right;
            }
            else
                root = null;
            }
        return root;
    }
    //function to find the max value at any given level of the bst
    static int maxatlevel(bnode root, int level){
        if (root!=null){
            if (level == 1){
                return root.data;
            
            }
            else {
          
                int h = maxatlevel(root.left,level-1);
                int o = maxatlevel(root.right,level-1);
            return Math.max(h,o);
           }
       
        }
        return 0;
    }
    //function for returning the right profile of a bst
    static void PrintProfile(bnode root){
       int h = height(root); 
       for (int i=1;i<=h;i++){
        
          System.out.print(maxatlevel(root,i)+ " ");
          }   
      System.out.println();
     }
    
    public static void main(String[] args) throws IOException{
       
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String[] tokens = reader.readLine().split(" ");
       int num = Integer.parseInt(tokens[0]);
       int[] tree = new int[num];
       int cases = Integer.parseInt(tokens[1]);
       String[] entry = reader.readLine().split(" ");
       for (int i=0; i<num;i++){
           tree[i] = Integer.parseInt(entry[i]);
       }
       bnode bst = make(tree);
       for (int j=0;j<cases;j++){
           String[] test = reader.readLine().split(" ");
           if (Integer.parseInt(test[0])==2){
               PrintProfile(bst);
           }
           else {
              bst = DeleteNode(Integer.parseInt(test[1]),bst);
              }
           }
        }
}
