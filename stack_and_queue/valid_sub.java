import java.util.Scanner;
import java.util.Stack;

public class valid_sub {

    int valid_check(String st)
    {
        int len=st.length();
        int valid_subs=0;
        Stack <Character> stk=new Stack<>();
        for(int i=0;i<len;i++)
        {
            char c=st.charAt(i);
            if(c==')'&&!stk.isEmpty())
            {
                  stk.pop();
                  valid_subs+=2;
            }
            else
            stk.push(c);
        }
        return valid_subs;
    }
    public static void main(String[] args) {
        
        Scanner au=new Scanner(System.in);
        System.out.println("enter the string");
        String st=au.next();
        valid_sub ob=new valid_sub();
        int res=ob.valid_check(st);
        System.out.println(" the valid substrings are "+ res);

        au.close();
    }
    
}
