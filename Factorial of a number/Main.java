import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int fact=1;
      while(a>0)
      {
        fact=fact*a;
        a=a-1;
      }
      System.out.println(fact);
	}
}