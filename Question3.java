import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);

    // System.out.print("Enter an integer: ");
    int number = in.nextInt();

    int result = number * number;

    System.out.println(number + " and " + result);
  }
}
