import java.util.*;

public class q5 
{
    public static void main(String[] args) {
        Scanner au=new Scanner(System.in);
        System.out.println("enter the three element");

        int a=au.nextInt(),b=au.nextInt(),c=au.nextInt();

        int res=0;

        if((a>b&&a<c)||(a>c&&a<b))
        res=a;
        else if((b>a&&b<c)||b<a&&b>c)
        res=b;
        else
        res=c;

        System.out.println(res);
        au.close();
    }
    
}
