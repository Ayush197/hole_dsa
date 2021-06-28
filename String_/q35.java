import java.util.*;

public class q35 
{
    public static void main(String[] args) 
    {
        Scanner au=new Scanner(System.in);
        System.out.println("Enter the two string of same size");
        String x=au.next(),y=au.next();

        int len=x.length(),count=0;

        Map <Character,Integer> m=new HashMap<>();
    
        Map <Character,Integer> n=new HashMap<>();
    

        for(int i=0;i<len;i++)
        {
            char a=x.charAt(i);

            if(m.containsKey(a))
            m.put(a, m.get(a)+1);
            else
            m.put(a,1);
        }
        
        for(int i=0;i<len;i++)
        {
            char a=y.charAt(i);

            if(m.containsKey(a))
            n.put(a, n.get(a)+1);
            else
            n.put(a,1);
        }

        String flag="Not possible";

        if(n.size()==m.size())
        flag="Possible";

        System.out.println(flag);

        
    }
    
}
