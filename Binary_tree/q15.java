import java.util.Stack;

public class q15 
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

    static node root;
    static void print_zigzag(node s)
    {
        if(s==null)
        return;
        Stack<node> curr=new Stack<>();
        Stack<node> next=new Stack<>();

        curr.push(s);
        boolean dir=true;

        while(!curr.isEmpty())
        {
            node x=curr.pop();
            System.out.println(x.data);

            if(dir)
            {
                if(x.left!=null)
                 next.push(x.left);
                else if(x.right!=null)
                next.push(x.right);

            }
            else
            {
                if(x.right!=null)
                next.push(x.right);
                else if(x.left!=null)
                next.push(x.left);
            }

            if(curr.isEmpty())
            {
                dir=!dir;
                Stack<node> f=curr;
                curr=next;
                next=f;
                
            }

        }

    }
    public static void main(String args[])
    {
        q15 tree = new q15();
        tree.root = new node(20);
        tree.root.left = new node(8);
        tree.root.left.left = new node(4);
        tree.root.left.right = new node(12);
        tree.root.left.right.left = new node(10);
        tree.root.left.right.right = new node(14);
        tree.root.right = new node(22);
        tree.root.right.right = new node(25);

        print_zigzag(root);
        

    }
    
}
