class x implements Runnable
{
public void run()
{
for(int i=0;i<5;i++)
{
try
{
Thread.sleep(6000);//pause for 6 secs
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
System.out.println(Thread.currentThread()+" Value "+i);
}
}
}
class Thread_sleepExmaple
{
public static void main(String[]args)
{
x i = new x();
Thread t1 = new Thread(i,"1st");
x p = new x();
Thread t2  = new Thread(p,"2nd");
t1.start();
t2.start();
}
}
