import java.util.Scanner;

class fib
{
    int func(int n,int a,int b,int i)
    {
        if(i<n)
        {
        int c=b+func(n, b, a+b, i+1);
        return c;
        }
        else
        return 0;
    }
    public static void main(String[] args) {
        
        Scanner au=new Scanner(System.in);
        int n=au.nextInt();
        fib ob=new fib();
       int res= ob.func(n, 0, 1, 1);
       System.out.println(res);


        au.close();
    }
}