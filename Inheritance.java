import java.util.*;

class Person{
Scanner sc=new Scanner(System.in);

String name;
String add;
int birth_day;
int birth_month;
int birth_year;
int height;
void input()
{
Scanner sc=new Scanner(System.in);

System.out.println("enter the name");
name=sc.next();
System.out.println("enter the address");
add=sc.next();
System.out.println("enter the birth day");
birth_day=sc.nextInt();
System.out.println("enter the birth month");
birth_month=sc.nextInt();
System.out.println("enter the birth year");
birth_year=sc.nextInt();
}
void calculate_age(int current_day,int current_month,int current_year)
{
int cal_date=current_day-birth_day;
int cal_month=current_month-birth_month;
int cal_year=current_year-birth_year;
System.out.println("Year:"+cal_year+"Month:"+cal_month+"Day:"+cal_date);
}
}
class Student extends Person{
String roll_no;
int n;
int []marks=new int [n];
void input1(){
Scanner sc=new Scanner(System.in);
System.out.println("enter the roll no");
roll_no=sc.next();

System.out.println("enter the marks");

for(int i=0;i<n;i++)
{
marks[i]=sc.nextInt();
}
}

void calculate_avg(){
int sum=0;
float avg;
for(int i=0;i<5;i++)
{
 sum=sum+marks[i];
}
 avg=sum/5;
System.out.println("Avearage:"+avg);
}
}
class Employee extends Person{
Scanner sc=new Scanner(System.in);

String empid;
int salary;
void input2()
{
System.out.println("enter the emp id");
empid=sc.next();
System.out.println("enter the salary");
salary=sc.nextInt();

}
void Calculate_tax()
{
int tax=(salary*15)/100;
System.out.println("Tax:"+tax);
}

}
class Inheritance{
public static void main(String args[])
{
Student s1=new Student();
s1.input();
s1.calculate_age(21,8,2024);
s1.input1();
s1.calculate_avg();

}
}