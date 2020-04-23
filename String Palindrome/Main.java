import java.util.Scanner;
class Main{
    public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
String original, reverse = "";
    original = in.nextLine();

    int length = original.length();

    for (int i = length - 1 ; i >= 0 ; i--)
      reverse = reverse + original.charAt(i);
if(original.equals(reverse))
  System.out.println("Yes");
else
  System.out.println("No");
    }
}