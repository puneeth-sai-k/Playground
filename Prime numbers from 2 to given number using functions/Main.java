import java.util.Scanner;
class Main{
  static void prime(int j){
    int count=0;
    for(int k=1;k<=j;k++)
    {
      if(j%k==0)
        count=count+1;
    }
    if(count==2)
      System.out.println(j);
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      for(int i=1;i<=a;i++){
        prime(i);
      }
    }
}