import java.io.*;

public class FileHandling_DeleteDir
{
public static void main(String[]args)
{
boolean success = (new File("E:\\july24dir")).delete();
if(success)
{
System.out.println("Deleted");
}
else{
System.out.println("Not Deleted");
}
}
}
