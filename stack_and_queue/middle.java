package stack_and_queue;

public class middle
 {
     class dlink
     {
         dlink prev,next;
         int data;
         dlink(int d)
         {
             data=d;
         }
     }
     class stack
     {
         dlink head,mid;
         int count;
     }
     stack create_stack()
     {
         stack stk=new stack();
         stk.count=0;
         return stk;
     }
     void push(stack stk, int val)
     {
         //creating new node(of doubly linkelist)
         dlink node= new dlink(val);

         //assignig prev as null
         node.prev=null;

         node.next=stk.head;// assiging node to next as the head of the node
         
         stk.count+=1;

         if(stk.count==1)
         stk.mid=node;
         else
         {
             stk.head.prev=node;
             
             if(stk.count%2!=0)
             {
                 stk.mid=stk.mid.prev;
             }
         }
         stk.head=node;
         
     }
     int pop(stack stk)
     {
         if(stk.count==0)
         {
             System.out.println("stack is empty");
             return -1;
         }

         //popping the value from the stack
         dlink n_head=stk.head;
         int popped_item=n_head.data;
         stk.head=stk.head.next;

         if(stk.head!=null)
         stk.head.prev=null;

         stk.count-=1;

         if(stk.count%2!=0)
         stk.mid=stk.mid.next;

         return popped_item;

     }
     int find_middle(stack ob)
     {
        if(ob.count<=0)
        {
            System.out.println("stack is empty");
            return -1;
        }
        return ob.mid.data;
     }
     public static void main(String[] args) {
         
        middle mid=new middle();
        stack stk=mid.create_stack();

        mid.push(stk, 11);
        mid.push(stk, 22);
        mid.push(stk, 33);
        mid.push(stk, 44);
        mid.push(stk, 55);
        mid.push(stk, 66);
        mid.push(stk, 77);
 
        System.out.println("Item popped is " +mid.pop(stk));
        System.out.println("Item popped is " +mid.pop(stk));
        System.out.println("Middle Element is "
                           + mid.find_middle(stk));
     }
    
}
