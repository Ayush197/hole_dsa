import java.util.Scanner;
import java.util.Stack;

public class q32
 {
     public static void main(String[] args) 
     {
         Scanner au=new Scanner(System.in);
         System.out.println("ente the pattern");
         String x=au.next();
         Stack <Character> s=new Stack<>();

         for(int i=0;i<x.length();i++)
         {
             char cur=x.charAt(i);
              if(cur=='['&&!s.empty())
              {
                  if(s.peek()==']')
                  s.pop();
                  else
                  s.push(cur);
              }
              else
              s.push(cur);

         }
         System.out.println("the minimum no. of swaps requires >>>> "+s.size());
         
     }
    
}
