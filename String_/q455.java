import java.util.*;
class q455
{
    public static void main(String[] args) {
        Scanner au=new Scanner(System.in);
        String st=au.next();
        int max_char=256;

        boolean s[]=new boolean[max_char];
        Arrays.fill(s, false);
        int count=0;

        for(int i=0;i<st.length();i++)
        if(!s[st.charAt(i)])
        {
        s[st.charAt(i)]=true;
        count+=1;

        }
        int start = 0, start_index = -1;
        int min_len = Integer.MAX_VALUE;
 
        int countt = 0;
        int[] curr_count = new int[max_char];
        int i;
        for( i=0;i<st.length();i++)
        {
           curr_count[st.charAt(i)]++;

           if(curr_count[st.charAt(i)]==1)
           countt+=1;

           if(countt==count)
           {
               while(curr_count[st.charAt(start)]>1)
               {
                   curr_count[st.charAt(start)]--;
                   start++;
               }
                   int len_window = i - start + 1;
                if (min_len > len_window) {
                    min_len = len_window;
                    start_index = start;
                }
               
           }
        }
        System.out.println(st.substring(start_index,start_index+min_len));



    }
}