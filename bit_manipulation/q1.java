import java.util.Scanner;
class q1
{
    public static void main(String[] args) {
        Scanner au=new Scanner(System.in);
        System.out.println("enter the number");
        int n=au.nextInt();

        int count=0;
        while(n>0)
        {
            if((n&1)>0)
            count++;

            n=n>>1;
        }
        System.err.println(count);
        au.close();
    }
}