import java.io.*;
public class FileHandling_CREATFile
{
public static void main(String[]args)
{
try
{
File file = new File("E:\\july24dir\\demo.txt");

//create file if it does not exist

boolean success = file.createNewFile();
if(success){
System.out.print("File created");
}
else
{
System.out.println("File Exist");
}}
catch(IOException e)
{
System.out.println(e);
}
}
}

