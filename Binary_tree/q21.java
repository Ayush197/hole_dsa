import java.util.HashSet;

public class q21 
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
    static String check_dupicate(node x,HashSet<String> set)
    {
        String s="";

        //base case
        if(x==null)
        return s+'$';

        //checking the left subtree
        String left=check_dupicate(x.left, set);
        if(left.equals(s))
        return s;

        //checking for the right substree
        String right=check_dupicate(x.right, set);
        if(right.equals(s))
        return s;

        //adding the both left and right subtree
        s+=(x.data+left+right);

        //checking the condtion
        if(s.length()>3&&set.contains(s))
        return "";

        set.add(s);
        return s;


    }
    static String duplic(node root)
    {
        HashSet<String> x=new HashSet<>();
        return check_dupicate(root,x);

    }
    public static void main(String[] args)
     
    {
        node root = new node('A');
        root.left = new node('B');
        root.right = new node('C');
        root.left.left = new node('D');
        root.left.right = new node('E');
        root.right.right = new node('B');
        root.right.right.right = new node('E');
        root.right.right.left= new node('D');

        String r=duplic(root);
        if(r.equals(""))
        System.out.println("possible");
        else
        System.out.println("not possible");
    }
    

}
