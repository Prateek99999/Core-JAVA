import java.util.Scanner;
class Power
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
System.out.println("enter base no. ");
int b=sc.nextInt();

System.out.println("enter exponent ");

int e=sc.nextInt();

int c=1;

for(int i=1;i<=e;i++)
{
c=c*b;
}

System.out.println("power is"+c);

}

}
