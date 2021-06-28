import java.util.*;
public class q5
{
    public static void main(String[] args) {
        Scanner au=new Scanner(System.in);

        System.out.println("Enter the string A and B");
        String x=au.next();
        String y=au.next();
        
        String rev="",t="";
        boolean flag=false;

        if(x.length()==y.length()&&(x+y).indexOf(y)!=-1)
        flag=true;
        
        System.out.println(flag);
    }
}