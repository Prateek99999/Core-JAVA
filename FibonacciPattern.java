import java.util.Scanner;
class FibonacciPattern
{
public  static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter no. of rows");
int n=sc.nextInt();


int a=0;
int b=1;



for(int i=0;i<n;i++)
{
for(int j=0;j<=i;j++)
{
if(i==0)
System.out.print(a+" ");

else
{
System.out.print(b+" ");
int t=b;
b=a+b;
a=t;

}

}
System.out.println();
}

}}