import java.util.*;

public class q5 
{
    static List <String> list=new LinkedList<>();

    static void subs(String s,String curr)
    {
        if(s.length()==0)
        {
        list.add(curr.trim());
        return;
        }

        subs(s.substring(1),curr+s.charAt(0));

        subs(s.substring(1), curr);

    }
    public static void main(String[] args) {
        Scanner au=new Scanner(System.in);
        int t=au.nextInt();
        while(t>0)
        {
            String x=au.next();
            subs(x, "");
            int res=0;
            System.out.println(list);
            for(int i=0;i<list.size();i++)
            {
                int c=Integer.parseInt(list.get(i),2);
                if(res!=c);

            }
            //System.out.println(list);
            
            t--;
        }
    }
    
}
