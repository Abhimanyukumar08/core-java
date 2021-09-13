import java.io.*;

public class FileHandling_DeletingFile
{
public static void main(String[]args)
{
try
{
File f1 = new File("F:\\arushi\\isometric\\5.pdf");
boolean success = f1.delete();
if(!success){
System.out.println("Not Deleted");
}
else{
System.out.println("File Deleted");
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}
