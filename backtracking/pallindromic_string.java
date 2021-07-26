import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class pallindromic_string {

    ArrayList<ArrayList<String>> pal_words;
    Deque<String> word;
    //constructor for initializing pal_words and word
    //will later use in the function 'util_fn'
    pallindromic_string()
    {
         pal_words=new ArrayList<>();
         word=new LinkedList<String>();

    }

    //function to check for pallindrome
    boolean isPalindrome(String st,int start,int end)
    {
        while(start<end)
        {
            if(st.charAt(start++)!=st.charAt(end--))
            return false;
        }
        return true;
    }

    //this function will yield in all pallindromic 'sequence'
    void util_fn(String st,int start,int len)
    {
        //it reaches end and will add the pallindromes in the word
        if(start>=len)
        {
            pal_words.add(new ArrayList<>(word));
            return;
        }

        //check for all the permututaion
        for(int i=start;i<len;i++)
        {
            if(isPalindrome(st, start,i))
            {
                word.addLast(st.substring(start,i+1));
                util_fn(st, i+1, len);

                word.removeLast();
            }
        }
    }
    
    public static void main(String[] args) 
    {
        String st="nitin";

        pallindromic_string ob=new pallindromic_string();

        ob.util_fn(st, 0, st.length());

        System.out.println(ob.pal_words);
        
    }
}
