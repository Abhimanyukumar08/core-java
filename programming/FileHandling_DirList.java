import java.io.*;

class FileHandling_DirList
{
public static void main(String ss[])
{
String dir = "E:\\july24dir";
File f1 = new File(dir);
if(f1.isDirectory())
{
System.out.println(" Directories of " +dir+" are: ");
System.out.println("*******************************");
String s[] = f1.list();
for(int i=0;i<s.length;i++)
{
File f = new File(dir+"/"+s[i]);
if(f.isDirectory())
{
System.out.println(s[i] + " is a Directory");
}
else
{
System.out.println(s[i]+" is a File");
}
}
}
else
{
System.out.println(dir+" is not a directory");
}
}
}

