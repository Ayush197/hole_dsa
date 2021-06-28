import java.util.*;
public class q7 
{
    static boolean shuffle(String a,String b,String c)
    {
      int i=0,j=0,k=0;

      if(a.length()+b.length()==c.length())
      return false;

      while(k<c.length())
      {
          if(i<a.length()&&a.charAt(i)!=c.charAt(k))
          i+=1;
          else if(j<b.length()&&b.charAt(j)==c.charAt(k))
          j+=1;
          else
          return false;

          k+=1;
      }
      if(i<a.length()||j<b.length())
      return false;

      return true;

    }
    public static void main(String[] args) 
    {
        Scanner au=new Scanner(System.in);
        
        String a="xy";
        String b="12";

        String x[]={"1xy2","x12y"};

        for(String st:x)
        {
            if(shuffle(a, b, st))
            System.out.println(st+" >>> Valid");
            else
            System.out.println(st+" >>Not valid");
        }
        au.close();

        
    }
    
}
