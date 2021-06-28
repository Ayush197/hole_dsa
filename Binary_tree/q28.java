public class q28 
{
    static class node
    {
        node left,right;
        int data;
        node(int data)
        {
            this.data=data;
            left=right;
        }

    }

    static node LCA(node x,int a,int b )
    {
        if(x==null)
        return  null;

        if(a==x.data||b==x.data)
        return x;

        node lft=LCA(x.left, a, b);
        node rgt=LCA(x.right, a, b);

        if(lft!=null&&rgt!=null)
        return x;


        return (lft!=null)?lft:rgt;
    }
    public static void main(String[] args) 
    {
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.left.left = new node(4);
        root.left.right = new node(5);
        root.right.left = new node(6);
        root.right.right = new node(7);

        node z=LCA(root, 4, 5);

        System.out.println(z.data);

        
    }
    
}
