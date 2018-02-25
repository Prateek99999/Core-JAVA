import java.util.Scanner;
class If4
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int len=args.length;

if(len==0)
System.out.println("no args passd");

else
{

System.out.println("entered three no.s as cmmnd line arguments are :: ");
int i=Integer.parseInt(args[0]);
int j=Integer.parseInt(args[1]);
int k=Integer.parseInt(args[2]);

System.out.println(i+" "+j+" "+k);

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
}