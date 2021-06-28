public class q27 
{
    static class node 
    {
        node right,left;
        int data;
        node(int data)
        {
            this.data=data;
            left=right;
        }
    }

    static boolean flag=true;
    static boolean compare(node x,node y)
    {
        if(x==null&y==null)
        return false;

        if(x==null||y==null)
        return false;

        if(x.data!=y.data)
        return false;

        return (compare(x.left, y.left)&&compare(x.right, y.right)) ||( compare(x.left, y.right)&&
        compare(x.right, y.left));




    }
    public static void main(String[] args) 
    {

        node root1 = new node(1);
         root1.left = new node(2);
         root1.right = new node(3);
         root1.left.left = new node(4);
         root1.left.right = new node(5);
         root1.right.left = new node(6);
         root1.left.right.left = new node(7);
         root1.left.right.right = new node(8);
   
        node root2 = new node(1);
        root2.left = new node(3);
        root2.right = new node(2);
        root2.right.left = new node(4);
        root2.right.right = new node(5);
        root2.left.right = new node(6);
        root2.right.right.left = new node(8);
        root2.right.right.right = new node(7);

        if(compare(root1, root2))
        System.out.println("it is isomorphic");
        else
        System.out.println("it is not");
   
        
    }
}
