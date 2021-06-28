import java.util.Stack;

class q17
{
    static class node
    {
        node left,right;
        int data;
        
        
   }
    static node newnode(int data)
     {
            node nod =new node();
            nod.data=data;
             nod.left=nod.right=null;
             return (nod);
        }
   
   static int  brack_index(String s,int start,int end)
   {
     
     Stack<Character> hold=new Stack<>();
     if(start>end)
     return -1;
     for(int i=start;i<=end;i++)
     {
         char x=s.charAt(i);
         if(x=='(')
         hold.add(x);
         else if(x==')')
         {
             if(hold.peek()=='(')
             hold.pop();
         
           if(hold.isEmpty())
           {
             return i; 
           }
         }
        }
     
     return -1;
    }
     
     static node brack_tree(String x,int start,int end)
     {
         if(start>end)
         return null;

        node  root= newnode(x.charAt(start)-'0');

         int idx=-1;

         if(start+1<=end&&x.charAt(start+1)=='(')
         idx=brack_index(x, start+1, end);

         if(idx!=-1)
         {
              root.left= brack_tree(x, start+2, idx-1);
               root.right=brack_tree(x,idx+2 , end);
         }
         return root;

     }
     static void print(node t)
     {
         if(t==null)
         return;
         System.out.print(t.data+" ");
         print(t.left);
         print(t.right);
     }

   
    public static void main(String[] args) 
    {
        String x = "4(2(3)(1))(6(5))";
        node root =brack_tree(x,0, x.length()-1);
        print(root);
        
    }
}