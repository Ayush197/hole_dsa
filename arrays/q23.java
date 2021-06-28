import java.util.*;
public class q23 
{
    long fact(int n)
    {
        if(n==0)
        return 1;
        else 
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        
        Scanner au=new Scanner(System.in);
        
        q23 ob=new q23();

        System.out.println("Enter the number");
        int n=au.nextInt();
        System.out.println(ob.fact(n));

        
    }
    
}
