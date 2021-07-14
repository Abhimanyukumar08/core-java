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
}
class Worker extends Employee
{
	public void work()
{
	System.out.println("I am a Worker");
}
}
class UPCASTING
{
	public static void main(String[]args)
{
	Employee em= new Employee();
	Employee s = new Employee();
	Manager m = new Manager();
	Worker w = new Worker();
	em=m;
	s=w;
	em.work();
	s.work();
}
}
