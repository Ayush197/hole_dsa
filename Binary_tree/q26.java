import java.util.HashMap;
import java.util.HashSet;

public class q26
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
    // to find the duplicate subtreeee....

    //hashmap to store the root
    static HashMap<String,Integer> hash;

    
    static String check_dup(node root)
    {
        //base condition
        if(root==null)
        return null;

        //inorder storing the "str"
        String str ="(";
        str+=check_dup(root.left);
        str+=Integer.toString(root.data);
        str+=check_dup(root.right);
        str+=")";

        //System.out.println(str);
        if(hash.get(str)!=null&&hash.get(str)==1)
        {
            System.out.println(root.data+" ");
        }

        //putting the 
        if(hash.containsKey(str))
        hash.put(str, hash.get(str)+1);
        else
        hash.put(str,1);

        return str;

        

    
    }

    static void print_dups(node root)
    {
        hash=new HashMap<>();
        check_dup(root);
    }

    public static void main(String[] args) 
    {
        node root = null;
        root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.left.left = new node(4);
        root.right.left = new node(2);
        root.right.left.left = new node(4);
        root.right.right = new node(4);
        print_dups(root);
        
        
    }
    
}
