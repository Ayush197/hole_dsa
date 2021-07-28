public class check_bst {
    
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
    node root;
    void check_for_bst()
    {
        if(check(root,Integer.MIN_VALUE,Integer.MAX_VALUE))
        {
            System.out.println("It is a binary search tree");
            return;
        }
        System.out.println("It is not a binary search");
        
    }
    boolean check(node root,int min,int max)
    {
        if(root==null)
        return true;

        if(root.data<min||root.data>max)
        return false;

        return check(root.left, min, root.data-1)&&check(root.right, root.data+1, max);

    }
    public static void main(String[] args) {
        check_bst ob=new check_bst();

        node nod=ob.new node(1);
        nod.left=ob.new node(2);
        nod.right=ob.new node(3);

        ob.check_for_bst();

    
    
    }
}
