import java.util.*;
class Exception2{
public static void main(String args[])
{
    System.out.println("program is started");

    int arr[]=new int[5];
    int div;
    int res[]=new int[5];
Scanner sc=new Scanner(System.in);
System.out.println("Enter the 5 dividend ");
for(int i=0;i<5;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("Enter the divisor ");
div=sc.nextInt();

try {
    for(int i=0;i<5;i++)
{
res[i]=arr[i]%div;
}
System.out.println("Result:");
for(int i=0;i<5;i++)
{
    System.out.println(res[i]);
}
} catch (Exception e) {
    
    System.out.println("Exception is occured");

}
System.out.println("program is ended");

}
}