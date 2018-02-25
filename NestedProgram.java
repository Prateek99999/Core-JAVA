class Outer
{
static class A
{
static void show()
{
System.out.println("show");
}
}

void call()
{
System.out.println("call");
}
}

class NestedProgram
{
public static void main(String args[])
{
Outer.A.show();
Outer.A obj=new Outer.A();

obj.show();

}
}
