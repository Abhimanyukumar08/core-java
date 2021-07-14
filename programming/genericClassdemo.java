class genericClassdemo<T>{
private T t;
public void setValue(T t)
{
this.t =t;
}
public T getValue()
{
return t;
}
public static void main(String[]args)
{
genericClassdemo<Integer> obj = new genericClassdemo<Integer>();
obj.setValue(10);
System.out.println(obj.getValue());

genericClassdemo<String> sbj = new genericClassdemo<String>();
sbj.setValue("sdsa");
System.out.println(sbj.getValue());
}
}

