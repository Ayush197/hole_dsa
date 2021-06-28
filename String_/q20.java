import java.util.*;
public class q20 
{
    public static void main(String[] args) 
    {
        Scanner au=new Scanner(System.in);
        System.out.println("Enter the String");
        String st=au.next();

        int count=0;
        char ch[]=st.toCharArray();

        int max=Integer.MIN_VALUE;

        for(int i=0;i<st.length()-1;i++)
        {
            int dif=ch[i+1]-ch[i];
            if(dif==1||dif==0)
            count+=1;
            else
            {
                if(count>max)
                max=count;
                count=0;
            }
        }

        if(count>max)
        max=count;
        if(max==ch.length)
        max=max-1

        System.out.println((count+1));
        au.close();

        
        
    }
    
}
