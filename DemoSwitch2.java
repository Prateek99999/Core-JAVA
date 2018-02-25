import java.util.Scanner;
class DemoSwitch2
{
public  static void main(String args[])throws Exception
{
Scanner sc=new Scanner(System.in);

System.out.println("enter ur choice");
System.out.println("airline :: bus ::car ::ship ::train");
String s=sc.next();
switch(s.toLowerCase())
{

case "airline":
System.out.println("airline");
break;

case "bus":
System.out.println("bus");
break;

case "car":
System.out.println("car");
break;

case "ship":
System.out.println("ship");
break;

case "train":
System.out.println("train");
break;

default:
System.out.println("Invalid choice");
}

}
}