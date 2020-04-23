import java.util.Scanner;
class Main{
      public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int arr[] = new int[n];
       for(int index = 0; index <= n - 1; index++){
           arr[index] = in.nextInt();
       }

       zeroes_at_the_end(n, arr);
       for(int index = 0; index <= n - 1; index++){
           System.out.print(arr[index] + " ");
       }
    }
    public static void zeroes_at_the_end(int n, int arr[])
    {
      
        int count = 0; 
        for(int index = 0; index <= n - 1; index++){
            if(arr[index] != 0)
            {
                int temp = arr[index];
                arr[index] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
    }
}