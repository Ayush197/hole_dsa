import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class q43 {
    
    public static void main(String[] args) {
        Scanner au=new Scanner(System.in);
        System.out.println("enter the limit and the string  ");
    
        int lim=au.nextInt();
        String st=au.next();
        Map <Character,Integer> map=new HashMap<>();
        int x=0,count=0;

        for(int i=0;i<st.length();i++)
        {
            char c=st.charAt(i);
            if(map.containsKey(c))
            {
            map.put(c, map.get(c)+1);
            x-=1;
            }
            else
            {
            map.put(c, 1);
            x+=1;
            if(x>lim)
            count+=1;

            }
        }
        System.out.println(count);
    }
}
