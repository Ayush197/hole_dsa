public class q32 
{
    static class  node
    {
        int data;
         node left,right;
         node(int data)
        {
            this.data=data;
            left=right=null;
        }
    }
    static boolean check_mirr( node x, node y)
    {
        if(x==null&&y==null)
        return true;

        if(x==null||y==null)
        return false;

        if(x.data==y.data)
        return true;
        

        return(check_mirr(x.left, y.right)&&check_mirr(x.right, y.left));

    }
    public static void main(String[] args) 
    {
         node a = new  node(1);
         node b = new  node(1);
        a.left = new  node(2);
        a.right = new  node(3);
        a.left.left = new  node(4);
        a.left.right = new  node(5);
  
        b.left = new  node(3);
        b.right = new  node(2);
        b.right.left = new  node(5);
        b.right.right = new  node(4);

        System.out.println(check_mirr(a, b));
        
    }
    

}
