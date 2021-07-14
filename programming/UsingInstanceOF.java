class EMPLOYEE
{
}
class MANAGER extends EMPLOYEE
{
}
class DIRECTOR extends EMPLOYEE
{
}

class Check_instance
{
public void react(EMPLOYEE e)
{
if(e instanceof MANAGER)
{
System.out.println("This is Manager");
}
else if(e instanceof DIRECTOR){
System.out.println("This is Director");
}
else
{
System.out.println("This is Employee");
}
}
}

public class UsingInstanceOF
{
	public static void main(String[]args)
{
	Check_instance ue = new Check_instance();
	//EMPLOYEE ob = new EMPLOYEE();
	EMPLOYEE ob = new MANAGER();
	//EMPLOYEE ob = new DIRECTOR();
	ue.react(ob);
}
}