public class q31 
{
    static class node
    {
         node left,right;
         int data;
         node(int data)
         {
             this.data=data;
             left=right=null;
         }
    }
    
    static int max_sumtree(node x,int max)
    {
        int sum=0;

        if(x==null)
        return 0;
        sum+=max_sumtree(x.left, max)+x.data+max_sumtree(x.right, max);

        if(sum>max)
        max=sum;

        return max;
        
    }
    public static void main(String[] args)
     {
        node root = new node(1); 
        root.left = new node(-2); 
        root.right = new node(3); 
        root.left.left = new node(4); 
        root.left.right = new node(5); 
        root.right.left = new node(-6); 
        root.right.right = new node(2); 

        System.out.println(max_sumtree(root, Integer.MIN_VALUE));
        
    }
    
}
