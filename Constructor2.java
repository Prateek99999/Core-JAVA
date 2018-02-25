class Demo
{


void sum()
{
System.out.println("sum");
}

Demo(String str,char old,char new1)
{
System.out.println(str.replace(old,new1));
}

}
class Constructor2
{
public static void main(String args[])
{
String s="abbc";
Demo d=new Demo(s,'a','c');
d.sum();
System.out.println("prateek".replace('e','o'));

}

}