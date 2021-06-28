import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class q40
{
    public static void main(String[] args) {
        Scanner au=new Scanner(System.in);
        System.out.println("Enter the no. of  strings");
        int n=au.nextInt();

        String s[]=new String[n];
        for(int i=0;i<n;i++)
        s[i]=au.next();

        HashMap <String,List<String>>  map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            
            String word=s[i];
            char c[]=word.toCharArray();
            Arrays.sort(c);
            String neww=new String(c);

            if(map.containsKey(neww))
            {
                map.get(neww).add(word);
            }
            else
            {
                List <String> ar=new ArrayList<>();
                ar.add(word);
                map.put(neww,ar);
            }
            
        }
        for(String k:map.keySet())
            {
                List <String> x=map.get(k);
                if(x.size()>0)
                System.out.println(x);
            }
        au.close();
    }    
}
