//Mehak Gupta
//2016163
public class lab7 {
    //implementation of stack data type
    static class stack {
        int length = 3000;
        int top = -1 ;
        int[] arr;
        stack(){
            arr = new int[length];
        }
        void push(int n){
            top ++;
            arr[top] = n;
        }
        int pop(){
           int x = arr[top];    
           top--;
           return x;
        }
        int peek(){
            return arr[top];
        }
    }
    //add two numbers using stack 
    static stack add(stack a , stack b){
        stack c = new stack();
        int z;
        int carry =0;
        while (a.top >-1 && b.top >-1){
            z = a.pop() + b.pop() + carry ;
            c.push(z%10);
            carry = z/10;
            }
        if (a.top >= 0){
            int h=0;
            while (a.top>-1){
                h = a.pop()+ carry;
                c.push(h%10);
                carry = h/10;
            }
        }
        if (b.top >= 0){
            int h = 0 ;
            while(b.top > -1){
                h = b.pop() + carry;
                c.push(h%10);
                carry = h/10;
            }
        }
        if(carry!=0)
            c.push(carry);
        stack d = new stack();
        while(c.top>-1){
            int o = c.pop();
            d.push(o);
        }
        return d;
    }
   
    static stack mult(stack a , stack b){
        stack temp = new stack();
        stack ans = new stack();
        stack p = new stack();
        int c;
        int g = b.top;
        for (int i =0;i<=g;i++){
            stack d  =new stack();
            c = b.pop();
            for (int l=0;l<i;l++){
                d.push(0);
            }
            int e;
            int m;
            int carry =0;
            int t = a.top;
            for (int z=0;z<=a.top;z++){
                p.push(a.arr[z]);
            }            
            for (int j=0;j<=t;j++){
               e = p.pop();
               m = e * c + carry;
               d.push(m%10);
               carry = m/10;
            }
            if (carry !=0){
                d.push(carry);
            }
            while (d.top >-1){
                int f = d.pop();
                ans.push(f);
            }    
            temp = add(temp , ans);
        }
        return temp;  
    }
    
    static void factorial() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(reader.readLine());
        stack a = new stack();
        stack c = new stack();
        stack d = new stack();
        a.push(1);
        for (int i=2;i<=input;i++){
            stack b = new stack();
            int  j=i;
            while(j>0){
                b.push(j%10);
                j=j/10;
            }
            while(b.top>-1){
                int h = b.pop();
                c.push(h);
            }
            a = mult(a , c);
        }
        while (a.top>-1){
            int l = a.pop();
            d.push(l);
        }
        while(d.top >-1){
            System.out.print(d.pop());
        }
    }
    public static void main(String[] args) throws IOException{
        factorial();
        System.out.println();
    }
}
