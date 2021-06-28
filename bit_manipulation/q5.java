import java.util.Scanner;

public class q5 
{
    static boolean pow(int n)
    {
        while(n%2==0)
        {
            n=n/2;
        }

        return (n==1)?true:false;

        

        
    }
    public static void main(String[] args) {
        Scanner au=new Scanner(System.in);
        System.out.println("enter the number");

        int n=au.nextInt();
        boolean res=pow(n);

        String st=(res)?"possible":"not possible";
        System.out.println(st);
        au.close();
    }
    
}
