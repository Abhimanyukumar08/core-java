import java.io.*;

public class FileHandling_MoveFile
{
public static void main(String[]args)
{
//File/Directory to be moved
File file = new File("F:\\Core Java\\home work 1.docx");
//Destination directory
File dir = new File("E:\\july24dir");

//Move File TO NEW DIRECTORY

boolean success = file.renameTo(new File(dir,file.getName()));
if(!success)
{
System.out.println("NOT MOVED");
}
else
{
System.out.println("MOVED");
}
}
}
