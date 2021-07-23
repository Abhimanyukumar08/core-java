import java.util.Arrays;
import java.util.List;

public class wildcard
{
public static double sum(List<? extends Number> numberlist){
double sum = 0.0;
for(Number n : numberlist)
sum += n.doubleValue();
return sum;
}


public static void main(String args[]){
List<Integer> integerlist = Arrays.asList(1,2,3,4);
System.out.println("sum = " + sum(integerlist));

List<Double> doublelist = Arrays.asList(2.4,1.4,5.5,3.0);
System.out.println("sum = " +sum(doublelist));
}
}

