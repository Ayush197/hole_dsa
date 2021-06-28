public class q14 {
    
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
    static int count=0;
    static node root;
    static void count_left(node s)
    {
        if(s==null)
        return ;

        count++;
        count_left(s.left);


    }
    static void count_right(node s)
    {
        if(s==null)
        return ;

        count++;
        count_right(s.right);


    }
     static int  total_count(node s)
    {
        if(root==null)
        return count;

        count_left(s.left);
        int left=count;
        count=0;
        count_right(s.right);
        int right=count;

        int dif=Math.abs(right-left);

        return dif;
        
        


    }
    public static void main(String args[])
    {
        q14 tree = new q14();
        tree.root = new node(20);
        tree.root.left = new node(8);
        tree.root.left.left = new node(4);
        tree.root.left.right = new node(12);
        tree.root.left.right.left = new node(10);
        tree.root.left.right.right = new node(14);
        tree.root.right = new node(22);
        tree.root.right.right = new node(25);

        if(total_count(root)>1)
        System.out.println("not balanced");
        else
        System.out.println(" balanced");

        

    }
}
