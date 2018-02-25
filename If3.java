import java.util.Scanner;
class If3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter three no.s");
int i=sc.nextInt();
int j=sc.nextInt();
int k=sc.nextInt();

if(i>j)
{
if(i>k)
{System.out.println(i+" is greatest");
}
else
{System.out.println(k+" is greatest");
}
}

else
{
	if(j>k)
{
System.out.println(j+" is greatest");
}
	else
System.out.println(k+" is greatest");
}

}
}