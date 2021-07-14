public class ExceptionTest
{
public static void main(String[]args)
{
	try{
	int a[] = {10,20,30};
	//this will show exception
	//System.out.println("Acess element :" +a[8]);
	//without exception
	System.out.println("Acess element :" +a[2]);
	}
	//if you don't know which type of exception is to define then simply write exception
	// remove getMessage statment
	///catch(Exception e)///
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Exception thrown :"+ e.getMessage());
	}
	finally{
	System.out.println("OUT OF THE BLOCK");
	}
}
}
