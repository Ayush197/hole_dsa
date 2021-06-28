import java.util.Scanner;

public class q8 
{
    public static void main(String[] args) {
        Scanner au=new Scanner(System.in);
        System.out.println("enter the a and b");
        int a=au.nextInt(),b=au.nextInt();

        int s=1;
        if((a*b)<1)
        s=-1;

        int count=0;

        b=Math.abs(b);
        a=Math.abs(a);
        while(a>=b)
        {
            a=a-b;
            count++;
        }
        System.out.println((s*count));
        au.close();
    }
    
}
