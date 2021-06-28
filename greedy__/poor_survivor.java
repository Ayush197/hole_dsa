import java.util.Scanner;

public class poor_survivor 
{
    public static void main(String[] args) {
        
        Scanner au=new Scanner(System.in);
        System.out.println("Enter the no of days left, total unit of food, price of one unit o food");
        int n=au.nextInt(),s=au.nextInt(),m=au.nextInt();
        boolean res=(n>=(s/m));
        System.out.println(res);
        au.close();
    }
    

}
