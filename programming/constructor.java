class constructor
{
int x; //member variable
constructor()
{
int a = 5;
System.out.println("default constructor" + a);
//default constructor 
}
constructor(int i)
{
int a = i;
System.out.println("parameterised constructor" + a);
//parameterised constructor
}
public static void main(String[]args)
{
constructor i=new constructor();
constructor j=new constructor(20);
}
}

