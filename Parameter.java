class Demo
{
Demo(Parameter p)
{
p.a=10;
p.b=20;
System.out.println(p.a+p.b);
}

}


class Parameter
{
public static void main(String args[])
{
int a,b;
Parameter p=new Parameter();
new Demo(p);

}
}