import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class q2
 {
     public static void main(String[] args) {
         Scanner au=new Scanner(System.in);
         System.out.println("enter the size");

         int n=au.nextInt();
         int x[]=new int[n];
         Map <Integer,Integer> map=new HashMap<>();
         for(int i=0;i<n;i++)
         {
             x[i]=au.nextInt();
             if(map.containsKey(x[i]))
             map.put(x[i],map.get(x[i])+1);
             else
             map.put(x[i],1);
         }

         for(int i:map.keySet())
         {
             if(map.get(i)==1)
             System.out.println(i);
         }
         au.close();
     }
    
}
