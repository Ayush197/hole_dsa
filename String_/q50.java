import java.util.Scanner;

public class q50
 {
     public static void main(String[] args) {
         
        Scanner au=new Scanner(System.in);
        String s=au.next();

        int len =s.length(),start=0,end=len-1;
        int x=0,y=0;
        while(x<len)
        {
            char a=s.charAt(start),b=s.charAt(end);
            if(a==b)
            {
                start++;
                end--;
            }
            else
            {
            end--;
            y++;
            }
            x++;
        }
        System.out.println(y);
        
        au.close();
     }
    
}
