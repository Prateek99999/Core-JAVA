class Demo
{
static int a;
static int b;

void set(int a,int b)
{
this.a=a;
this.b=b;
System.out.println(a+b);
}


Demo()
{
System.out.println(this);
}

Demo d2=new Demo();

void area()
{
System.out.println("area is :"+a*b);
}

}



class StaticDemo
{
public static void main(String args[])
{
Demo d=new Demo();
System.out.println(d);

System.out.println();
Demo dd=new Demo();
System.out.println(dd);


d.set(10,20);
d.a=5;
d.area();

}
}