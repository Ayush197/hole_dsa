import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class q9
 {
     public static void main(String[] args)
      {
          Scanner au=new Scanner(System.in);
          System.out.println("Enter the size and X");
          int n=au.nextInt(),X=au.nextInt();
          
          int x[]=new int[n];

          for(int i=0;i<n;i++)
          x[i]=au.nextInt();

          Map <Integer,Integer> map=new HashMap<>();

          int store=0;
          for(int i=0;i<n;i++)
          {
              if(map.containsKey(x[i]))
              {
                 store=1;
              }
              else
              map.put(x[i], i);
          }
          int res=0;

          
          if(store==1)
          res=map.get(X);

          System.out.println(res);
        


          au.close();
         
     }
    
}
