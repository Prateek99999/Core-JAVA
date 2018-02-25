class Demo
{
Demo(int a)
{
this(1,2);
System.out.println("int");

}

Demo(int a,int b)
{
this(205.4);
System.out.println("int ,int");
}

Demo(double c)
{

System.out.println("double");
}

}



class StaticDemo2
{
public static void main(String args[])
{
Demo d=new Demo(2);
System.out.println(d);

}
}