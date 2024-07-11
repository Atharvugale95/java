class Number{
public static void main(String args[])
{
int i;
int arr[]={2,3,6,7,1};
System.out.println("Even numbers are:");
for(i=0;i<5;i++)
{
if(arr[i]%2==0)
{
 System.out.println(arr[i]);
}
}

System.out.println("Odd numbers are:");
for(i=0;i<5;i++)
{
if(arr[i]%2!=0)
{
 System.out.println(arr[i]);
}
}

}
}