import java.io.PrintWriter;
import java.util.*;
class q2 
 {
   

    public static void main(String[] args) 
    {
        
      try {

        Scanner au=new Scanner(System.in);
        PrintWriter out=new PrintWriter(System.out);
        int t=au.nextInt();
        while(t>0)
        {
            int x=au.nextInt(),y=au.nextInt(),z=au.nextInt();

            if((y%z==0)||((x+1)-y)%z==0)
            {
            out.println("yes");
            out.flush();
            }
            else
            {
            out.println("no");
            out.flush();
            }
          
          
            t--;
        }
        au.close();
          
      } catch (Exception e) {
          //TODO: handle exception
      }
    }
}
