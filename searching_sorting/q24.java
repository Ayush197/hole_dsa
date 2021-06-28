import java.util.Scanner;

public class q24 
{
    public static void main(String[] args) 
    {
        Scanner au=new Scanner(System.in);
        System.out.println("enterr a , b,c");

        int a=au.nextInt(),b=au.nextInt(),c=au.nextInt();

        int x=a;
        String s="not possible";

        while(x<=b)
        {
            x+=c;
            if(x==b)
            s="possible";
        }
        System.out.println(s);
        
    }
    
}
