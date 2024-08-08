import java.util.*;
interface Client{
void put();
void get();

}
class Interface implements Client{
String name;
int balance;
double mob_no;
String city;
Scanner sc=new Scanner(System.in); 
public void put(){
System.out.println("enter the name");
name=sc.next();

System.out.println("enter the balance ");
balance=sc.nextInt();


System.out.println("enter the Moblie no");
mob_no=sc.nextDouble();


System.out.println("enter the city");
city=sc.next();

} 
public void get()
{
System.out.println("Name:"+name);
System.out.println("Balance:"+balance);
System.out.println("Moblie No:"+mob_no);
System.out.println("City:"+city);

}
public static void main(String args[])
{
Client C1=new Interface();
C1.put();
C1.get();

}

}
