class CLA
{

public static void main(String args[])
{
int sum=0;
int l=args.length;

if(l==0)
System.out.println("no cla passed");

else
{
System.out.println("cla passed are :");
for(int i=0;i<l;i++)

{

System.out.println(args[i]);

}
System.out.println(sum);
}
}
}