import java.util.*
class Company{
string n;
string a;
double r;


Company(String name,double revenue,String Add)
{
n=name;
r=revenue;
a=add;
}
void get(){
System.out.println("Name of company:"+n);
System.out.println("Revenue of company:"+r);
System.out.println("Address of company:"+a);
}

}
class Info_Company{

public static void main(String args[])
{
Company C1=new Company("Atharv Industries",45000000,"Ichalkaranji");

}}