import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     Scanner scanner = new Scanner(System.in);
        String originalStr = scanner.nextLine();
        scanner.close();
 
        String words[] = originalStr.split("\\s");
        String reversedString = "";

        for (int i = 0; i < words.length; i++) { 
            if (i == words.length - 1) 
                reversedString = words[i] + reversedString; 
            else
                reversedString = " " + words[i] + reversedString; 
        }
        System.out.print(reversedString);
    }
}