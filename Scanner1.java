import java.util.Scanner;
class Scanner1{
public static void main(String args[])
{
int a,b,sum,sub,product;
float div;
 Scanner sc=new Scanner(System.in);

System.out.println("Enter the 1st number ");
a=sc.nextInt();
System.out.println("Enter the 2nd number ");
b=sc.nextInt();
sum=a+b;
sub=a-b;
product=a*b;
div=a/b;
System.out.println("Addition");
System.out.println(sum);
System.out.println("Subtraction");
System.out.println(sub);
System.out.println("Multiplication");
System.out.println(product);
System.out.println("Division");
System.out.println(div);
}}