import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class invalid_parenthesis 
{
    //class : for evaluating the string without invalid parenthessis
    
    class eff_meth
    {
        //'set' of string for storing the resultant string
        Set<String> set;
        //minimum count which stores the minimum number of removal of 
        //'invalid' parenthesis
    
        int min_count;

        //construcor for initializing the 'set' and 'min_count'
        eff_meth()
        {
            set=new HashSet<>();
            min_count=Integer.MAX_VALUE;


        }
        
        // * recursive funnction 
        // that will check all the possible valid pattern.
        void rec_fn(int idx,int right,int left,String st,StringBuilder exp,int rem_count)
        {
            //* base case
            //will check it index reaches to the size
            //,check if rigth parenthesis == left one
            if(idx==st.length()&&right==left&&rem_count<=min_count)
            {
                String s=exp.toString();
                min_count=rem_count;
                set.add(s);
                return ;

            }
            else
            {
                char c=st.charAt(idx);
                int len=exp.length();

                // * if parenthesis found
                if(c=='('||c==')')
                {
                    //call for 'other' indices
                    //increment 'rem_count' by one
                    rec_fn(idx+1, right, left, st, exp, rem_count+1);

                    //add the the current parenthesis.
                    exp.append(c);

                    //*check for '(' and ')' 
                    if(c=='(')
                    rec_fn(idx+1, right+1, left, st, exp, rem_count);
                    else if(right<left)
                    rec_fn(idx+1, right, left+1, st, exp, rem_count);

                    //delete the values for forward propagation
                    exp.deleteCharAt(idx);


                }
                // * parenthesis not found
                else
                {
                    //add the current character 
                    //and check for other parenthesis
                    exp.append(c);
                    rec_fn(idx+1, right, left, st, exp, rem_count);
                    exp.deleteCharAt(len);
                }
            }
        }
    }
    String fn(String st)
    {
        int len=st.length();
        if(len<1)
        {
            System.out.print("string is empty");
            return "";
        }

        Stack<Character> stk=new Stack<>();
        String res="";
        for(int i=0;i<len;i++)
        {
            char c=st.charAt(i);

            if(c==')')
            {
                System.out.println(stk.size());

                if(stk.isEmpty())
                continue;
                else
                stk.pop();
                
            }
            else if(c=='(')
            stk.push(c);

            res+=c;
            
        }

        return res;
    }
    public static void main(String[] args) {
        String st="()())()";
        invalid_parenthesis ob=new invalid_parenthesis();

        System.out.println(ob.fn(st));
    }
    
}
