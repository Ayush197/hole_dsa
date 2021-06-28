import java.util.Scanner;


    class node
    {
        int data;
        node left,right;
        node(int d)
        {
            data=d;
            left=right=null;
        }
    }
    class binary
    {
        node root;
        binary()
        {
            root=null;
        }
        int height(node root)
        {
            if(root==null)
            return 0;
            else
            {
                int left_height=height(root.left),right_height=height(root.right);

                if(left_height>right_height)
                return left_height+1;
                else
                return right_height+1;

            }
        }
        void print_level(node root,int level)
        {
            if(root==null)
            return;
            if(level==1)
            System.out.println(root.data+" ");
            else
            {
                print_level(root.left, level-1);
                print_level(root.right, level-1);
            }

        }
        void print()
        {
            int h=height(root);
            int i;
            for(i=0;i<h;i++)
            print_level(root, i);
        }
    

    public static void main(String[] args)
     {
        binary tree = new binary();
        tree.root= new node(1);
        tree.root.left= new node(2);
        tree.root.right= new node(3);
        tree.root.left.left= new node(4);
        tree.root.left.right= new node(5);
         
        System.out.println("Level order traversal  binary tree is ");
        tree.print();
        
    }
}