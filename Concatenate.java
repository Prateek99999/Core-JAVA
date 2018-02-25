import java.util.Scanner;
class Concatenate
{
public static void  main(String args[])
{
Scanner sc=new Scanner(System.in);
String sa;
String sb;

System.out.println("enter  first string");
sa=sc.nextLine();

System.out.println("enter  second string");
sb=sc.nextLine();

int l=sb.length();
int p=sa.length();


{
for(int j=0;j<p;j++)
{
int i=l+p;
sb[i]=sa[j];
}
}

System.out.println(sb);

}
}