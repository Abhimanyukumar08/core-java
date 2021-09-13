import java.io.*;
public class FileHandling_CREATINGFILE
{
public static void main(String[]args)
{

//creating a directory ; all ancestor must exist
boolean success = (new File("E:\\july24dir")).mkdir();
if(!success){
System.out.println("Directory not creatded");
}
else{
System.out.println("Directory Created");
}       
}
}