import java.util.Scanner;
class q4
{
    public static void main(String[] args) {
        Scanner au=new Scanner(System.in);
        System.out.println("enter the number");
        int m=au.nextInt();

        int count=0;
        while(m>0)
        {
           int  n=m;
        while(n>0)
        {
            if((n&1)>0)
            count++;

            n=n>>1;
        }
        m--;
    }
        System.err.println(count);
        au.close();
    }
}