import java.util.Scanner;
class StringCompare
{
public static  void  main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("enter first string");
String  sa=sc.nextLine();

System.out.println("enter second string");
String  sb=sc.nextLine();

if(sa.compareTo(sb)>0)
System.out.println(sa+" is greater than "+sb);

else if(sa.compareTo(sb)<0)
System.out.println(sb+" is greater than "+sa);

else
System.out.println(sa+" is equal to "+sb);

}
}
