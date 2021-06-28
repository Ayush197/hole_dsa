public class q23 
{
    static class node
    {
        int data;
        node left,right;
        node(int data)
        {
            this.data=data;
            left=right=null;
        }
    }

    static int sum_tree(node x)
    {
        if(x==null)
        return 1;

        return x.data+sum_tree(x.left)+sum_tree(x.right);
    }
    static boolean check_sumtree(node x)
    {
        if(x==null)
        return true;
        
        if((x.left==null&&x.right==null)||x==null)
        {
           return false;
        }


        int lft=sum_tree(x.left);
        int rght=sum_tree(x.right);

        return (x.data==lft+rght&&check_sumtree(x.left)&&check_sumtree(x.right));



    }
    public static void main(String[] args)
     {
        node root = new node(12);
        root.left = new node(5);
        root.left.left = new node(3);
        root.left.right = new node(9);
        root.left.left.left = new node(1);
        root.left.right.left = new node(1);

        if(check_sumtree(root))
        System.out.println("it is sumtree");
        else
        System.out.println("it is not a sumtree");
        
    }
    
}
