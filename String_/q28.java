
import java.util.*;

public class q28
 {
     static int c=256;
     
     static void search_pat(char pat[],char txt[])
     {
        int bad[]=new int[c];
        Arrays.fill(bad,-1);

        for(int i=0;i<pat.length;i++)
        bad[(int)pat[i]]=i;
         
        
        int m=pat.length,n=txt.length;

          int s=0;
          while(s<m+n)
          {
              int j=m-1;

              while(j>=0&&pat[j]==txt[s+j])
              j--;

              if(j<0)
              {
                  System.out.println("pattern found at index  "+s);

                  s+=(s+m<n)?m-bad[txt[s+m]]:1;
                
              }
              else
              {
                  s+=Math.max(1, j-bad[txt[s+j]]);
              }

                                                 
          }
     }

     public static void main(String[] args) 
     {
         Scanner au=new Scanner(System.in);
         System.out.println("Enter the text and pattern");
         char txt[]=au.nextLine().toUpperCase().toCharArray();
         char pat[]=au.nextLine().toUpperCase().toCharArray();
         search_pat(pat, txt);




         au.close();
         
     }
    
}
