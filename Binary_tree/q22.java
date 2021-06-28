public class q22 
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

    static boolean check(node x,int level,int curr_level)
    {
        if(x==null)
        return true;

        if(x.left==null&&x.right==null)
        {
            if(curr_level==0)
            {
                curr_level=level;
                return true;

            }
            return level==curr_level;
        }

        return check(x.left, level+1, curr_level)&&check(x.right, level, curr_level);
    }

    
    public static void main(String[] args) 
    {
        q22 tree=new q22();
        node root = new node(12);
        root.left = new node(5);
        root.left.left = new node(3);
        root.left.right = new node(9);
        root.left.left.left = new node(1);
        root.left.right.left = new node(1);

        boolean flag=check(root, 0, 0);
        if(flag)
        System.out.println("yes its present at same level");
        else
        System.out.println("its not present at same level");
    }
    
}

