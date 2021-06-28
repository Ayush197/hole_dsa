import java.util.Scanner;

public class q25
 {
     public static void main(String[] args) 
     {
         Scanner au=new Scanner(System.in);
         System.out.println("Enter the String");
         char st[]=au.next().toCharArray();

         int len=st.length,flip=0;

         for(int i=0;i<len-1;i++)
         {
             char a=st[i],b=st[i+1];
             if(a==b)
             {
             flip+=1;
             st[i+1]=(a=='1')?'0':'1';

             }

         }
         System.out.println("No. of flips "+flip);
         
     }
    
}
