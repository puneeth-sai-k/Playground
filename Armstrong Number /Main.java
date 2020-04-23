import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner sc=new Scanner(System.in);
      int number=sc.nextInt();
      int  originalNumber, remainder, result = 0, n = 0;
        originalNumber = number;
        for (;originalNumber != 0; originalNumber /= 10)
        {
            n++;
        }
        originalNumber = number;
        for (;originalNumber != 0; originalNumber /= 10)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
        }
        if(result == number)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not a Armstrong Number");
	}
}