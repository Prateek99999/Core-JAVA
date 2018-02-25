class DemoCLA

{
public static void main(String args[])
{
int len=args.length;
int sum=0;

if(len==0)
System.out.println("no cla passed");


else
{

for(int i=0;i<len;i++)
{
System.out.println("args["+i+"] :"+args[i]);
sum=sum+Integer.parseInt(args[i]);
}

System.out.println("sum of args is "+sum);

System.out.println("Average of args is  "+(sum/len));


}




}}