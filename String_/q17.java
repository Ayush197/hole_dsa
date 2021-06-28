import java.util.Scanner;

public class q17
 {
     public static void main(String[] args) 
     {
         Scanner au=new Scanner(System.in);
         System.out.println("Enter the expression");
         String st=au.next();

        boolean flag=false;

        int j=st.length()-1;
        
        

        int i;
        for(i=0;i<st.length()-i-1;i++)
        {
            int last=j-i;
           char c=st.charAt(i);
           char last_c=st.charAt(last);
           int dif=last_c-c;
           if(c=='(')
           {
               if(dif==1)
               flag=true;
               else
               break;
           }
           else if(dif==2)
           flag=true;
           else
           break;
        }
       System.out.println(flag);

         
     }
    
}
