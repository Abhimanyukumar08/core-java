public class matirx
{
	public static void main(String[]args)
{
	int[][] mat=
	{
	{2,3,4},
	{5,8,10}
	};
	int sum = 0;
	for(int i=0;i<2;i++)
{
	for(int j=0;j<3;j++)
{
	sum = sum + mat[i][j];
}
	System.out.println(sum);
	sum = 0;
}	
}
}
