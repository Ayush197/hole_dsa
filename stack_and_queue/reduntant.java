import java.util.Scanner;
import java.util.Stack;

public class reduntant {

    boolean check_reduntant(String st)
    {
        Stack<Character> stk=new Stack<>();
        int len=st.length();
        if(len==0)
        {
            System.out.println("string is empty");
            return false;
        }

        int pop_seq=0,arith_seq=0,var=0;
        for(int i=0;i<len;i++)
        {
            char c=st.charAt(i);
            
            if(!Character.isLetter(c))
            {

            if(c==')')
            {
                stk.pop();
                if(pop_seq>0&&arith_seq==0)
                return false;
                System.out.println(arith_seq+" <<<<>>>>>");
                pop_seq+=1;
            }
            else if(c=='(')
            {
                stk.push(c);
                System.out.println(arith_seq);
                pop_seq=0;
                arith_seq=0;
            }
        
            else if(c=='+'||c=='*'||c=='/'||c=='-')
             {
              arith_seq+=1;
             //System.out.println("jhjkjh");
                }
    }
        }

        return true;
        
    }

    public static void main(String[] args) {
        
        Scanner au=new Scanner(System.in);
        System.out.println("enter the expression");
        String st=au.next();

        reduntant ob=new reduntant();
        

        System.out.println("given expression is non redundant ? "+ob.check_reduntant(st));
        

        au.close();
    }
    
}
