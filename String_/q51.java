import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

class KeyComparator implements Comparator<key>
{
    public int compare(key k1,key k2)
    {
        if(k1.freq<k2.freq)
        return 1;
        else if(k1.freq>k2.freq)
        return -1;

        return 0;
    }

}
class key
{
    int freq;
    char c;
    key(int f,char t)
    {
        freq=f;
        c=t;
    }
}
public class q51
 {
     public static void main(String[] args) {
         
        Scanner au=new Scanner(System.in);
        System.out.println("Enter the string");
        String st=au.next();

        int len =st.length();
        //Map <Character,Integer> map=new HashMap<>();

        /*
        for(int i=0;i<st.length();i++)
        {
            char t=st.charAt(i);
            if(map.containsKey(t))
            map.put(t, map.get(t)+1);
            else
            map.put(t, 1);
        }
        String store="";

        for(char c:map.keySet())
        {
            if(map.get(key))
        }
        */

        PriorityQueue <key> pq=new PriorityQueue<>(new KeyComparator());
        int count[]=new int[26];

        for(int i=0;i<len;i++)
        count[st.charAt(i)-'a']++;

        for(char c='a';c<'z';c++)
        {
            int v=c-'a';
            if(count[v]>0)
            pq.add(new key(count[v],c ));
        }
        String store="";

        key prev=new key(-1,'#');

        while(pq.size()!=0)
        {
            key k=pq.peek();
            pq.poll();
            store+=k.c;
            if(prev.freq>0)
            pq.add(prev);

            k.freq--;
            prev=k;
        }
        System.out.println(store);

     }
    
}
