class varrArgument
{
	int sumArray(int... arrays)
{
	int sum = 0;
	for(int i:arrays)
{
	sum +=i;
}
	return(sum);
}
public static void main(String[]args)
{
	varrArgument va = new varrArgument();
	int total = va.sumArray(10,20,30,45,565,23,67);
	System.out.println("The sum of the number is " +total);
}
}
