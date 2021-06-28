import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class q12
 {
     public static void main(String[] args)
      {
          Scanner au=new Scanner(System.in);
          System.out.println("Enter the string ");
          String st=au.next();

          String s="";

          for(int i=0;i<st.length();i++)
          {
              s="";
              char b=st.charAt(i);
              s+=b;
              
          for(int j=0;j<st.length();j++)
          {
              char c=st.charAt(j);
              if(b!=c)
              s+=c;
          }
          if(st.length()==s.length())
          System.out.println(s);
        }
        au.close();
     }
    
}
