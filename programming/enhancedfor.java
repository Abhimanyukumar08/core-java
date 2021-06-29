public class enhancedfor
{
	public static void main(String[]args)
{
	int []a = new int[10];
	for(int i=0;i<a.length;i++)
{
	a[i]=i+1;
}
	for(int p:a)
{
	System.out.println(p);
}
}
}