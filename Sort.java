import java.util.Scanner;
class Sort
{
public static void main(String args[])
{


int n=0;
Scanner sc=new Scanner(System.in);

System.out.println("enter array index");
n=sc.nextInt();

int a[]=new int [n];

System.out.println("enter array elements");

for(int i=0;i<n;i++)
a[i]=sc.nextInt();

int temp,i,j;

System.out.println("UnSorted array ::");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}

int m=0;
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(a[i]>a[j])
{
m=1;
temp=a[j];
a[j]=a[i];
a[i]=temp;
}
if(m==0)
break;
}
}

System.out.println("Sorted array ::");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}



}
}
