import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class stack_by_dequeue {

    //deque can be bulit from scratch;

    public static void main(String[] args) {
        
        Scanner au= new Scanner(System.in);
        Deque<Integer> dq=new LinkedList<>();
        dq.addFirst(2);
        dq.addFirst(4);
        dq.addFirst(5);
        System.out.println("the stack using deque");
        System.out.println(dq);
        au.close();
    }
    
}
