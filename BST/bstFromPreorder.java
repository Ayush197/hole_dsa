public class bstFromPreorder {

    class tree
    {
        int data;
        tree right, left;
        tree(int data)
        {
            this.data=data;
            right=left=null;
        }
    }
    tree root;
    void func(int data[])
    {
        int size=data.length;
        root=util_func(root,0,data,data[0],Integer.MAX_VALUE,Integer.MIN_VALUE,size);
    }
    
    private bstFromPreorder.tree util_func(tree node,int idx,int[] data, int val, int maxValue, int minValue, int size) {
        
        if(idx>=size)
        return root;

        if(val>minValue&&val>maxValue)
        {
            root=new tree(val);
            idx+=1;

            if(idx<size)
            {
             util_func(node.left, idx, data, data[0], val, minValue, size);
             util_func(node.right, idx, data, data[0], maxValue, val, size);

            }
    
        }
        return root;
    }

    public static void main(String[] args) {
        
    }
    
}
