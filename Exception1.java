class Exception1{
public static void main(String args[])
{
int a=10,b=0,c;
System.out.println("Program is Started");

try{
c=a/b;
System.out.println("C:"+c);
}
catch(Exception e)
{
System.out.println("Exception is occured ");
}
System.out.println("Program is ended");
}
}