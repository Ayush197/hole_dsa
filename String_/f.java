import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class f{
  public String countAndSay(int n) {
    String currSeq = "1";

    // Pattern to match the repetitive digits
    String regexPattern = "(.)\\1*";
    Pattern pattern = Pattern.compile(regexPattern);

    for (int i = 1; i < n; ++i) {
      Matcher m = pattern.matcher(currSeq);
      StringBuffer nextSeq = new StringBuffer();

      // each group contains identical and adjacent digits
      while (m.find()) {
        nextSeq.append(m.group().length() + String.valueOf(m.group().charAt(0)));
      }
      // prepare for the next iteration
      currSeq = nextSeq.toString();
    }

    return currSeq;
  }
  public static void main(String[] args) {
      Scanner au=new Scanner(System.in);
      System.out.println("Enter the n");
      int n=au.nextInt();
      f ob =new f();
      System.out.println(ob.countAndSay(n));
  }
}