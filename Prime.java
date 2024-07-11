class Prime{
public static void main(String args[])
{
int i;
int arr[]={97,12,18,13};
System.out.println("Composite numbers are:");
for(i=0;i<4;i++){
if(arr[i]%2==0||arr[i]%3==0||arr[i]%5==0|arr[i]%7==0)
{
System.out.println(arr[i]);
}

}
System.out.println("Prime numbers are:");
for(i=0;i<4;i++){
if(arr[i]%2!=0 && arr[i]%3!=0 && arr[i]%5!=0 && arr[i]%7!=0)
{
System.out.println(arr[i]);
}

}


}
}