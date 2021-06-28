import java.util.*;
public class mappe 
{

    public static void main(String[] args) {
    
        Map <String,Integer> num=new HashMap<>();

    }
    public static int gethash(  String s)
    {
        int hash=0;
        for(int i=0;i<s.length();i++)
        {
            hash+=(int)s.charAt(i);
        }
        return hash;
    }
}
