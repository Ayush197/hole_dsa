import java.util.Vector;

public class q29
 {
     static class node
     {
         node left,right;
         int data;
         node (int data)
         {
             this.data=data;
             left=right=null;
         }
     }
     static Vector<Integer> vec=new Vector<>();

     static void print_path(Vector<Integer>vecc,int idx)
     {
         for(int i=idx;i<vecc.size();i++)
         {
             System.out.print(vecc.get(i)+" ");
         }
         System.out.println();
     }

     static void find_path(node x,int k)
     {
         if(x==null)
         return;

         vec.add(x.data);

         find_path(x.left, k);
         find_path(x.right,k);

         int sum=0;
         for(int i=vec.size()-1;i>=0;i--)
         {
            sum+=vec.get(i);

            if(sum==k)
            print_path(vec,i);
         }
        vec.get(vec.size()-1);



     }
     public static void main(String[] args) 
     {
        node root = new node(1); 
        root.left = new node(3); 
        root.left.left = new node(2); 
        root.left.right = new node(1); 
        root.left.right.left = new node(1); 
        root.right = new node(-1); 
        root.right.left = new node(4); 
        root.right.left.left = new node(1); 
        root.right.left.right = new node(2); 
        root.right.right = new node(5); 
        root.right.right.right = new node(2); 

        int k=5;
        find_path(root, k);
         
     }
    
}
