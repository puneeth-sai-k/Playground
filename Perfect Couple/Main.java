import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
      int sum=sc.nextInt();
      for(int j=0;j<n;j++){
        for(int k=j+1;k<n;k++){
          if(a[j]+a[k]==sum)
            System.out.println(a[j]+", "+a[k]);
        }
      }
    }
}