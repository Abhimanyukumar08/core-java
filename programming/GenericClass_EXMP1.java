class Box<T> {
 private T t;
 public void add(T t) {
 this.t = t;
 }
 public T get() {
 return t;
 }
}
public class GenericClass_EXMP1 {
 public static void main(String[] args) {
//type inference
Box<Integer> integerBox = new Box<>();
//unchecked conversion warning
Box<String> stringBox = new Box<String>();
integerBox.add(10);
stringBox.add("Hello World");
System.out.println("Integer Value :" + integerBox.get()); 
System.out.println("String Value :" + stringBox.get());
 }
}