import java.io.*;

public class FileHandling_WriteFile
{
public static void main(String[]args)throws IOException
{
String text = "Creating a java file , come and enjoy";
File file = new File("E:\\july24dir\\demo.txt");
Writer output = new BufferedWriter(new FileWriter(file));
output.write(text);
output.close();
System.out.println("You file has been written");
}
}

