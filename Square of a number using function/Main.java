import java.util.Scanner;
class Main
{
  static void square(int i){
    int j=i*i;
    System.out.println(j);
  }
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      square(a);
	} 
}