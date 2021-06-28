import java.util.*;
public class q42 
{
    public static void main(String[] args) {
        Scanner au=new Scanner(System.in);
        System.out.println("enter the string");
        String st=au.next();
        Map<Character,Character> map=new HashMap<>();
        for(int i=0;i<st.length();i++)
        {
            char c=st.charAt(i);
            if(!map.containsKey(c))
            map.put(c, c);
        }
        String res="";
        for(int i=0;i<st.length();i++)
        {
            char t=st.charAt(i);
            if(map.containsKey(t)&&t!=' ')
            {
                st=st.replace(t,' ');
                res+=t;

            }
        }
        System.out.println(res);
        System.out.println(map);

    }
    
}
