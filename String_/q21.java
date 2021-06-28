import java.util.*;
public class q21 
{
    public static void main(String[] args)
     {
         Scanner au=new Scanner(System.in);
         System.out.println("Enter the string");

         String st=au.nextLine();
         String str[] = {"2","22","222",
                        "3","33","333",
                        "4","44","444",
                        "5","55","555",
                        "6","66","666",
                        "7","77","777","7777",
                        "8","88","888",
                        "9","99","999","9999" };

        
        String store_code="";       
        st=st.toUpperCase();
        

        for(int i=0;i<st.length();i++)
        {
            char c=st.charAt(i);
            int idx=c-'A';
           // System.out.println(c+"..."+st);
           if(c==' ')
           store_code+="0";
           else
           store_code+=str[idx];
        }          
        System.out.println(store_code); 
        au.close();
    }
    
}
