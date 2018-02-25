import java.util.Scanner;
class DemoSwitch
{
public  static void main(String args[])throws Exception
{
Scanner sc=new Scanner(System.in);
System.out.println("enter ur choice");
System.out.println("a:airline b:bus c:car s:ship ");
char i=(char)System.in.read();
switch(i)
{
case 'a':
case 'A':
System.out.println("airline");
break;

case 's':
case 'S':
System.out.println("ship");
break;

case 'b':
case 'B':
System.out.println("bus");
break;

case 'c':
case 'C':
System.out.println("car");
break;

default:
System.out.println("Invalid choice");
}
}
}