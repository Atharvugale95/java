import java.io.*;
import java.util.*;
class CreateFile{
public static void main(String args[])
{
 File f=new File("D:\\126\\File_handling.txt");
try{
if(f.createNewFile())
{
System.out.println("File is created successfully");
}
else
{
System.out.println("Fille is already exist");
}

FileWriter F=new FileWriter("File_handling.txt");
F.write("Hello everyone I am Babu Yadav .\ndewpigfjergfpsjpwsjf");

F.close();

Scanner Reader= new Scanner(f);
while(Reader.hasNextLine())
{
String data = Reader.nextLine();
System.out.println(data);
}
Reader.close();
if(f.delete())
{
System.out.println(" file is Deleted successfully");
}
else
{
System.out.println("file can't be deleted");
}
}
catch(java.lang.Exception e){
System.out.println("Exception is occured");
}


}
}