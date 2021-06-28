import java.util.*;
public class q22 
{
    public static void main(String[] args) 
    {
        Scanner au=new Scanner(System.in);
        System.out.println("Enter the pattern");
        String st=au.next();
        
        int len=st.length();

        if(len%2==0)
        {
            Stack <Character> stack=new Stack<>();

            for(int i=0;i<len;i++)
            {
                char c=st.charAt(i);
                if(c=='}'&&!stack.empty())
                {
                    if(stack.peek()=='{')
                    stack.pop();
                    else
                    stack.push(c);
                }
                else
                stack.push(c);
            }
            
            int pat_len=stack.size();

            int n=0;
            while(!stack.empty()&&stack.peek()=='{')
            {
                stack.pop();
                n+=1;
            }

            int m=pat_len-n;

            int res=(int)Math.ceil(m)+(int)Math.ceil(n);
            System.out.println(res);

        }
        else
        System.out.println("Not possible");
    }
    
}
