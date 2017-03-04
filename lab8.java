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
       
       int[] arr = new int[10000];
       
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
    static bnode pre=null;
    static int[] levels  = new int[1000];
    static int counter = -1;
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
    
    static void print(bnode root){
    if (root!=null){
        System.out.print(root.data);
        System.out.print(" ");
        print(root.left);
        print(root.right);
        
    }
    }
    
    static int height(bnode root){
        if (root == null)
            return 0;
        else
            return 1 + Math.max(height(root.right), height(root.left));
    }
    
    static bnode make(int[] x){
        
        int length = x.length;
        bnode root = new bnode(x[0]);
        
        for (int i=1;i<length;i++){
            
            insert(root,x[i]);
        }
        return root;
    } 
    static void DeleteNode(int x , bnode root){
        
        if(x<root.data){
            pre = root;
            DeleteNode(x , root.left);
            
        }
        else if (x>root.data){
            pre=root;
            DeleteNode(x , root.right);
        }
        else {
           
            if(root.right!=null && root.left!=null){
            
            bnode pointer = root.right;
            bnode previous = null;
            if (pointer.left == null){
                root.data = pointer.data;
                root.right = pointer.right;
            }
            else{
                while (pointer.left!=null){
                    previous = pointer;
                    pointer = pointer.left;
                    
                }
                root.setdata(pointer.data);
                previous.left=null;
            }
            }
            else if (root.right==null && root.left==null ){
                if(pre!=null){
                    if(pre.data>root.data){
                        pre.left=null;
                    }
                    else
                        pre.right=null;}
                else {
                    root = null;
                }
            }
            else if (root.right == null){
                if(pre.data>root.data){
                    pre.left=root.left;
                }
                else
                    pre.right=root.left;}
            else
                {
                if(pre.data>root.data){
                    pre.left=root.right;
                }
                else
                    pre.right=root.right ;}
        }
        pre=null;
            
    }
    static int maxatlevel(bnode root, int level){
        
    
        if (level == 1){
            levels[counter+1] = root.data;
            counter++;
        }
        else {
            if(root.left!=null)
            maxatlevel(root.left,level-1);
            if(root.right!=null)
            maxatlevel(root.right,level-1);
        }
        int x = levels[counter];
        
        return x;
    
     
    }
    
       
    static void PrintProfile(bnode root){
        
      for (int i=1;i<=height(root);i++){
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
               if (height(bst)==1){
                   bst = null;
               }
               else 
                   DeleteNode(Integer.parseInt(test[1]),bst);
           }
           
       }
        
         
    }
}
