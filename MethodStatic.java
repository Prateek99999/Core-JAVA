class Demo
{
static int x;
static int y;

static void print(int a,int b)
{
x=a;
y=b;
System.out.println(a+b);
}


} 

class MethodStatic
{
public static void main(String args[])
{
Demo.print(10,2);
Demo.x=20;.
System.out.println(Demo.x);
}

}