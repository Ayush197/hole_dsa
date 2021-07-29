import java.util.Scanner;

public class string_perm {


    void find_permatutation(String st,String res)
    {
        if(st.length()==0)
        {
            System.out.println(res+" ");
            return;
        }
        for(int i=0;i<st.length();i++)
        {
            char curr=st.charAt(i);
            String left=st.substring(0, i),right=st.substring(i+1, st.length());
            find_permatutation(left+right, res+curr);
        }
    }

    public static void main(String[] args) {
        
        Scanner au=new Scanner(System.in);
        System.out.println("Enter the string");
        String st=au.next();
        string_perm ob=new string_perm();
        ob.find_permatutation(st, "");
        
        au.close();
    }
    
}
