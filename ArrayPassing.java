import java.util.Scanner;
class Demo
{
int sum=0;
int pass(int arr[])
{
for(int a: arr)
sum+=a;
return sum;
}

char[] conversion(String s)
{
char c[]=s.toCharArray();
return c;
}

}



class ArrayPassing
{
public static void main(String args[])
{
int a[]={1,2,3,4,5};

Demo d=new Demo();

System.out.println("sum of array elements is "+d.pass(a));

Demo d2=new Demo();

System.out.println("Again sum of array elements is "+d2.pass(new int[]{1,2}));

char c[]=d.conversion("Prateek Sahu");

for(char ch:c)
if(ch=='u')
System.out.print(ch);
else
System.out.print(ch+",");

n}
}