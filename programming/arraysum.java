public class arraysum 
{
	public static void main(String[]args)
{
	int[] arr = new int[]{10,20,43,45,76};
	int sum = 0;
	for(int i=0;i<arr.length;i++)
{
	sum = sum +arr[i];
}
	System.out.println("The sum of all the element of the array is " +sum);
}
}
	