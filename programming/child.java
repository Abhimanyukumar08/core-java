class parent_constructor_overriding
{
int a;
/*parent_constructor_overriding()
{
	System.out.println("Default Constructor");
}*/

// parametereised constructor
parent_constructor_overriding(int a)
{
this.a = a;
System.out.println("This is the parameterised constructor");
}


}
class child extends parent_constructor_overriding
{
child()
{
	//super();
	super(5);
	System.out.println("This is the child class condtructor");
}
public static void main(String[]args)
{
	child i = new child();
	
}
}

