import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class repeated_string
{
    public static void main(String[] args)
     {
         Scanner au=new Scanner(System.in);
         String s=au.next();
         Map<Character,Integer> map= new HashMap<>();
         for(char c: s.toCharArray())
         {
             if(map.containsKey(c))
             {
                 map.put(c, map.get(c)+1);
             }
             else
             map.put(c, 1);
         }
         int a=0;
         for(Map.Entry<Character,Integer> entry: map.entrySet())
         {
            a=entry.getValue()-a;
         }
         if(a<0)
         System.out.println("possible");
         else
         System.out.println("not possible");

         au.close();
        
    }
}