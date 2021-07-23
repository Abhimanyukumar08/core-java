import java.util.*;

public class Collectionclass_LinkedList2
{

public static void main(String[]args)
{
LinkedList<String> ll = new LinkedList<String>();
ll.add("Aman");
ll.add("Amar");
ll.add("Akash");
ll.add("keshav");
ll.add("gourav");
ll.add("sourav");
ll.add("ketan");
ll.add("sharukh");
ll.add("naman");
ll.add("dhruv");
ll.add("Akash");
ll.add("king");
ll.add("gourav");
System.out.println("Initial list is" +ll);
ll.remove("Amar");
System.out.println("After invoking the remove(object) method: " +ll);
ll.remove(5);
System.out.println("After invoking the remove(index) method: " +ll);

System.out.println("\n\n\n===============================");

LinkedList<String> ll2 = new LinkedList<String>();
ll2.add("Abhinav");
ll2.add("Avishek");
ll2.add("Rittick");

//adding element to arra
ll.addAll(ll2);
System.out.println("updated lsit " +ll);

System.out.println("s######################");
ll.removeAll(ll2);
System.out.println("After invoking removeAll() method: " +ll);

System.out.println("-----------------------");

ll.removeFirst();
System.out.println("After invoking removeFirst() method: " +ll);
ll.removeLast();
System.out.println("After invoking removeLast() method: " +ll);

System.out.println("-----------------------");

ll.removeFirstOccurrence("gourav");
System.out.println("After invoking removeFirstOccurrrence() method: " +ll);
ll.removeLastOccurrence("Akash");
System.out.println("After invoking removeLastoccer() method: " +ll);


System.out.println("-----------------------");
ll.clear();
System.out.println("After invoking clear() method: " +ll);
}
}
