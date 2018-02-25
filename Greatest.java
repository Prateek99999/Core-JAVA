import java.util.Scanner;
class Greatest 
{

public static void  main(String args[])throws Exception

{

Scanner sc=new Scanner(System.in);

System.out.println("enter a character");
System.out.println(Math.sqrt(4));
int d=System.in.read();
System.out.println("enter three no.s");


System.out.println(d);

int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();



int t=(a>b)?((a>c)?a:c):((b>c)?b:c);

System.out.println("greatest among three is "+t);
}
}