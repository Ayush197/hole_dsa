import java.util.*;

public class word_break {

     void word_break_fn(int n,List<String> list,String st,String ans)
     {
         for(int i=1;i<=n;i++)
         {
             String pre=st.substring(0,i);

             if(list.contains(pre))
             {
                 if(i==n)
                 {
                     ans+=pre;
                     System.out.println(ans);
                     break;
                 }
                 word_break_fn(n-i, list, st.substring(i, n), ans+pre+" ");
             }
         }
     }

    public static void main(String[] args) {
    String st1 = "iloveicecreamandmango"; // for first test case
    String st2 ="ilovesamsungmobile";     // for second test case
    int n1 = st1.length();                 // length of first string
    int n2 = st2.length();                 // length of second string
 
    // List of strings in dictionary
    List <String> list= Arrays.asList("mobile","samsung","sam","sung",
                                      "man","mango", "icecream","and",
                                      "go","i","love","ice","cream"); 
                                      
    word_break ob=new word_break();
    //for st1
    ob.word_break_fn(n1, list, st1, "");
    //for st2
    ob.word_break_fn(n2, list, st2, "");
        
        
    }
    
}
