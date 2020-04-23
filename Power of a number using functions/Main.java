import java.util.Scanner;
class Main{
    static void power(int i,int j){
      int temp=1;
    while(j>0)
    {
      temp=temp*i;
      j=j-1;
    
    }
      System.out.println(temp);
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    power(a,b);
	}
}
