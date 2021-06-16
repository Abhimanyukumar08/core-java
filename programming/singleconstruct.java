import java.util.Scanner;
public class singleconstruct
{
public static void main(String[]args)
{
int age;
System.out.println("Enter the value");
Scanner sc = new Scanner(System.in);
age = sc.nextInt();
if(age>=18)
{
System.out.println("you are eligible for voting");
}
else
{
System.out.println("Not Eligible");
}
}
}