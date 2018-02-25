import java.util.Scanner;
class DemoHcf 
{

public static void  main(String args[])

{

Scanner sc=new Scanner(System.in);

System.out.println("enter three no.s");

int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();



int t=(a>b)?((a>c)?a:c):((b>c)?b:c);

System.out.println("greatest among three is "+t);
}
}