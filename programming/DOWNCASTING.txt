class Employee 
{
	public void work()
{
	System.out.println("I am a Employee");
}
}
class Manager extends Employee
{
	public void work()
{
	super.work();
	System.out.println("I am a Manager");
}
	public void manage()
{
	System.out.println("Managing..........");
}
}
class DOWNCASTING
{
	public static void main(String[]args)
{
	Employee em = new Manager();
	em.work();
	//here if we call manage function we will get error as it is not a common function in both parent and child class , 
	//so we have to create an object of the manager class;
	Manager m  = (Manager)em;
	m.manage();
}
}
