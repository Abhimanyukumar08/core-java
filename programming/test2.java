class Animal
{
	void WhoAmI()
{
	System.out.println("generic animal");
}
}
class Dog extends Animal
{
	void WhoAmI()
{
	super.WhoAmI();
	System.out.println("Dog");
}
}
class Cow extends Animal{
void WhoAmI()
{
	System.out.println("COW");
}
}
class Snake extends Animal
{
	void WhoAmI()
{
	System.out.println("snake");
}
}
public class test2
{
	public static void main(String[]args)
{
	Animal[] ref1 = new Animal[3];
	ref1[0] = new Dog();
	ref1[1] = new Cow();
	ref1[2] = new Snake();
	ref1[0].WhoAmI();
	ref1[1].WhoAmI();
	ref1[2].WhoAmI();
}
}