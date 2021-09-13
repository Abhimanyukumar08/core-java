import java.io.*;

public class FileHandling_RenameFile
{
public static void main(String[]args)
{
File file = new File("E:\\july24dir\\demo.txt");
File file2 = new File("E:\\july24dir\\mydemo.txt");

boolean success = file.renameTo(file2);
if(!success)
{
System.out.println("NOT RENAMED");
}
if(success)
{
System.out.println("RENAMED");
}
}
}
