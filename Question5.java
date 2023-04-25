import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);

    //System.out.print("Enter the number of integers: ");
    int numIntegers = in.nextInt();

    int[] integers = new int[numIntegers];
    int maxCount = 0;
    int mode = 0;

    for (int i = 0; i < numIntegers; i++) 
    {
        //System.out.print("Enter integer #" + (i+1) + ": ");
        integers[i] = in.nextInt();
    }
        
    for (int i = 0; i < numIntegers; i++) 
    {
        int count = 0;
        for (int j = 0; j < numIntegers; j++) 
        {
            if (integers[j] == integers[i]) 
            {
                count++;
            }
        }
        if (count > maxCount) 
        {
            maxCount = count;
            mode = integers[i];
        }
    }
    System.out.println(mode);
  }
}
