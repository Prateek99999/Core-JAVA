import java.util.Scanner;
class Fibonacci2
{
public  static void main(String args[])
{
System.out.println("enter no. of terms");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();


int a=0;
int b=1;

if(n==1)
{
System.out.print(a+" ");
System.out.println();
}

if(n==2)
{
System.out.print(a+" ");
System.out.print(b+" ");
System.out.println();
}

else
{
System.out.print(a+" ");
System.out.print(b+" ");

for(int i=3;i<=n;i++)
{
int t=b;
b=a+b;
a=t;
System.out.print(b+" ");
}
}

}
}