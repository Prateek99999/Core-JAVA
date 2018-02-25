import java.util.Scanner;
class DemoFibonnci
{
public static void  main(String args[])
{
Scanner sc=new Scanner(System.in);

int i=0,j=1;


System.out.println("enter the index upto which u wanna print fibonacci series");
int n=sc.nextInt();

if(n==1)
{
System.out.println("fibonaci series:");
System.out.print(i);
}

if(n==2)
{
System.out.println("fibonaci series:");
System.out.print(i);
System.out.print(" "+j);
}

if(n>2)
{
System.out.println("fibonaci series:");
System.out.print(i);
System.out.print(" "+j);


for(int k=3;k<=n;k++)
{
int c=i+j;

System.out.print(" "+c);

i=j;
j=c;

}
}


}}