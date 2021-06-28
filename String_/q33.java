import java.util.*;
public class q33 
{
    public static void main(String[] args) 
    {
        Scanner au=new Scanner(System.in);
        System.out.println("Enter the number");
        String s=au.next();

        int len=s.length();
        int div=len/3;
        if(div>4)
        System.out.println("not possible");
        else
        {
            String z="",ip="";
            int i=0;
            boolean flag=true;
            while(i<len)
            {
                char c=s.charAt(i);
                 z+=c;
                 if(z.length()==3)
                 {
                     for(int j=0;j<3;j++)
                     {
                         char t=z.charAt(j);
                         if(j==0&&t=='0')
                         {
                             flag=false;
                             break;
                         }
                         ip+=t;
                         
                     }
                     if(Integer.valueOf(i)>255)
                     {
                     flag=false;
                     break;
                     }
                     z="";
                 }
                 if(flag==false)
                 break;
                 ip+='.';
                i++;
            }
            if(flag)
            System.out.println(ip);
            else
            System.out.println("not possible");

        }

        
    }
    
}
