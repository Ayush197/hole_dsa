import java.util.*;

class node
{

    int data;
    node left,right;
    node(int data)
    {
        this.data=data;
        left=right;
    }
}
class binaryclass
{
    node root;
    void level(node nod)
    {
        Stack<node> s=new Stack<>(); 
        Queue<node> q=new LinkedList<>();
        q.add(nod);

        while(!q.isEmpty())
        {
            nod=q.peek();
            q.remove();
            s.push(nod);

            if(nod.right!=null)
            q.add(nod.right);
            if(nod.left!=null)
            q.add(nod.left);
        }

        while(!s.isEmpty())
        {
            nod=s.peek();
            System.out.println(nod.data);
            s.pop();
        }
    }
    public static void main(String args[]) 
    {
        binaryclass tree = new binaryclass();
   
        // Let us create trees shown in above diagram
        tree.root = new node(1);
        tree.root.left = new node(2);
        tree.root.right = new node(3);
        tree.root.left.left = new node(4);
        tree.root.left.right = new node(5);
        tree.root.right.left = new node(6);
        tree.root.right.right = new node(7);
   
        System.out.println("Level Order traversal of binary tree is :");
        tree.level(tree.root);
   
    }
}
