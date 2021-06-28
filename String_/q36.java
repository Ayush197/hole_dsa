import java.util.Scanner;

public class q36 
{
    public static void main(String[] args) {
        
        Scanner au=new Scanner(System.in);
        System.out.println("Enter the two Strings");
        String x=au.next(),y=au.next();


        int m=x.length(),n=y.length();
        if(m!=n)
        System.out.println("Not possible");
        else
        {
            int c[]= new int[256];
            for(int i=0;i<m;i++)
            {
                c[x.charAt(i)]++;
                c[y.charAt(i)]--;
            }
            String flag="possible";

            for(int i=0;i<256;i++)
            {
                if(c[i]!=0)
                {
                    flag="not"+flag;
                    break;
                }
            
            }
            if(flag.equals("possible"))
            {
                int i=m-1,j=n-1,result=0;
                while(true)
                {
                   if(x.charAt(i)!=y.charAt(j))
                   result+=1;
                   else
                   j--;

                   i--;
                    if(i<0||j<0)
                    break;

                }
                System.out.println(result);
            
            
            }
            else
            System.out.println("not possible");
        }
        au.close();
    }
    
}
