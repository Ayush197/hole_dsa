import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class q11
{
    static void seq(int n,String s,String  curr,int  idx)
    {
        if(idx==n)
        return;
        if(curr!=null&&!curr.trim().isEmpty())
        System.out.println(curr);

        for(int i=idx+1;i<n;i++)
        {
            curr+=s.charAt(i);
            seq(n, s, curr, i);

            curr=curr.substring(0,curr.length()-1);
        }
    }
    public static void main(String[] args)
     {
         Scanner au=new Scanner(System.in);

         String st =au.next();
         
        seq(st.length(),st, "", -1);

         
         au.close();
        
    }    
}
