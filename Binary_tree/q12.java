import java.util.*;
import java.util.Map.Entry;

public class q12
{
    static class node
    {
        int data;
        node right,left;
        node(int data)
        {
            this.data=data;
            right=left=null;

        }
    }
   static node root;

    static void diagonal(node s,int d,HashMap<Integer,Vector<Integer>> map)
    {
        if(s==null)
        return ;
        
        Vector<Integer> vec =map.get(d);

        if(vec==null)
        vec=new Vector<>();

        vec.add(s.data);

        map.put(d,vec);
        diagonal(s.left, d+1,map);
        diagonal(s.right, d,map);

        



    }
    static void map(node s)
    {
        HashMap<Integer,Vector<Integer>> map=new HashMap<>();
        diagonal(s, 0,map);
        System.out.println("diagonal traversal");
        for(Entry<Integer,Vector<Integer>> entry:map.entrySet())
        {
            System.out.println(entry.getValue());
        }
    }

    
   
    public static void main(String[] args)
         {
            node root = new node(1);
            root.left = new node(2);
            root.right = new node(3);
            root.left.left = new node(4);
            root.right.left = new node(5);
            root.right.right = new node(6);
            root.right.left.left = new node(7);
            root.right.left.right = new node(8);

            map(root);
        
            

            

         }
    
}
