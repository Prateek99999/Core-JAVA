class Demo
{


void sum()
{
System.out.println("sum");
}

void replaceit(String str,char old,char new1)
{
System.out.println(str.replace(old,new1));
}

}
class Constructor
{
public static void main(String args[])
{
Demo d=new Demo();
d.sum();
String s="abbc";

d.replaceit(s,'a','c');

System.out.println("prateek".replace('e','o'));

}

}