class mythread implements Runnable
{
public void run()
{
System.out.println("Hello");
}
}

class Thred
{
public static void main(String[]args)
{
mythread m=new mythread();
Thread t=new Thread(m);
t.start();
}
}
