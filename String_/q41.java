import java.util.Scanner;

public class q41 {
    public static void main(String[] args) {
        Scanner au=new Scanner(System.in);
        
        System.out.println("enter the string");
        String st=au.next();

        int len=st.length();

        int a=0,b=len-1;
        String store="";
        while(true)
        {
            char s=st.charAt(a), e=st.charAt(b);

            if(a>=b)
            break;
            if(s==e)
            {
            a++;
            b--;
            }
            else
            {
                store+=b;
            b--;
            }
            
            
        }
    
        System.out.println(store.length());
        au.close();
    }
    
    
}
