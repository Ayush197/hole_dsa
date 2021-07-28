class min_max
{
    class node{

        int data;
        node left,right;
        node(int data)
        {
         this.data=data;
         left=right=null;
        }
    }
     node root;
   
    void insert(int val)
    {
       root=util_insert(root, val);
    }
    node util_insert(node root,int val)
    {
        if(root==null)
        return root=new node(val);

        if(val<root.data)
        root.left=util_insert(root.left, val);
        else if(val>root.data)
        root.right=util_insert(root.right, val);

        return root;
    }
    void inorder(node root)
    {
        if(root==null)
        return ;

        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);

    }
    int min(node root)
    {
      if(root.left==null)
      {
          return root.data;
        
      }
    return  min(root.left);
    }
    int max(node root)
    {
        if(root.right==null)
        return root.data;

       return  max(root.right);
        
    }
    public static void main(String[] args)
    {
        min_max ob=new min_max();
        ob.insert(1);
        ob.insert(2);
        ob.insert(3);
        ob.insert(56);

        ob.inorder(ob.root);

        int min=ob.min(ob.root);
        int max=ob.max(ob.root);

        System.out.println("The minimmu value is " + min);
        System.out.println("The maximum vlaue is " + max);



        
        
    }
}