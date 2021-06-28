import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class q8 
{
    
    public static void main(String[] args) 
    {
        Scanner au=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=au.nextInt();

        String prev="1";

        String regexPattern="(.)\\1*";
        Pattern pat= Pattern.compile(regexPattern);
        
        for(int i=1;i<n;++i)
        {
            Matcher match=pat.matcher(prev);
            StringBuffer next=new StringBuffer();

            while(match.find())
            {
                next.append((match.group().length())+String.valueOf(match.group().charAt(0)));

            }
            prev=next.toString();
            System.out.println(prev);
        }
        System.out.println(prev);
        au.close();
        
    }
    
}
