public class copyarray
{
	public static void main(String[]args)
{
	int[] a = {1,2,3,4,5,6};
	int[] b = {10,20,30,40,50,80,70,90};
	System.arraycopy(a,1,b,2,a.length-1);
	for(int p:b)
{
	System.out.println(p);
}
}
}