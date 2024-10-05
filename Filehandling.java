import java.io.*;
class Filehandling{
public static void main(String args[])
{
File f=new File("D:\\126\\abc.txt");
try{
if(f.createNewFile())
{
System.out.println("File is created successfully");
}
else{
System.out.println("file is already exist");
}

FileReader fr= new FileReader(f);
BufferedReader br= new BufferedReader(fr);
 String data;
while((data=br.readLine())!=null)
{
System.out.println(data);
}
br.close();
fr.close();

}
catch(java.lang.Exception e){
System.out.println("An error is occured");
}
}

}