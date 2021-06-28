import java.util.*;
public class q29 
{
    int value(char c)
    {
        if(c=='I')
        return 1;
        if(c=='V')
        return 5;
        if(c=='C')
        return 100;
        if(c=='L')
        return 50;
        if(c=='D')
        return 500;
        if(c=='M')
        return 1000;

        return -1;
    }
    int romantonumeric(String st)
    {
        int res=0;
        for(int i=0;i<st.length()-1;i++)
        {
            char c=st.charAt(i);
                      
                if(value(c)>=value(st.charAt(i+1)))
                {
                    res+=value(c)+value(st.charAt(i+1));
                }
                else
                res+=value(st.charAt(i+1))-value(c);

        }
        return res;
    }
    public static void main(String[] args) 
    {
        Scanner au=new Scanner(System.in);
        System.out.println("Enter the roman number");
        String st=au.next();
        q29 ob=new q29();

        System.out.println(ob.romantonumeric(st));
        au.close();
        
    }
    
}
