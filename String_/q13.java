import java.util.*;
public class q13 
{
    public static void main(String[] args) 
    {
        Scanner au=new Scanner(System.in);
        System.out.println("Enter the String");
        String st=au.next();

        int zero_count=0,one_count=0;
        int total=0;

        for(int i=0;i<st.length();i++)
        {
            char c=st.charAt(i);

            if(c=='0')
            zero_count+=1;
            else if(c=='1')
            one_count+=1;
            if(one_count>0&&zero_count>0)
            {
                if(one_count==zero_count)
                {
                total+=1;
                zero_count=0;
                one_count=0;
                }
            }

        }
        System.out.println(total);
        
    }
    
}
