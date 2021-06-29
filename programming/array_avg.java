import java.util.Scanner;
public class array_avg
{
	public static void main(String[]args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the length of the array");
	int l = sc.nextInt();
	int arr[] = new int[l];
	System.out.println("enter the elements");
	for(int i=0;i<l;i++)
{
	arr[i]=sc.nextInt();
}
	System.out.print("the array is ");
	int sum = 0;
	for(int i=0;i<l;i++)
{
	System.out.print(arr[i]+ " ");
	sum = sum +arr[i];

}
	System.out.println("");
	float avg = sum/l;
	System.out.print("the sum of the array is " +sum+ " and the average is " +avg);
	
}
}
