

public class q33
 {
     static class node
     {
         node right,left;
         int data;

         node(int data)
         {
             this.data=data;
             right=left=null;
         }
     }
     static int max_len=0,max_sum=0;
     static void bloodline_maxsum(node x,int len,int sum)
     {
         if(x==null)
         {

         if(max_len<len)
         {
             max_len=len;
             max_sum=sum;
         }
         if(max_len==len&&max_sum<sum)
             max_sum=sum;
            return;
         
        }
        
        bloodline_maxsum(x.left, len+1,  sum+x.data );
        bloodline_maxsum(x.right, len+1,  sum+x.data);
        

        

     }
     public static void main(String[] args) 
     {
         node root = new  node(4);         /*        4        */
        root.left = new  node(2);         /*       / \       */
        root.right = new  node(5);        /*      2   5      */
        root.left.left = new  node(7);    /*     / \ / \     */
        root.left.right = new  node(1);   /*    7  1 2  3    */
        root.right.left = new  node(2);   /*      /          */
        root.right.right = new  node(3);  /*     6           */
        root.left.right.left = new  node(6);

        bloodline_maxsum(root,0, 0);
        System.out.println(max_sum);
     }
    
}
