
public class q20 
{

    static class node
    {
        node right,left;
         char data;
        node(char data)
        {
            this.data=data;
            right=left=null;
        }
    }
    

    static int search_index(int start,int end,String y,char c)
    {
        int i;
        for( i=start;i<=end;i++)
        {
            char t=y.charAt(i);
            if(t==c)
            return i;
        }
        return i;
    }

    static int index=0;
    static node preorder(String x,String y,int i,int j)
    {
        if(i>j)
        return null;

        node root=new node(x.charAt(index++));

        if(i==j)
        return root;

        int index=search_index(i, j, y, root.data);

        root.left=preorder(x, y, i, index-1);
        root.right=preorder(x, y, index+1, j);

        return root;
    }

     static void print(node root)
     {
         if(root==null)
         return;

         print(root.left);
         System.out.print(root.data+" ");
         print(root.right);
     }

    public static void main(String[] args)
     {
         q20 ob=new q20();
         
         String y="DBEAFC",x="ABDECF";

         node z=preorder(x, y, 0, x.length()-1);

         print(z);
        
    }
}
