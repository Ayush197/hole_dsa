import java.util.*;
class q4was
{
    public static void main(String[] args) {
        Scanner au=new Scanner(System.in);
        String st=au.next();

        Map <Character,Integer> map=new HashMap<>();

        int extra=0;
        for(int i=0;i<st.length();i++)
        {
            char c=st.charAt(i);
           
            if(map.containsKey(c))
            extra+=1;
            map.put(c,1);
            char prev=c;
        }
        String store="";
        int count=0;
        for(int i=st.length()-1;i>=0;i--)
        {
            char c=st.charAt(i);
            if(map.containsKey(c))
            {
            store=c+store;
            count+=1;
            if(count==map.size()+extra)
            break;
            }
            else
            {
                store="";
            }
        }
        System.out.println(store);
    }
}