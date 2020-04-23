import java.util.Scanner;
class Main{
  static void sum(int i){
    int j=(i+1)*i/2;
    System.out.println(j);
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      sum(a);
	}
}