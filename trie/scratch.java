package trie;

import java.util.Arrays;

public class scratch 
{
    static int size=26;

    static class trie_node
    {
        trie_node tr[]=new trie_node[size];

        boolean end;
        trie_node()
        {
            end=false;
            Arrays.fill(tr,null);
        }
    }
    static trie_node root;

    static void insert(String key)
    {
        int len=key.length(),index;

        trie_node crawl=root;

        for(int i=0;i<len;i++)
        {
            index=key.charAt(i)-'a';
            if(crawl.tr[index]==null)
            crawl.tr[index]=new trie_node();

            crawl=crawl.tr[index];
        }
        crawl.end=true;
    }
    static boolean search(String key)
    {
        int len=key.length(),idx;

        trie_node crawl=root;
        for(int i=0;i<len;i++)
        {
            idx=key.charAt(i)-'a';
            if(crawl.tr[idx]==null)
            return false;

            crawl=crawl.tr[idx];
        }
        return crawl.end;
    }
    public static void main(String[] args)
     {
         // Input keys (use only 'a' through 'z' and lower case)
        String keys[] = {"the", "a", "there", "answer", "any",
        "by", "bye", "their"};

        String output[] = {"Not present in trie", "Present in trie"};



        root = new trie_node();

// Construct trie
      
       for (int i = 0; i < keys.length ; i++)
       insert(keys[i]);

// Search for different keys
         if(search("the") == true)
         System.out.println("the --- " + output[1]);
         else
         System.out.println("the --- " + output[0]);
        
    }
}

    
