import java.util.Scanner;
class Armstrong
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a no.");
int n=sc.nextInt();

int remainder;
int rev=0;
int a=n;

int d=0;

while(n!=0)
{
n=n/10;
d++;
}

int f=1;
int m=0;
while(n!=0)
{

remainder=n%10;
m+=(int)(Math.pow(remainder,d));
n=n/10;
f=m;
}

System.out.println(d+"::f");


if(a==m)
{
System.out.println(m+" is an Armstrong no.");
}
else
{
System.out.println(a+" is not an Armstrong no.");
}



}
}
