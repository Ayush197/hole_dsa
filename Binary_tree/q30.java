import java.util.HashMap;

public class q30 
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

    static int sum_max(node x,HashMap<node,Integer> hMap)
    {
            int sum=0;

            if(x.left!=null)
            {
                sum+=get_maxsum(x.left.left, hMap)+get_maxsum(x.left.right, hMap);
            }
            if(x.right!=null)
            {
                sum+=get_maxsum(x.right.left, hMap)+get_maxsum(x.right.left, hMap);
            }

            return sum;

    }

    static int get_maxsum(node z,HashMap<node,Integer> hashMap)
    {
        //base case (for ending the recursion)
        if(z==null)
        return 0;

        //checking if the node is already is present
        if(hashMap.containsKey(z))
        return hashMap.get(z);

        //geting sum of grandchild and current node
        int curr=z.data+sum_max(z, hashMap);

        //getting sum of all child excluding the current one
        int ex_curr=get_maxsum(z.left, hashMap)+get_maxsum(z.right, hashMap);

        //storing in hashmap
        hashMap.put(z, Math.max(curr, ex_curr));

        //returning the sum at particular node 'z'
        return hashMap.get(z);

    }
    public static void main(String[] args) 
    {
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.right.left = new node(4);
        root.right.right = new node(5);
        root.left.left = new node(1);  
        
        System.err.println("the maximum sum separrately");

        HashMap <node,Integer> hash=new HashMap<>();
        System.out.println(get_maxsum(root, hash));
        
    }
    
}
