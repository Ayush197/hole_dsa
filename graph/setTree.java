import java.util.Arrays;
import java.util.TreeSet;

class setTree
{
    public static void main(String[] args) {
        TreeSet <Integer> treeSet=new TreeSet<>();

        int A []= {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};

        for(int val: A)
        treeSet.add(val);

        System.out.println(treeSet);
        Arrays.sort(A);
        //System.out.println(A);
    
    }
}