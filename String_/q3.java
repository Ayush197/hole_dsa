import java.util.*;
public class q3
{
    public static void main(String[] args) {
        Scanner au=new Scanner(System.in);

        System.out.println("Enter the string");
        String x=au.next();
        
        

        HashMap <Character,Integer> chMap=new HashMap<>();
        
        for(int i=0;i<x.length();i++)
        {
            char c=x.charAt(i);
            if(!chMap.containsKey(c))
            chMap.put(c, 1);
            else
            chMap.put(c, chMap.get(c)+1);
        }
        for(Map.Entry mapElement: chMap.entrySet())
        { 
            char key=(char)mapElement.getKey();
            int val=((int)mapElement.getValue());

            if(val>=1)
            {
                System.out.println(key+"  "+val);
            }
        }

    }
}