import java.util.Scanner;
class Emp_info{
 int num[]=new int[5] ;
 String name[]=new String[5] ;
 String emp_id[]=new String[5];
int salary[]=new int[5];
 
void put()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the names of 5 employee");
	for(int i=1;i<=5;i++)
	{
		name[i]=sc.next();
	}
	System.out.println("Enter the moblie number  of 5 employee");
	for(int i=0;i<5;i++)
	{
		num[i]=sc.nextInt();
	}
	System.out.println("Enter the employee id of 5 employee");
	for(int i=0;i<5;i++)
	{
		emp_id[i]=sc.next();
	}
	System.out.println("Enter the salary of 5 employee");
	for(int i=0;i<5;i++)
	{
		salary[i]=sc.nextInt();
	}

} 
void get()
{
for(int i=1;i<=5;i++){
	System.out.println("--------------"+"For Employee"+i+"--------------");
	 System.out.println("Name:"+ name[i]);
 	 System.out.println("Moblie No:"+ num[i]);
	 System.out.println("Employee id:"+ emp_id[i]);
	  System.out.println("Salary:"+ salary[i]);
}
}
}
class Inform{
public static void main(String args[]){
Emp_info E= new Emp_info();
E.put();
E.get();
}
}