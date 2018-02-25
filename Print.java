class Demo{
int a;
int b;
}

class Print
{
public static void main(String args[])
{
Demo d=new Demo();

//System.out.println(Print);
System.out.println(d);
System.out.println(d.a);
System.out.println(d.b);

d.a=10;
d.b=20;
System.out.println(d.a+d.b);
}}