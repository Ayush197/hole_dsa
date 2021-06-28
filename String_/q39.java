import java.util.Scanner;

public class q39
{
    public static void main(String[] args) {
        Scanner au=new Scanner(System.in);
        System.out.println("Enter the string");
        String st=au.next();
        
    
        String res="";
        for(int i=0;i<st.length();i++)
        {
            if(i+1<st.length())
            if(st.charAt(i)==st.charAt(i+1))
            continue;
            
            res+=st.charAt(i);
            
        }
        System.out.println(res);
        au.close();;
    }    
}
