import java.util.Scanner;

public class q7
 {
     public static void main(String[] args) {
         Scanner au=new Scanner(System.in);
         System.out.println("enter the number");
         int a=au.nextInt();

         char  st[]=Integer.toBinaryString(a).toCharArray();

         int index=0;
         boolean flag=true;
         for(int i=st.length-1;i>=0;i--)
         {
             if(st[i]=='1')
             {
                 if(flag)
                 {
                 index=i;
                 flag=false;
                 }
                 else
                 {
                 index=-1;
                 break;
                 }
             }
         }

         if(index==-1)
         System.err.println(index);
         else
         System.err.println(st.length-index);
         au.close();
     }
    
}
