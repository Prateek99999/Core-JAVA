import java.util.Scanner;
class Demo_prime
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);

System.out.println("enter a no.");

int n=sc.nextInt();
int m=0;

for(int i=2;i<=(n/2);i++)
{

if(n%i==0)
{m=1;
break;
}
}

if(m==1)
System.out.println("no. is not prime");

else if(m==0)
System.out.println("no. is prime");

}
}