package trie;

import java.util.Arrays;

public class shortest 
{
    static int max_size=256;
    // trie classs
   static class trie_node
    {
        trie_node child[]=new trie_node[max_size];
        int f;
        //boolean end;
        trie_node()
        {
            f=1;
            //end=false;
            Arrays.fill(child, null);
        }
    }
    static trie_node root;
    //for inserting the 'string' in trie
    static void insert(String key)
    {
        
            int len=key.length();
       trie_node crawl=root;
        for(int i=0;i<len;i++)
        {
            int idx=key.charAt(i);
           if(crawl.child[idx]==null)
           crawl.child[idx]=new trie_node();
           else
           crawl.child[idx].f++;

           crawl=crawl.child[idx];
        } 
        
       
    }
    static void pre_util(trie_node root,char pref[],int idx)
    {
        if(root==null)
        return;
        if(root.f==1)
        {
           pref[idx]='\0';
           int i=0;
           while(pref[i]!='\0')
           System.out.print(pref[i++]);
           System.out.print(", ");
           return;
        }
        for(int x=0;x<256;x++)
        {
            if(root.child[x]!=null)
            {
                pref[idx]=(char)x;
               pre_util(root, pref, idx+1);
            }
        }

    }
    static void find_pre(String ar[])
    {
        trie_node root=new trie_node();
        root.f=0;
        for(int i=0;i<ar.length;i++)
        insert(ar[i]);

        char pref[]=new char[500];
        
        pre_util(root, pref, 0);
    }
    public static void main(String[] args) 
    {
        String arr[] = {"zebra", "dog", "duck", "dove"};
        find_pre(arr);
        
    }
    
}
