public class succ_pred {

    class node
    {
        int data;
        node right,left;
        node(int data)
        {
            this.data=data;
            right=left=null;
        }
    }
    node root;
    void insert(int val)
    {
        root=util_insert( root, val);
    }
    node util_insert(node root,int val)
    {

        if(root==null)
        return root = new node(val);

        if(val<root.data)
        root.left=util_insert(root.left, val);
        else if(val>root.data)
        root.right=util_insert(root.right, val);

        return root;
    }
    void func_pred(node root,int val)
    {
        if(root==null)
        return;

        if(val<root.data)
        func_pred(root.right, val);

        System.out.println("The predecessor of "+ val +" is "+ root.data);
        return ;
    }
    void func_succ(node root, int val)
    {
        if(root==null)
        return;

        if(val>root.data)
        func_succ(root, val);

        System.out.println("The successor of "+ val + "is" + root.data);
        return;
    }
    public static void main(String[] args) {
        
        succ_pred ob=new succ_pred();

        ob.insert(50);
        ob.insert(30);
        ob.insert(45);

        ob.func_succ(ob.root, 32);
        ob.func_pred(ob.root, 32);
    }
    
}
