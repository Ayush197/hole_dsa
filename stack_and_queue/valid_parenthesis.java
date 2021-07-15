package stack_and_queue;
public class valid_parenthesis 
{
    class stack
    {
        Character a[];
        int top;
        int siz;
        stack(int size)
        {
            siz=size;
            a=new Character[size];
            top=-1;
        }
        boolean underflow()
        {
            return top<0;
        }
        boolean overflow()
        {
            return top>siz-1;
        }
        void push(Character val)
        {
            if(overflow())
            {
                System.out.println("overflow");
                return;
            }
            a[++top]=val;
            System.out.println(val);
        }
        Character pop()
        {
            if(underflow())
            {
                System.out.println("underflow");
            }
             char popped_value=a[top];
            top--;
            return popped_value;
            
        }
        void push_string(String s)
        {
            for(int i=0;i<s.length();i++)
            push(s.charAt(i));
        }
        boolean stack_isEmpty()
        {
            return top==-1;
        }
        boolean check(String st)
        {
            int len=st.length();
            if(len==0)
            {
                System.out.println("empty string");
                return false;
            }
            for(int i=0;i<len;i++)
            {
                char c=st.charAt(i);
                if(c=='}'||c==']'||c==')')
                {
                   char p= pop();
                   System.out.println(p);
                }
                else
                push(c);
                
                if(stack_isEmpty()&&i<len-1)
                return false;
                
                

            }
            
            

            return stack_isEmpty();
        }
    }
    public static void main(String[] args) 
    {
        String parenthesis="{([])}";
        valid_parenthesis ob=new valid_parenthesis();
        stack stk= ob.new stack(parenthesis.length());

        boolean ans= stk.check(parenthesis);
        System.out.println(ans);
        System.out.println(stk.top);

        
    }
    
}
