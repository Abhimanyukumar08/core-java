class userDefine_Exception
{
static void validate(int age)
{
if(age<18)
{
throw new ArithmeticException("not valid");
}
else{
System.out.println("Welcome to vote");
}
}
public static void main(String[]args)
{
	validate(12);
	System.out.println("rest of code");
}
}
