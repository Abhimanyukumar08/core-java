import java.io.*;

public class FileHandling_ReadFile
{
public static void main(String[]args)
{
try
{
//Locatoin of the file that we are going to read
FileInputStream read= new FileInputStream("E:\\july24dir\\demo.txt");
//Get the object of DataInputStream
DataInputStream in = new DataInputStream(read);
BufferedReader br = new BufferedReader(new InputStreamReader(in));
String strLine;
//Read file line by line
while((strLine = br.readLine()) !=null)
{
System.out.println(strLine);
}
//Close the inputstream
in.close();
}
catch(Exception e)
{
System.out.println(e);
}

}
}
