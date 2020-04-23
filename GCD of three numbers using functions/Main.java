import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      if(b%a==0&&c%a==0)
        System.out.println(a);
      else if(c%b==0&&a%b==0)
        System.out.println(b);
      else
        System.out.println(c);
	}
}