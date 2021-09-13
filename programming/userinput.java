import java.util.Scanner;
import java.math.RoundingMode;
public class userinput
{
    public static void main(String[]args) {
        int N=23;
        if (N%2!=0)
        {
            System.out.println("Weird");
        }
        else if (N%2==0)
        {
            if (N>=2 && N<=5)
            {
                System.out.println("Not Weird");
            }
            else if (N>=6 && N<=20)
            {
                System.out.println("Weird");
            }
            else if (N>20)
            {
                System.out.println("Not Weird");
            }
        }
    }
}