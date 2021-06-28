import java.util.*;


public class q3
{
    public static void main(String[] args) {
        try {
            Scanner au=new Scanner(System.in);
        int t=au.nextInt();

        while(t>0)
        {
            int len=au.nextInt(),mat=au.nextInt();
            String st=au.next();
            
            
            String flag="NO";
        
            int  count=0;
           
            for(int i=0;i<st.length();i++)
            {
               if(st.charAt(i)=='*')
               {
               count+=1;            
               }
              else if(count==mat)
               {
                   flag="YES";
                   break;
               }
              else
               count=0;

            }
             System.out.println(flag);
                      
            t--;
        }
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}    

