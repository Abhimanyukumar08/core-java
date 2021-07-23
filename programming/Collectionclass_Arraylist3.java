import java.util.*;

public class Collectionclass_Arraylist3
{
public static void main(String[]args)
{
ArrayList<String> list = new ArrayList<String>();
list.add("Pizza");
list.add("burger");
list.add("coke");
list.add("Noodles");
//accessing the elements
System.out.println("Returning element: " +list.get(1));//it will return the 2nd element in the array
//changing the element 
list.set(2,"ice cream");
//traversing
for(String snacks:list)
{
System.out.println(snacks);
}
}
}


