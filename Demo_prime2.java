import java.util.Scanner;
class Demo_prime2
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
System.out.println("enter two no.s(interval) :: ");

//long long a=10;
System.out.println(a);
int low=sc.nextInt();
int high=sc.nextInt();

if(low>high)
{
int temp=low;
low=high;
high=temp;
}


while(low<high)
{
int m=0;

for(int i=2;i<=(low/2);i++)
{
if(low%i==0)
{
m=1;
break;
}

}

if(m==0)
System.out.println(low);
low++;
}

}
}