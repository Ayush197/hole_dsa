public class q24 
{
    static class node 
    {
        node left,right;
        int data;
        node(int data)
        {
            this.data=data;
            left=right=null;
        }
    }
    static int distt(node x,int key,int level)
    {
        if(x==null)
        return -1;

        if(x.data==key)
        return level;

        int d=distt(x.left, key, level+1);

        return (d!=-1)?d:distt(x.right, key, level+1);
    }
    static int d1=-1,d2=-1,dist=0;
    static node find_dist(int m,int n,node x,int level)
    {
        if(x==null)
        return null;

        if(x.data==m)
        {
            d1=level;
            return x;

        }
        if(x.data==n)
        {
            d2=level;
            return x;
        }

        node lft=find_dist(m, n, x.left, level+1),rght=find_dist(m, n, x.right
        , level);

        if(lft!=null&&rght!=null)
        {
            dist=(d1+d2)-2*level;
            return x;
        }

        return (lft!=null)?lft:rght;
    }
    static int final_dist(node x,int m,int n)
    {
        d1=-1;
        d2=-1;
        dist=0;

        node fin=find_dist(m, n, x, 0);

        if(d1!=-1&&d2!=-1)
        {
            return dist;
        }
        if(d1!=-1)
        {
            dist=distt(fin, n, 0);
            return dist;
        }
        if(d2!=-1)
        {
            dist=distt(fin, m, 0);
            return dist;
        }
        return -1;

    }
    
}
